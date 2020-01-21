import java.util.Scanner;

public class SW_1216 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int count = 1;
            char[][] arr = new char[100][100];
            int n = sc.nextInt();
            for(int i=0; i<100; i++){
                String s = sc.next();
                for(int j=0; j<100; j++){
                    arr[i][j] = s.charAt(j);
                }
            }

            for(int num=100; num>1; num--){
                if(count > 1) break;
                for(int i=0; i<100; i++){
                    for(int j=0; j<100-num+1; j++){
                        int temp = 0;
                        for(int k=0; k<num/2; k++){
                            if(arr[i][j+k] != arr[i][j+num-k-1]) temp = -1;
                        }
                        if(temp == 0) count = num;
                    }
                }

                for(int i=0; i<100-num+1; i++){
                    for(int j=0; j<100; j++){
                        int temp = 0;
                        for(int k=0; k<num/2; k++){
                            if(arr[i+k][j] != arr[i+num-k-1][j]) temp = -1;
                        }
                        if(temp == 0) count = num;
                    }
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}
