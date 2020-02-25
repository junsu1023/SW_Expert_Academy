import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            String s = br.readLine();
            int n = Integer.parseInt(s);
            boolean[] check = new boolean[10];
            int count = 0;
            int mul=1;
            while(true){
                for(int j=0; j<s.length(); j++){
                    int word = Integer.parseInt(s.substring(j, j+1));
                    if(check[word]==false){
                        count++;
                        check[word] = true;
                    }
                }
                if(count==10) break;
                mul++;
                s = Integer.toString(n*mul);
            }
            System.out.println("#" + i + " " + s);
        }
    }
}
