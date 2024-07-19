import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int N=scanner.nextInt();
		
		for(int i=1;i<N;i+=4) {
			System.out.print("long ");
		}
		System.out.println("int");
		
		scanner.close();
	}

}
