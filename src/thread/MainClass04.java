package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
class A04 extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			System.out.println("입력: ");
			str= sc.next();
			System.out.println("값: "+str);
		}
	}
}
public class MainClass04 {

	public static void main(String[] args) {
		
		A04 a = new A04();
		a.start();
		JFrame frame = new JFrame("제목"); // 기본 틀 만들고
		Container c = frame.getContentPane(); // 방의 장판같은 개념
		JLabel label = new JLabel("test gui"); // 글씨에 관련된 객체 생성
		c.add(label);
		
		label.setFont(new Font(null,Font.ITALIC,32));
		// 글씨체, ,사이즈
		label.setHorizontalAlignment(JLabel.CENTER); // 0
		
		frame.setLocation(1000,200);
		// 위치를 지정해준다.
		frame.setPreferredSize(new Dimension(300,200));
		frame.pack();//프레임 사이즈 조정
		frame.setVisible(true);
		// 설정되어있는것들을 화면에 보여주세요
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // gui 창 끄면 프로그램 종료
		// 클래스이름으로 접근가능한건 static으로 만든건고, 전부 대문자인거는 final로 만든 변수이다.  
		// public static final int EXIT_ON_CLOSE = 3; 
		
		for(int i=0; ;i++) {
			label.setText(""+i);
		}
		
		
	}
}
