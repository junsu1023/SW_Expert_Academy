import java.util.Scanner;

public class SW_1976 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int resulth, resultm;
            resulth = h1 + h2;
            resultm = m1 + m2;
            if(resultm>60){
                resulth++;
                resultm-=60;
            }
            if(resulth>12) resulth-=12;
            System.out.println("#" + i + " " + resulth + " " + resultm);
        }
    }
}
