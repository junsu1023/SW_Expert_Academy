import java.util.ArrayList;
import java.util.Scanner;

public class SW_4406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            ArrayList list = new ArrayList<>();
            String word = sc.next();
            for(int i=0; i<word.length(); i++){
                char alpha = word.charAt(i);
                if(alpha == 'a' || alpha == 'i' || alpha == 'u' || alpha == 'e' || alpha == 'o') continue;
                else list.add(alpha);
            }
            System.out.print("#" + tc + " ");
            for(int i=0; i<list.size(); i++) System.out.print((char)list.get(i));
            System.out.println();
        }
    }
}
