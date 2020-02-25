import java.util.Scanner;

public class SW_1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int num = sc.nextInt();
            String word = sc.next();
            String sentence = sc.next();
            int count = 0;
            int start = 0;
            while(start < sentence.length()){
                int find = sentence.indexOf(word, start);
                if(find != -1) {
                    count++;
                    start = find + 1;
                }
                else break;
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}
