package sevenProblem;

public class MyBatisDao extends OracleDao{

	public void put() {
		System.out.println("hi");
		super.delete();
	}

	public void update() {
		System.out.println("MyBatis에서 수정");
	}


	public void delete() {
		System.out.println("MyBatis 에서 삭제");
	}
}
