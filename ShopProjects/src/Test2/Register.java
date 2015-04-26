package Test2;

import java.util.List;
import java.util.stream.Collectors;

public class Register {
	void printBanner(){
		//メソッドの抽出
		System.out.println("***********************");
		System.out.println("******* result ********");
		System.out.println("***********************");
	}
	void printReceipt(List<String> nameList , double sum){
		//メソッドの抽出　ローカル変数あり
		System.out.println("name: " + nameList);
		System.out.println("sum: " + sum);
	}
}
