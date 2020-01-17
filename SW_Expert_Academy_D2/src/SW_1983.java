import java.util.Arrays;
import java.util.Scanner;

public class SW_1983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            int student = sc.nextInt();
            double [] score = new double[num];
            for(int i=0;i<num;i++){
                double total = 0;
                total += 0.35*sc.nextInt();
                total += 0.45*sc.nextInt();
                total += 0.2*sc.nextInt();
                score[i] = total;
            }
            double target = score[student-1];
            Arrays.sort(score);
            int index = Arrays.binarySearch(score, target);
            int div = num/10;
            String result = "";
            if(index<div) result = "D0";
            else if(index<2*div) result = "C-";
            else if(index<3*div) result = "C0";
            else if(index<4*div) result = "C+";
            else if(index<5*div) result = "B-";
            else if(index<6*div) result = "B0";
            else if(index<7*div) result = "B+";
            else if(index<8*div) result = "A-";
            else if(index<9*div) result = "A0";
            else result = "A+";
            System.out.println("#"+test_case+" "+result);
        }
    }
}
