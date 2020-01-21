import java.util.Scanner;

public class SW_1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int count = 0;
            int length = sc.nextInt();
            char[][] arr = new char[8][8];
            for(int i=0; i<8; i++){
                String s = sc.next();
                for(int j=0; j<8; j++){
                    arr[i][j] = s.charAt(j);
                }
            }

            for(int i=0; i<8; i++){
                for(int j=0; j<8-length+1; j++){
                    int temp = 0;
                    for(int k=0; k<length/2; k++){
                        if(arr[i][j+k] != arr[i][j+length-k-1]) temp = -1;
                    }
                    if(temp == 0) count++;
                }
            }

            for(int i=0; i<8-length+1; i++){
                for(int j=0; j<8; j++){
                    int temp = 0;
                    for(int k=0; k<length/2; k++){
                        if(arr[i+k][j] != arr[i+length-k-1][j]) temp = -1;
                    }
                    if(temp==0) count++;
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}
