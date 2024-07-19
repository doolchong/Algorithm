import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int C;
		
		for(int i=0;i<T;i++) {
			C=sc.nextInt();
			while(C!=0) {
				System.out.print((C/25)+" ");
				C%=25;
				System.out.print((C/10)+" ");
				C%=10;
				System.out.print((C/5)+" ");
				C%=5;
				System.out.print((C/1)+" ");
				C%=1;
			}
			System.out.println();
		}
		sc.close();
	}

}
