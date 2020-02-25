import java.util.Scanner;

public class SW_1936 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        String winner = "";

        switch(A){
            case 1:
                winner = B==2 ? "B":"A"; break;
            case 2:
                winner = B==3 ? "B":"A"; break;
            case 3:
                winner = B==1 ? "B":"A"; break;
        }
        System.out.println(winner);
    }
}
