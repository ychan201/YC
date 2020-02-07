
public class Exam_06 {
	public static void main(String[] args) {
		Hak h1 = new Hak();
		Hak[] stu = new Hak[5];
		Hak h2 = new Hak(1, "±æµ¿", 90);
		stu[0] = h2;
		h2 = new Hak(3, "dddd", 77);

		stu[1] = h2;
		stu[2] = new Hak(2, "AAA", 88);
		stu[3] = new Hak(5, "FFF", 80);
		stu[4] = new Hak(7, "KKK", 87);
		
		HakData data = new HakData(stu);
		
		data.print();

		/*for(int i=0;i<stu.length;i++) {
			stu[i].print();
		}*/
	}
}
