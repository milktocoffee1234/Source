


import java.io.*;
import java.net.URI;
import javax.tools.SimpleJavaFileObject;

class JavaClassObject extends SimpleJavaFileObject {

	public JavaClassObject(String name, Kind kind) {
		super(URI.create("string:///" + name.replace('.', '/') + kind.extension), kind);
	}

	protected final ByteArrayOutputStream bos = new ByteArrayOutputStream();

	// 螳滄圀縺ｮ蜃ｺ蜉帷畑繧ｹ繝医Μ繝ｼ繝�繧定ｿ斐☆
	@Override
	public OutputStream openOutputStream() throws IOException {
		return bos;
	}

	// 繧ｳ繝ｳ繝代う繝ｫ縺輔ｌ縺溘ヰ繧､繝医さ繝ｼ繝�
	public byte[] getBytes() {
		return bos.toByteArray();
	}

	/** 繝ｭ繝ｼ繝峨＆繧後◆繧ｯ繝ｩ繧ｹ */
	private Class<?> clazz = null;

	public void setDefinedClass(Class<?> c) {
		clazz = c;
	}

	public Class<?> getDefinedClass() {
		return clazz;
	}
}
