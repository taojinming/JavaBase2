import java.util.Scanner;
public class sanjiao2 {
public static void main(String[] args) {
Scanner gao=new Scanner(System.in);
System.out.println("请输入几行：");
int n=gao.nextInt();
int i,j;
for(i=1;i<=n;i++){
for(j=1;j<=n+(n-1);j++){
if((i==n+1-j)||(i==j-(n-1))||(i==n))
System.out.print('*');
else
System.out.print(' ');
}System.out.println();
} 
}
}