package thread;

public class CriticalStack {
	int index=0;
	char[] data =new char[10];
	
	public void push (char c) {
		index++;
		System.out.println("压入后指针上移");
	}
public char pop() {
	index--;
	System.out.println("弹出前指针下移");
	char c=data[index];
	System.out.println("弹出:"+c);
	return c;
}
}
