import java.util.Scanner;

public class SW_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int num = sc.nextInt();
            int[][] arr = new int[100][100];
            int sum = 0;
            int diagonal1 = 0;
            int diagonal2 = 0;
            int result = 0;

            for(int i=0; i<100; i++){
                int temp = 0;
                for(int j=0; j<100; j++){
                    arr[i][j] = sc.nextInt();
                    temp += arr[i][j];
                }
                if(sum < temp) sum = temp;
            }

            for(int i=0; i<100; i++){
                int temp2 = 0;
                for(int j=0; j<100; j++){
                    temp2 += arr[j][i];
                    if(i==j) diagonal1 += arr[i][j];
                    if(i+j==99) diagonal2 += arr[i][j];
                }
                if(sum < temp2) sum = temp2;
            }
            result = Math.max(sum, Math.max(diagonal1, diagonal2));
            System.out.println("#" + tc + " " + result);
        }
    }
}
