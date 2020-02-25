import java.util.Scanner;

public class SW_2047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        char[] arr;
        arr = sentence.toCharArray();
        for(int i=0; i<arr.length; ++i){
            if('a'<=arr[i] && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
            }
        }

        System.out.print(arr);
    }
}
