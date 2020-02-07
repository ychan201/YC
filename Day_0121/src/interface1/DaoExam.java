package interface1;

public class DaoExam {
	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		DataAccessObject dao = new OracleDao();
		dbWork(dao);
		dao = new MySqlDao();
		dbWork(dao);
		
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}
}
