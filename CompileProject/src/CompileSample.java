import List.TestList;

public class CompileSample {
	private static String className = null;
	private static String source = "";
	public static void main(String[] args) throws Exception {
		String str =  "import List.TestList;import java.util.ArrayList;\nimport java.util.List;\npublic class ArrayTest{\n	public static void main(String[] args){\n	" +
				"	ArrayList<Integer> list = new ArrayList<Integer>();\n		list.add(2);\n		list.add(3);\n		list.add(2);\n		TestList.list.add(\"ikinari\");\n		System.out.println(TestList.list.get(0));\n	}\n}\n";
		//String str = "import java.util.ArrayList;\n\npublic class ArrayTest2{\n	public static void main(String[] args){\n		ArrayList<Integer> list1 =new ArrayList<Integer>();\n		ArrayList<Integer> list2;\n		list2 = new ArrayList<Integer>();\n		\n		list1.add(1);\n		list2.add(2);\n		list1.add(3);\n		list2.add(4);\n		list1.get(4);\n	}\n}";
		//String str = "\npublic class Main {\n	public static void main(String[] args){\n		Cup cup = new Cup();\n		cup.add(2);\n		cup.add(5);\n		cup.add(10);\n		\n		System.out.println(cup.get(5));\n	}\n}\n";
		
		String[] strs = str.split("\n");
		for(String s : strs){
			source += s + "\n";
		}
		match();
		
		CompileExecute ce = new CompileExecute(className,source);
		Class<?> clazz = ce.compile();
		if(clazz != null){
			ce.execute(clazz);
		}
		
		ErrorManager em = new ErrorManager(source,ce.getError());
		System.out.println();
		if(ce.getErrorLine() != 0){
			em.searchError(ce.getErrorLine());
			em.judge(ce.getError());
		}
		
	}
	public static void match(){
		PatternMatch matcher1 = new PatternMatch("(class\\s)(\\w+)",source);
		matcher1.setGroupNumber(2);
		className = matcher1.match();		
		PatternMatch matcher2 = new PatternMatch("import java.util.ArrayList;",source);
		System.out.println(matcher2.match());
		PatternMatch matcher3 = new PatternMatch("(ArrayList<\\w+>\\s)(\\w+)",source);
		System.out.println(matcher3.match());
		matcher3.setGroupNumber(2);
		PatternMatch matcher4 = new PatternMatch(matcher3.match() + "\\s*=\\s*new\\s*ArrayList<\\w+>\\(\\)",source);
		System.out.println(matcher4.match());
	}
}