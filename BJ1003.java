import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1003 {
    static int zero;
    static int one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            zero = 0;
            one = 0;
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            System.out.println(zero+" "+one);
        }
    }

    private static int fibonacci(int n){
        if(n==0) {
            zero++;
            return 0;
        }
        else if(n==1) {
            one++;
            return 1;
        }
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
