import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		System.out.println("GU:0,CHOKI:1,PA:2");
		int player = 0;
		try(Scanner sc = new Scanner(System.in)){
			player = sc.nextInt();
		}		
		if((player >= 0) && (player <= 2)){
			int computer = new Random().nextInt(3);
			HandSign playerHand = HandSign.values()[player];
			HandSign computerHand = HandSign.values()[computer];
			
			System.out.println("player:" + playerHand);
			System.out.println("computerHand:" + computerHand);
			
			System.out.println(HandSign.pon(playerHand,computerHand));
		}else {
			System.out.println("0ˆÈã2ˆÈ‰º‚Å‚¨Šè‚¢‚µ‚Ü‚·");
		}
	}
}
