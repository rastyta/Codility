package com.rasty.countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
  public int solution(int X, int[] A){
    Set set = new HashSet();
    for (int i = 0; i < A.length; i++) {
      set.add(A[i]);
      if(set.size()==X)
        return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] A = {1, 3, 1, 4, 2, 3,5,4};
    System.out.println(new FrogRiverOne().solution(5,A));
  }
}
