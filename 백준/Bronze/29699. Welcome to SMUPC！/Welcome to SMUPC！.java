import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String S = "WelcomeToSMUPC";
        
		int N = scanner.nextInt();
        if(N % 14 == 0) {
            System.out.println(S.charAt(13));
        } else {
            System.out.println(S.charAt((N % 14) - 1));
        }
	}

}