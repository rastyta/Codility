package com.rasty.timecomplexity;

public class TapeEquilibrium {
  public int solution(int[] A){
    final int N = A.length;
    int minAbsDiff = Integer.MAX_VALUE;

    int sum1 = A[0];
    int sum2 = 0;
    for (int i = 1; i < N; ++i)
      sum2 += A[i];

    for (int i = 1; i < N; ++i) {
      minAbsDiff =
          Math.min( Math.abs( sum1 - sum2 ), minAbsDiff );
      sum1 += A[i];
      sum2 -= A[i];
    }

    return minAbsDiff;
  }

  public static void main(String[] args) {
    int[] A = {1, -200};
    System.out.println(new TapeEquilibrium().solution(A));
  }
}
