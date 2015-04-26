
import java.io.IOException;
import java.security.SecureClassLoader;
import java.util.*;
import javax.tools.*;
import javax.tools.JavaFileObject.Kind;

class ClassFileManager extends ForwardingJavaFileManager<JavaFileManager> {

	public ClassFileManager(JavaCompiler compiler, DiagnosticListener<? super JavaFileObject> listener) {
		super(compiler.getStandardFileManager(listener, null, null));
	}

	/** 繧ｭ繝ｼ�ｼ壹け繝ｩ繧ｹ蜷阪�∝�､�ｼ壹け繝ｩ繧ｹ繝輔ぃ繧､繝ｫ縺ｮ繧ｪ繝悶ず繧ｧ繧ｯ繝� */
	protected final Map<String, JavaClassObject> map = new HashMap<String, JavaClassObject>();

	// 繧ｯ繝ｩ繧ｹ繝輔ぃ繧､繝ｫ繧堤函謌舌☆繧九→縺阪↓蜻ｼ縺ｰ繧後ｋ
	@Override
	public JavaFileObject getJavaFileForOutput(Location location, String className, Kind kind, FileObject sibling) throws IOException {
		JavaClassObject co = new JavaClassObject(className, kind);
		map.put(className, co); // 繧ｯ繝ｩ繧ｹ蜷阪ｒ繧ｭ繝ｼ縺ｫ縺励※繝輔ぃ繧､繝ｫ繧ｪ繝悶ず繧ｧ繧ｯ繝医ｒ菫晄戟縺励※縺翫￥
		return co;
	}

	protected ClassLoader loader = null;

	@Override
	public ClassLoader getClassLoader(Location location) {
		if (loader == null) {
			loader = new Loader();
		}
		return loader;
	}

	/** 繧ｳ繝ｳ繝代う繝ｫ縺励◆繧ｯ繝ｩ繧ｹ繧定ｿ斐☆轤ｺ縺ｮ繧ｯ繝ｩ繧ｹ繝ｭ繝ｼ繝�繝ｼ */
	private class Loader extends SecureClassLoader {

		@Override
		protected Class<?> findClass(String name) throws ClassNotFoundException {
			JavaClassObject co = map.get(name);
			if (co == null) {
				return super.findClass(name);
			}

			Class<?> c = co.getDefinedClass();
			if (c == null) {
				byte[] b = co.getBytes();
				c = super.defineClass(name, b, 0, b.length);
				co.setDefinedClass(c);
			}
			return c;
		}
	}
}