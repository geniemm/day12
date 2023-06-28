package thread;
 /*
  쓰레드
  - 프로그램(process)을 구동하기 위한 최소한의 단위
  -> 일꾼 개념 
  */
class A01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("A01: "+i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("B01: "+i);
		}
	}
	
}
public class MainClass01 {
	public static void main(String[] args) {
		// main thread하나가 기본적으로 있다
		A01 a = new A01();
		B01 b = new B01();
//		a.run();
//		b.run();
		a.start(); // thread로 구동하려면 무조건 start로 해야한다.
		b.start();
	
	} 

}
