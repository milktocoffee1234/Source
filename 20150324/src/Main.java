
public class Main {
	public static void main(String[] args){
		Clinic clinic = new Clinic("おかにわクリニック", new Nurse("エヴァ","30","女"), new Doctor("いまだ", "40", "男"));
		clinic.enter(new Patient("田中","15","男","ガン"));
		clinic.enter(new Patient("後藤","20","男","盲腸"));
		clinic.enter(new Patient("マギー","22","女","肺炎"));

		System.out.println(clinic.getName());
		clinic.examine();
	}
}
