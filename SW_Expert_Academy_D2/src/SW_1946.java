import java.util.Scanner;

public class SW_1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_num = sc.nextInt();
        for(int i=1; i<=test_num; i++){
            StringBuilder sb = new StringBuilder();
            int num = sc.nextInt();
            int count = 0;

            for(int j=0; j<num; j++){
                String alpha = sc.next();
                int n = sc.nextInt();
                for(int k=0; k<n; k++){
                    sb.append(alpha);
                    count++;
                    if(count%10==0) sb.append("\n");
                }
            }
            System.out.println("#" + i + "\n" + sb);
        }
    }
}
