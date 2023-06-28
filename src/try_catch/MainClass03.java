package try_catch;
// casting 형변환
// upcasting : 자식형태에서 부모형태로 저장하겠다.
class A {}
class B extends A {}

public class MainClass03 {
	public static void main(String[] args) {
		B a = new B();
		A b = new B();
		try {
		
			int[] arr = { 10, 20, 30 };
			for (int i = 0; i <3; i++) {
				System.out.println(arr[i]);
			}
			int n1 = 10, n2 = 0;
			System.out.println(n1 / n2);

		} catch ( Exception e) { //Exception -> 다양한 Exception들에 대한 부모class이다
			System.out.println("인덱스 범위를 벗어났습니다.");
			//e.printStackTrace(); // 오류의 문제를 알려준다.
		}
		System.out.println("다음 문장들 실행");

	}
}
