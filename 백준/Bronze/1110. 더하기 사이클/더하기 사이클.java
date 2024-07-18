import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N= scanner.nextInt();
        int M=N;
        int cnt=0;

        while(true){
            int temp = 0;
            if(M<10){
                M=(M*10+M);
            }
            else{
                temp = M/10 + M%10;
                M = M%10*10+temp%10;
            }
            cnt++;
            if(M==N){
                break;
            }
        }

        System.out.println(cnt);

    }
}
