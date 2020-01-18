import java.util.Scanner;

public class SW_2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            String word = sc.next();
            int length = 0;
            for(int j=1; j<10; j++){
                String word1 = word.substring(0, j);
                String word2 = word.substring(j, j+j);
                if(word1.equals(word2)){
                    length = j;
                    break;
                }
            }
            System.out.println("#" + i + " " + length);
        }
    }
}
