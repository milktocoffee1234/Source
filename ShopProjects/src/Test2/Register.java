package Test2;

import java.util.List;
import java.util.stream.Collectors;

public class Register {
	void printBanner(){
		//���\�b�h�̒��o
		System.out.println("***********************");
		System.out.println("******* result ********");
		System.out.println("***********************");
	}
	void printReceipt(List<String> nameList , double sum){
		//���\�b�h�̒��o�@���[�J���ϐ�����
		System.out.println("name: " + nameList);
		System.out.println("sum: " + sum);
	}
}
