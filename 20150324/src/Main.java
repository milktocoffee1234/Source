
public class Main {
	public static void main(String[] args){
		Clinic clinic = new Clinic("�����ɂ�N���j�b�N", new Nurse("�G���@","30","��"), new Doctor("���܂�", "40", "�j"));
		clinic.enter(new Patient("�c��","15","�j","�K��"));
		clinic.enter(new Patient("�㓡","20","�j","�Ӓ�"));
		clinic.enter(new Patient("�}�M�[","22","��","�x��"));

		System.out.println(clinic.getName());
		clinic.examine();
	}
}
