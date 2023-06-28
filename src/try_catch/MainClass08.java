package try_catch;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<인증 프로그램 입니다>\n");
		while(true) {
			System.out.println("---------------------");
			System.out.println("90년생 이상은 '가입불가'");
			System.out.println("89년생 이하는 '가입가능'");
			System.out.println("'A,ㅁ,ㅋ'문자는 '잘못입력'");
			System.out.println("---------------------");
			System.out.print("주민번호 입력(앞6자리): ");
			
			try {
				int num = sc.nextInt();
				if (num>891231) {
					System.out.println("가입불가");
					
				}else if(num<=99999) {
					System.out.println("길이가 틀렸습니다.");
					System.out.println("다시 입력해주세요!\n");
				}
				else {
				System.out.println("== 가입 가능 ==");
				break;
				}
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력하세요!!!\n");
			}
		}
		
	}
}
