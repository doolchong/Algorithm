import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int A,B;
		
		while(true) {
			A=sc.nextInt();
			B=sc.nextInt();
			
			if(A==0&&B==0) {
				break;
			}
			else if(B%A==0) {
				System.out.println("factor");
			}
			else if(A%B==0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
		sc.close();
	}

}
