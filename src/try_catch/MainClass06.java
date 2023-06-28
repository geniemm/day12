package try_catch;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("나이 입력: ");
		try {
			age = sc.nextInt();
			if(age<1) {
				System.out.println("잘못 입력: "+age);
				}
			System.out.println("나이: "+age);
		}catch(Exception e){
		System.out.println(e.getMessage());
		}
		System.out.println("다음 문장들 실행");	
		
	}
}
