package com.rasty.prefixsums;

public class GenomicRangeQuery {

  public int[] solution(String S, int[] P, int[] Q){
    int[][] genoms = new int[3][S.length()+1];
    short a, c, g;
    for (int i=0; i<S.length(); i++) {
      a = 0; c = 0; g = 0;
      if ('A' == (S.charAt(i))) {
        a=1;
      }
      if ('C' == (S.charAt(i))) {
        c=1;
      }
      if ('G' == (S.charAt(i))) {
        g=1;
      }
      genoms[0][i+1] = genoms[0][i] + a;
      genoms[1][i+1] = genoms[1][i] + c;
      genoms[2][i+1] = genoms[2][i] + g;
    }

    int[] result = new int[P.length];
    for (int i=0; i<P.length; i++) {
      int fromIndex = P[i]+1;
      int toIndex = Q[i]+1;
      if (genoms[0][toIndex] - genoms[0][fromIndex-1] > 0) {
        result[i] = 1;
      } else if (genoms[1][toIndex] - genoms[1][fromIndex-1] > 0) {
        result[i] = 2;
      } else if (genoms[2][toIndex] - genoms[2][fromIndex-1] > 0) {
        result[i] = 3;
      } else {
        result[i] = 4;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    String S = "CAGCCTA";
    int[] P = {2,5,0};
    int[] Q = {4,5,6};
    System.out.println(java.util.Arrays.toString(new GenomicRangeQuery().solution(S, P, Q)));
  }
}
