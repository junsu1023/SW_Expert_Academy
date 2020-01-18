import java.util.Scanner;

public class SW_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String word = sc.next();
            int p = 0;
            int q = word.length()-1;
            boolean check = true;
            while(p<q){
                if(word.charAt(p) != word.charAt(q))
                    check= false;
                p += 1;
                q -= 1;
            }
            if(check) System.out.println("#" + (i+1) + " " + 1);
            else System.out.println("#" + (i+1) + " " + 0);
        }
    }
}
