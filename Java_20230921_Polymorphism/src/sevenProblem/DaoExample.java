package sevenProblem;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
	dao.select();
	dao.insert();
	dao.update();
	dao.delete();
	
	}
	
	public static void main(String[] args) {
//		dbWork(new OracleDao());
//		dbWork(new MySqlDao());
//		dbWork(new MyBatisDao());
//		
//		
//		System.out.println("===========");
//		DataAccessObject data = new MySqlDao();
//		data.select();
//		data.insert();
//		data.update();
//		data.delete();
//		
//		data = new OracleDao();
//		data.select();
//		data.insert();
//		data.update();
//		data.delete();
//		
//		System.out.println("data 2 ===");
//		
//		DataAccessObject data2= new MyBatisDao();
//		data2.insert();
//		data2.select();
//		data2.update();
//		data2.delete();
//		
//		MyBatisDao data3 = (MyBatisDao) data2;
//		data3.put();
//		data3.delete();
//		MyBatisDao data4 = new MyBatisDao();
//		data3.put();
//		data3.delete();
//		data3.insert();
		
		//구현객체 없이 클래스명으로 출력 가능
		DataAccessObject.dodo();
		
		DataAccessObject data = new OracleDao();
		
		data.dodo2();
	}
	
}
