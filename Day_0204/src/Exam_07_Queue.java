import java.util.LinkedList;
import java.util.Queue;


public class Exam_07_Queue {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer("aaa");
		que.offer("bbb");
		que.offer("ccc");
		que.offer("ddd");
		que.offer("eee");
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
	}
}
