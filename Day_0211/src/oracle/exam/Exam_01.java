package oracle.exam;

public class Exam_01 {
	public static void main(String[] args) {
		oracleSQL oracle = new oracleSQL();
		try {
			oracle.makeConn();
			oracle.deptListPrint();
			oracle.takeDown();
		}catch(Exception e) {e.printStackTrace();}
	}

}
