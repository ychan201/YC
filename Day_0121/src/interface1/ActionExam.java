package interface1;



public class ActionExam {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("���縦 �մϴ�.");
			}
		};
		action.work();
		
		ActionTest ac = new ActionTest();
		ac.work();
	}
}
