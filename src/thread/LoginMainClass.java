package thread;

import java.util.Scanner;


public class LoginMainClass {
	public static void main(String[] args) {
		LoginService l = new LoginService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[1] 로그인");
			System.out.println("[2] 회원가입");
			System.out.println("[3] 탈퇴");
			System.out.println("[4] 종료");
			System.out.print(">>> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				l.login();
				break;
			case 2:
				l.join();
				break;
			case 3:
				l.delLog();
				break;
			case 4:
				l.endProgram();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
			
	}
}
