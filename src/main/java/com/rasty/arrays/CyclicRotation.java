package com.rasty.arrays;

import java.util.Arrays;

public class CyclicRotation {
  public int[] solution(int[] A, int K){
    if(A.length == K || A.length == 0)
      return A;
    if(A.length < K)
      K = K % A.length;
    int[] endPart = Arrays.copyOfRange(A, 0, A.length - K);
    System.out.println("*" + Arrays.toString(endPart));
    int[] startPart = Arrays.copyOfRange(A, A.length - K, A.length);
    System.out.println("**" + Arrays.toString(startPart));

    int[] response = new int[startPart.length + endPart.length];
    System.arraycopy(startPart, 0, response, 0, startPart.length);
    System.arraycopy(endPart, 0, response, startPart.length, endPart.length);
    return response;
  }

  public static void main(String[] args) {
    int[] A = {};
    int K = 1;
    int[] solution = new CyclicRotation().solution(A, K);
    System.out.println(Arrays.toString(solution));
  }
}
