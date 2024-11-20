import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1463 {
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        result = 0;
        makeOne(n);
        System.out.println(result);
    }
    static int makeOne(int n){
        if(n == 1) return 1;
        else {
            if (n % 3 == 0) {
                result++;
                return makeOne(n / 3);
            }
            else if(n % 3 == 1) {
                result++;
                return makeOne(n - 1);
            }
            else if (n % 2 == 0) {
                result++;
                return makeOne(n / 2);
            }
            else {
                result++;
                return makeOne(n - 1);
            }
        }
    }
}
