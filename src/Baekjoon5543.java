import java.util.*;

public class Baekjoon5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int high = sc.nextInt();
		int middle = sc.nextInt();
		int low = sc.nextInt();
		int coke = sc.nextInt();
		int cidar = sc.nextInt();
		int set_price;
		int set_burger;
		int set_drink;
		
		sc.close();
		set_burger = (high < middle) ? high : middle;
		set_burger = (low < set_burger) ? low : set_burger;
		
		set_drink = (coke < cidar) ? coke : cidar; 
		set_price = (set_burger + set_drink) - 50;
		
		System.out.println(set_price);
		
	}

}
