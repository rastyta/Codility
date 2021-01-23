package com.rasty.countingelements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
  public int solution(int[] A){
    Set<Integer> all = new HashSet<Integer>();
    for( int v : A ) {
      if( v > A.length ) return 0;
      all.add(v);
    }
    return all.size() == A.length ? 1:0;
  }
  public static void main(String[] args) {
    int[] A = {4,1,3,2};
    int[] B = {4,1,3};
    System.out.println(new PermCheck().solution(A));
    System.out.println(new PermCheck().solution(B));
  }
}
