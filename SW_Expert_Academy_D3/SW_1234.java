import java.util.ArrayList;
import java.util.Scanner;

public class SW_1234 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int tc=1; tc<=10; tc++) {
            ArrayList<Integer> list = new ArrayList<>();
            int num = sc.nextInt();
            String number = sc.next();
            for(int i=0; i<number.length(); i++){
                list.add(Integer.parseInt(number.substring(i, i+1)));
            }

            int check = 0;
            while(true){
                for(int j=0; j<list.size()-1; j++){
                    if(list.get(j) == list.get(j+1)){
                        check = 0;
                        break;
                    }
                    else check = 1;
                }
                if(check == 1) break;
                for(int j=0; j<list.size()-1; j++){
                    if(list.get(j) == list.get(j+1)){
                        list.remove(j);
                        list.remove(j);
                    }
                }
            }
            System.out.print("#" + tc + " ");
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}
