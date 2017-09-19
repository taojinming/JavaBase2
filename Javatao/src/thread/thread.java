import javax.imageio.stream.MemoryCacheImageInputStream;

public class thread{
public static void main (String[] args) {
	System.out.println(Thread.currentThread().getName() + ":"
			+Thread.currentThread().getPriority());
	MyThread thread1=new MyThread();
	thread1.setName("thread1");
	MyThread thread2=new MyThread();
	thread2.setName("thread2");
	thread2.setPriority(Thread.MAX_PRIORITY);
	MyThread thread3=new MyThread();
	thread3.setName("thread3");
	thread2.setPriority(Thread.MIN_PRIORITY);
	thread1.start();
	thread2.start();
	thread3.start();
	
}	
}
class MyThread extends Thread (
		public void run() {
			for (int i=0; i<10; i++) {
				System.out.println(this.getName() + ":"+ this.getPriority());
			}
		}
		}