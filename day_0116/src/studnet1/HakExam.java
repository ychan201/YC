package studnet1;

public class HakExam {
	public static void main(String[] args) {
		Hak h = new Hak();
		h.setBun(1);
		h.setName("ȫ�浿");
		h.setKor(100);
		h.setEng(90);
		h.setMat(80);
		
		System.out.println("��ȣ :"+h.getBun());
		System.out.println("�̸� :"+h.getName());
		System.out.println("���� :"+h.getKor());
		System.out.println("���� :"+h.getEng());
		System.out.println("���� :"+h.getMat());
	}
}
