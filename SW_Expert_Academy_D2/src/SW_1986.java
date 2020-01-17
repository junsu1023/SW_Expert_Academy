import java.util.Scanner;

public class SW_1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            int n = sc.nextInt();
            int result = 0;
            for(int j=1; j<=n; j++) {
                if(j%2==1) result += j;
                else result -=j;
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
