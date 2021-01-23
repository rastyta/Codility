package com.rasty.countingelements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
  public int solution(int[] A){
    int response = 1;
    Set<Integer> set = new HashSet<>();
    for(int i : A){
      if(i>0){
        set.add(i);
      }
      if(i==response){
        while (set.contains(response)){
          response++;
        }
      }
    }
    return response;
  }

  public static void main(String[] args) {
    int[] A = {1, 3, 6, 4, 1, 2};
    System.out.println(new MissingInteger().solution(A));
  }
}
