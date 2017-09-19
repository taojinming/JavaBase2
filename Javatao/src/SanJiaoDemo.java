public class SanJiaoDemo {
	public static void main(String args[]) {
		System.out.println("请输入行数：");
		System.out.println("请输入移动位数：");
		Scanner hangshu=new Scanner(System.in);
		Scanner weishu=new Scanner(System.in);
		int n=hangshu.nextInt();
		int a=weishu.nextInt();
		for(int x=1;x<=a;x++);
		System.out.print(" ");
		for(int i=1;i<=hangshu;i++){
			//打空格1->3   2->2 3->1 4->0
			for(int k=1;k<=hangshu-i;k++){    
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i-1)*2+1;j++){				
				if(i==1 || i==hangshu){   //第一行和最后一行打星号
					System.out.print("*");
				}else{
					
					if(j==1 || j==(i-1)*2+1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}						
				}
			}
			System.out.println();
		}			
	}
 public static void main(String args[]) {
}
}