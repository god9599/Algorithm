import java.util.Scanner;

public class Backjoon2884 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      
      System.out.println("�˶� �ð��� �������ּ���");
      int hour = in.nextInt();
      int minute = in.nextInt();
      in.close();
      
      int c_hour = hour;
      int c_minute = minute-45;
      
      if(c_minute < 0) {
         c_hour--;
         if(c_hour<0) {
            c_hour = 23;
         }
         c_minute = 60+c_minute;
      }
      
      System.out.println(c_hour);
      System.out.println(c_minute);
   }
}
      
