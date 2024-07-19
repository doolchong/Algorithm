import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        if (S.equals("N") || S.equals("n")) {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}
