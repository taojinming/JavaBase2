package thread;

public class CriticalTest {

	public static void main(String[] args) {
CriticalStack stack=CriticalStack new CriticalStack();
s.push('a');
s.push('b');
PushRunner r1=new PushRunner(s);
PushRunner r2=new PushRunner(s);
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t2.start();
System.out.println("Stack.index="+String.index);

	}

}
