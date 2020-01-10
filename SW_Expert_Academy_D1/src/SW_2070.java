import java.util.Scanner;

public class SW_2070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] n = new int[2];

        for(int i=1; i<=num; i++){
            for(int j=0; j<2; j++){
                n[j] = input.nextInt();
            }
            if(n[0] > n[1])
                System.out.println("#" + i + " " + ">");
            else if(n[0] < n[1])
                System.out.println("#" + i + " " + "<");
            else
                System.out.println("#" + i + " " + "=");
        }
    }
}
