import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i =0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort((arr));

        for(int i = 0;i<N;i++){
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }
        bw.flush();
    }
}
