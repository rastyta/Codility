package com.rasty.sorting;

public class MaxProductOfThree {
  public int solution(int[] A){
    java.util.Arrays.sort(A);
    int max_1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
    int max_2 = A[0] * A[1] * A[A.length-1];
    return Math.max(max_1, max_2);
  }
}
