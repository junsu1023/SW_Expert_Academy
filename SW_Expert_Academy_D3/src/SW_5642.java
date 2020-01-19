import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW_5642 {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            int n = Integer.parseInt(br.readLine());
            int[] add = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) add[j] = Integer.parseInt(st.nextToken());
            int max = -9999;
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += add[j];
                if(sum > max) max = sum;
                if(sum < 0 ) sum = 0;
            }
            System.out.println("#" + i + " " + max);
        }
    }
}
