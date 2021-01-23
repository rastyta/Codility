package com.rasty.prefixsums;

import com.rasty.countingelements.PermCheck;

public class CountDiv {
  public int solution(int A, int B, int K){
    int BK = B/K;
    int AK = A/K;
    return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
  }

  public static void main(String[] args) {
    System.out.println(new CountDiv().solution(6,11,2));
  }
}
