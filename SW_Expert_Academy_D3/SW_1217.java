import java.util.Scanner;

public class SW_1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++) {
            int num = sc.nextInt();
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println("#" + tc + " " + power(N, M));
        }
    }
    public static int power(int N, int M){
        if(M==0) return 1;
        return N*power(N, M-1);
    }
}
