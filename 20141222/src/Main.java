
public class Main {
	public static void main(String[] args){
		Sweet sweet1 = new Cake("�X�g���x���[",350);
		Sweet sweet2 = new CreamPuff("�o�j��",180);
		System.out.println(sweet1.getName());
		System.out.println(sweet1.getPrice());
		sweet1.print();
		sweet2.print();
	}
}
