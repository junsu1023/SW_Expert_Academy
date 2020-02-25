import java.util.Base64;
import java.util.Scanner;

public class SW_1928 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1; i<=num; ++i){
            String word = input.next();

            byte[] origin = Base64.getDecoder().decode(word);
            String result = new String(origin);
            System.out.println("#" + i + " " + result);
        }
    }
}
