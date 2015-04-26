import masa.ArrayList;
public class Main {
	public static void main(String[] args){
		ArrayList<String> arrayList = new ArrayList<>();        
		arrayList.add("test");
		arrayList.add(9);
		arrayList.add("akasatana");
		System.out.println(arrayList.getType());
		System.out.println(arrayList.size());
		String str = "abc";
		String rep = str.replace("abc", "henkan");
		System.out.println(rep);
	}
}