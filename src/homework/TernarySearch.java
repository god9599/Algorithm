package homework;
import java.util.Scanner;
public class TernarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int find1 = sc.nextInt();
		sc.close();
		int[] S = {8,13,25,28,35,41,48,53,57,60,68,72,83,85,88,92,96,99};
		int result = search(S, find1, 0, S.length-1);
		if(result == -1) {
			System.out.println("찾는 값이 없습니다.");
		}
		else {
			System.out.println(result + "번 index에 있습니다.");
		}
	}
	static int search(int S[], int find, int low, int high) {
		int mid1, mid2;
		int res = 0;
		if(low>high) {
			return -1;
		}
		else
		mid1 = low + (high - low);
		mid2 = high - (high - low);
		if(S[mid1] == find) {
			res = mid1;
		}
		else if(S[mid2] == find) {
			res = mid2;
		}
		if(find < S[mid1]) {
			return search(S, find, low, mid1-1);
		}
		else if(S[mid1] < find && find < S[mid2]) {
			return search(S, find, mid1+1, mid2 -1);
		}
		else if (S[mid2] < find) {
			return search(S, find, mid2+1, high);
		}
		return res;
	}
}
