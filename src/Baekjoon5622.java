import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        int time = 0;

        for(char ch : word){
            time += (ch-'A')/3 + 3;
            if(ch =='S' || ch == 'V' || ch == 'Y'|| ch=='Z')
                time--;
        }
        System.out.println(time);
    }
}