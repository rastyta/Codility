package com.rasty.prefixsums;

public class PassingCars {
  public int solution(int[] A) {
    int countOfZeros = 0, count = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == 0) countOfZeros++;
      if (A[i] == 1) count += countOfZeros;
      if (count > 1000000000) return -1;
    }
    return count;
  }
}
