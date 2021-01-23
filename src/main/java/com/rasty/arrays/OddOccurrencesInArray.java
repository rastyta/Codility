package com.rasty.arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
  public int solution(int[] A){
    Set<Integer> set = new HashSet<>();
    for(int e:A){
      if(set.contains(e)){
        set.remove(e);
      }else{
        set.add(e);
      }
    }
    return set.iterator().next();
  }

  public static void main(String[] args) {
    int[] A = {9,3,9,3,9,7,9};
    System.out.println(
    new OddOccurrencesInArray().solution(A));
  }
}
