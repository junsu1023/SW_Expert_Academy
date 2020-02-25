import java.util.Scanner;

public class SW_1959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[M];

            for(int j=0; j<N; j++){
                A[j] = sc.nextInt();
            }

            for(int j=0; j<M; j++){
                B[j] = sc.nextInt();
            }

            int max = 0;
            if(N<M) {
                for (int j=0; j<=M-N; j++) {
                    int result = 0;
                    for (int k=0; k<N; k++) {
                        result += A[k] * B[k+j];
                    }
                    max = Math.max(result, max);
                }
            }
            else if(N>M){
                for(int j=0; j<=N-M; j++){
                    int result = 0;
                    for(int k=0; k<M; k++){
                        result += A[k+j] * B[k];
                    }
                    max = Math.max(result, max);
                }
            }
            else{
                int result = 0;
                for(int j=0; j<M; j++){
                    result += A[j] * B[j];
                }
                max = Math.max(result, max);
            }
            System.out.println("#" + i + " " + max);
        }
    }
}
