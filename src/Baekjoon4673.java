public class Baekjoon4673 {
	private static int notSelfNum (int n) {
		int total = n;
		int quotient = n;
		while(quotient > 0) {
			total += quotient % 10;
			quotient /= 10;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] check= new boolean[10001];
		for(int i=1; i<check.length; i++) {
			if(notSelfNum(i)<10001) check[notSelfNum(i)] = true;
		}
		for(int i=1; i < check.length; i++) {
			if(check[i]==false) System.out.println(i);
		}
	}

}
