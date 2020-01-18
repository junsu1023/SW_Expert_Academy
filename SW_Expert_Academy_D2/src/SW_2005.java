import java.util.Scanner;

public class SW_2005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            int[][] triangle = new int[10][10];
            int n = sc.nextInt();
            triangle[0][0] = 1;
            for(int j=1; j<n; j++){
                for(int k=0; k<=j; k++){
                    if(k==0 || k==j) triangle[j][k] = 1;
                    else triangle[j][k] = triangle[j-1][k-1] + triangle[j-1][k];
                }
            }
            System.out.println("#" + i);
            for(int j=0; j<n; j++){
                for(int k=0; k<=j; k++){
                    System.out.print(triangle[j][k] + " ");
                }
                System.out.println("");
            }
        }
    }
}
