package thread;

import java.util.Scanner;

import time.TimeService;

public class LoginService extends TimeService{
	Scanner sc = new Scanner(System.in);
	String id = null, pw = null;
	private LoginDTO log;

	public LoginService() {
		System.out.println("기본 생성자 생성");
		log = new LoginDTO();
	}

	public int idCheck() {
		// 아이디가 null값과 같은지 아닌지 메소드를 만들어서 사용한다.
		if (log.getId() == null) {
			return 0;
		}
		return 1;
	}

	public String[] inputData(String idmsg, String pwdMsg) {
		//
		String inputId, inputPwd;
		System.out.print(idmsg);
		inputId = sc.next();
		System.out.print(pwdMsg);
		inputPwd = sc.next();
		return new String[] { inputId, inputPwd };
	}

	public void login() {
		if (log.getId() == null) {
			System.out.println("데이터를 저장하세요");
		}

		System.out.println("== 로그인 ==");
		String[] result = inputData("ID: ", "PW: ");

		if (result[0].equals(log.getId())) {
			if (result[1].equals(log.getPw())) {
				System.out.println("** 인증 통과 **");
				setStartTime();

			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");

		}
	}

	public void join() {

		if (idCheck() == 1) {
			System.out.println("사용자가 존재합니다.");
		}
		/*
		 * System.out.print("ID: "); id = sc.next(); System.out.print("PW: "); pw =
		 * sc.next();
		 */
		String[] result2 = inputData("ID: ", "PW: ");
		log.setId(result2[0]);
		log.setPw(result2[1]);
	}

	public void delLog() {
				
				if (idCheck()==0) {
					System.out.println("등록값 없음");
					
				} else {
					log.setId(id = null);
					log.setPw(pw = null);
					System.out.println("탈퇴되었습니다.");
					
				}
			}
	public void endProgram() {
		System.out.println("프로그램을 종료합니다.");
		setEndTime();
		System.out.println(getResultTime());
		System.exit(0);
	}
}
