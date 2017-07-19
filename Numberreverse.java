package player;
import java.util.Scanner;
public class Numberreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int reverse=0;
while(a>0){
	reverse=reverse*10;
	reverse=reverse+a%10;
	a=a/10;
}
System.out.println("Reverse Number is:"+reverse);
	}

}
