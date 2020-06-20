package ThreadMain;

//아래의 ThreadWithClass 와 ThreadWithRunnable 을 구현하시오.
//1. 상속으로 쓰레드를 구현하는 방법
//2. 인터페이스로 쓰레드를 구현하는 방법


class ThreadWithClass extends Thread {
	public void run() {
		System.out.println("상속으로 구현");
	}
	
}

class ThreadWithRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("인터페이스로 구현");	
	}
	
}


public class ThreadMain {

    public static void main(String[] args){

        ThreadWithClass thread1 = new ThreadWithClass();       // Thread 클래스를 상속받는 방법

        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable 인터페이스를 구현하는 방법 

        thread1.start(); // 쓰레드의 실행
        thread2.start(); // 쓰레드의 실행
    }

}
