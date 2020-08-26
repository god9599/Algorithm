import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Baekjoon1920 {
    
    static int a,b;
    static int c[];
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        c=new int[a];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < a ; i++){
            c[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(c);
        
        b = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < b ; i ++){
            int x=Integer.parseInt(st.nextToken());
            
            int low = 0;
            int high = a-1;
            int mid;
            
            while(true){
                if(low > high){
                    sb.append("0\n");
                    break;
                }
                mid = (low+high)/2;
                if(c[mid]==x){
                    sb.append("1\n");
                    break;
                }
                else if(c[mid] < x){
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
 
