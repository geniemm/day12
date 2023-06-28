package try_catch;

import java.util.Scanner;

class TestClass04 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		int n1 = 10, n2 = 2;
		try {
			System.out.println(n1/n2);
			return;
		} catch (Exception e) {

		}finally {
			System.out.println("finally 실행");
			// 위에서 return 을 넣더라고 무조건 실행되는 코드
			sc.close();// scanner 닫아주는 코드는 무조건 실행되면 좋으니까 이럴때 사용한다.
			
		}
		System.out.println("다음 문장들 실행");
		
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test();
	}
}
