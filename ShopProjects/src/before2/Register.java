package before2;

import java.util.List;

public class Register {
	void printBanner(String message){
		//メソッドの抽出
		System.out.println("***********************");
		System.out.println("******* "+ message +" ********");
		System.out.println("***********************");
	}
	void printReceipt(String name, List<String> nameList , double sum){
		//メソッドの抽出　ローカル変数あり
		System.out.println("name: " + name);
		System.out.println("itemList: " + nameList);
		System.out.println("sum: " + sum);
	}
}
