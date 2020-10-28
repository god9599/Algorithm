package homework;

public class CutDiamond {
    static int w = 4;
    static int[] sell = {3, 4, 8, 9};
    static int[] cut = {1, 2, 1, 0};
    static int[] maxSell = new int[5];

    public static int cutDiamod_dp(int[] sell, int[] cut, int w) {
        if (w == 0) return 0;
        else {
            for (int i = 1; i <= w; i++) {
                int maxVal = 0;
                for (int j = 1; j <= i; j++) {
                    if (i == w) {
                        maxVal = MAX(maxVal, sell[j - 1] + maxSell[i - j]);
                        maxSell[i] = maxVal;
                    }else
                        maxVal = MAX(maxVal, sell[j-1]+maxSell[i-j]-cut[i-1]);
                    maxSell[i] = maxVal;
                }
            }
            return maxSell[w];
        }
    }
    public static int MAX(int x,int y){
        int max = x>y?x:y;
        return max;
    }


    public static void main(String[] args) {
        maxSell[0] = 0;
        int result = cutDiamod_dp(sell, cut, w);
        System.out.println("다이아 최대 판매 금액은 "+ result + " 입니다.");
    }
}
