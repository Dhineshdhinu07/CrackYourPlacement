import java.util.Arrays;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }
     public static int maxScore(int[] cardPoints, int k) {
    int n = cardPoints.length;
    int sum = Arrays.stream(cardPoints).sum();
    int windowSum = 0;
    for (int i = 0; i < n - k; ++i){
      windowSum += cardPoints[i];
    }
    int ans = sum - windowSum;
    for (int i = 0; i < k; ++i) {
      windowSum -= cardPoints[i];
      windowSum += cardPoints[i + n - k];
      ans = Math.max(ans, sum - windowSum);
    }
    return ans;
  }
    
}
