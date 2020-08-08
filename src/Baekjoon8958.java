import java.util.Scanner;

public class Baekjoon8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine().trim());
        
        for(int i=0; i<count; i++) {
            int point = 0;
            int result = 0;
            String inputStr = sc.nextLine().trim();
            
        
            for(int index=0; index<inputStr.length(); index++) {
                char data = inputStr.charAt(index);
                
                if('O' == data) {
                    result += ++point;
                } else {
                    point = 0;
                }
            }
            System.out.println(result);
        }
        
        sc.close();
    } 
}

