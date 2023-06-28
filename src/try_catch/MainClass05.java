package try_catch;

class TestClass05{
	public void test1(){	
		System.out.println("test111");
		try {
			test2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void test2() throws InterruptedException {	
		System.out.println("test222");
		Thread.sleep(100); 
		// try-catch로 했더니 문제없었는데 throws로 했더니 에러발생(test2)
		// throws는 호출했던 곳으로 넘어가서 예외를 전가해서 호출이끝날때까지 예외처리를 해야함
		// trt - catch는 자기 자신에서 예외처리가 끝나니까 상황을 보고 전가를 해야하는지 여기서 끝내야하는지 선택해야한다.
	}
}
public class MainClass05 {
	public static void main(String[] args) { //throws InterruptedException {
		// add throws 예외 전가 
		//Thread.sleep(100);
		TestClass05 t = new TestClass05();
		t.test1();
	}
}
