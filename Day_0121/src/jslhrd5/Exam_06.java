package jslhrd5;

import java.io.IOException;

class AA{
	
	char input() throws IOException {
		char ch = (char)System.in.read();
		return ch;
	}
}

class BB{
	
	char input() {
		char ch = '\0';
		try{
			ch =(char)System.in.read();
		}catch(IOException e) {
					e.printStackTrace();
				}
		return ch;
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		AA a = new AA();
		try {
		char c = a.input();
		System.out.println(c);
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
	/*	if(ddd) {
			throw new Exception(); // 예외를 인위적으로 발생시킬 때. throw
		}
	*/ 	
		BB b = new BB();
		char bb = b.input();
		System.out.println(bb);
	}
}
