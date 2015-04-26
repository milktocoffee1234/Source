

import java.net.URI;

import javax.tools.SimpleJavaFileObject;

/**
 * 隴�ｿｽ�ｽｭ諤懶ｿｽ邵ｺ�ｽｫ隴ｬ�ｽｼ驍城亂�ｼ�郢ｧ蠕娯螺郢ｧ�ｽｽ郢晢ｽｼ郢ｧ�ｽｹ郢ｧ螳夲ｽ｡�ｽｨ邵ｺ蜷ｶ笳�郢ｧ竏壺�楢抄�ｽｿ騾包ｽｨ邵ｺ蜷ｶ�ｽ狗ｹ晁ｼ斐＜郢ｧ�ｽ､郢晢ｽｫ郢ｧ�ｽｪ郢晄じ縺夂ｹｧ�ｽｧ郢ｧ�ｽｯ郢晏現�ｿｽ
 * 
 * @see javax.tools.JavaCompiler
 */
class JavaSourceFromString extends SimpleJavaFileObject {
	protected final String code;

	/**
	 * 隴�ｽｰ邵ｺ蜉ｱ�ｼ� JavaSourceFromString 郢ｧ蜻茨ｽｧ迢暦ｽｯ蟲ｨ�ｿｽ
	 * 
	 * @param name
	 *	邵ｺ阮呻ｿｽ郢晁ｼ斐＜郢ｧ�ｽ､郢晢ｽｫ郢ｧ�ｽｪ郢晄じ縺夂ｹｧ�ｽｧ郢ｧ�ｽｯ郢晏現縲帝勗�ｽｨ邵ｺ霈費ｽ檎ｹｧ荵昴＆郢晢ｽｳ郢昜ｻ｣縺�郢晢ｽｫ郢晢ｽｦ郢昜ｹ昴Ε郢晏現�ｿｽ郢ｧ�ｽｯ郢晢ｽｩ郢ｧ�ｽｹ陷ｷ謳ｾ�ｽｼ�ｿｽQCN�ｿｽ�ｿｽ	 * @param code
	 *	邵ｺ阮呻ｿｽ郢晁ｼ斐＜郢ｧ�ｽ､郢晢ｽｫ郢ｧ�ｽｪ郢晄じ縺夂ｹｧ�ｽｧ郢ｧ�ｽｯ郢晏現縲帝勗�ｽｨ邵ｺ霈費ｽ檎ｹｧ荵昴＆郢晢ｽｳ郢昜ｻ｣縺�郢晢ｽｫ郢晢ｽｦ郢昜ｹ昴Ε郢晏現�ｿｽ郢ｧ�ｽｽ郢晢ｽｼ郢ｧ�ｽｹ郢ｧ�ｽｳ郢晢ｽｼ郢晢ｿｽ	 */
	public JavaSourceFromString(String name, String code) {
		super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
		this.code = code;
	}

	@Override
	public CharSequence getCharContent(boolean ignoreEncodingErrors) {
		return code;
	}
}
