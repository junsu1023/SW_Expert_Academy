import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW_1221 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=test_case; tc++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            String[] arr = new String[num];
            for(int i=0; i<num; i++){
                arr[i] = st.nextToken();
            }
            int[] save = new int[num];

            String[] number = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(number[0])) save[i] = 0;
                else if (arr[i].equals(number[1])) save[i] = 1;
                else if (arr[i].equals(number[2])) save[i] = 2;
                else if (arr[i].equals(number[3])) save[i] = 3;
                else if (arr[i].equals(number[4])) save[i] = 4;
                else if (arr[i].equals(number[5])) save[i] = 5;
                else if (arr[i].equals(number[6])) save[i] = 6;
                else if (arr[i].equals(number[7])) save[i] = 7;
                else if (arr[i].equals(number[8])) save[i] = 8;
                else if (arr[i].equals(number[9])) save[i] = 9;
            }
            Arrays.sort(save);

            for (int i = 0; i < save.length; i++) {
                if (save[i] == 0) {
                    arr[i] = number[0];
                } else if (save[i] == 1) {
                    arr[i] = number[1];
                } else if (save[i] == 2) {
                    arr[i] = number[2];
                } else if (save[i] == 3) {
                    arr[i] = number[3];
                }else if (save[i] == 4) {
                    arr[i] = number[4];
                }else if (save[i] == 5) {
                    arr[i] = number[5];
                }else if (save[i] == 6) {
                    arr[i] = number[6];
                }else if (save[i] == 7) {
                    arr[i] = number[7];
                }else if (save[i] == 8) {
                    arr[i] = number[8];
                }else if (save[i] == 9) {
                    arr[i] = number[9];
                }
            }
            System.out.println("#" + tc + " ");
            for(int i=0; i<arr.length; i++)
                System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
