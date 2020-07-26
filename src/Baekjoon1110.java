import java.util.Scanner;
 
public class Baekjoon1110{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        sc.close();
         
        int number = num;
         
        do {
            number = number % 10 * 10 + (number / 10 + number % 10) % 10;
            count++;
        } while (num != number);
         
        System.out.println(count);
    }
}