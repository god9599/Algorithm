import java.util.Scanner;

public class Baekjoon2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=N;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
