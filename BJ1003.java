import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1003 {
    static Integer[][] result = new Integer[41][2]; //N은 40보다 작거나 같은 자연수 또는 0

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        result[0][0] = 1;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 1;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(result[n][0]+" "+result[n][1]+"\n");
        }
        System.out.println(sb);
    }

    private static Integer[] fibonacci(int n){
        if(result[n][0] == null || result[n][1] == null) {
            result[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            result[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        return result[n];
    }
}
