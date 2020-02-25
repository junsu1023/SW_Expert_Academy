import java.util.Scanner;

public class SW_1220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int size = sc.nextInt();
            int[][] arr = new int[size][size]; //한 변의 길이

            for(int i=0; i<size; i++){ //배열 입력 N극=1, S극=2
                for(int j=0; j<size; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int count = 0;
            for(int i=0; i<size; i++){
                boolean check = false;
                for(int j=0; j<size; j++){
                    if(!check && arr[j][i]==1) check = true;
                    if(check && arr[j][i]==2){
                        check = false;
                        count++;
                    }
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}
