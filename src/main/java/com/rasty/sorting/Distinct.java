package com.rasty.sorting;

public class Distinct {
  public int solution(int[] A){
    java.util.Set set = new java.util.HashSet();
    for(int i : A){
      if(!set.contains(i)){
        set.add(i);
      }
    }
    return set.size();
  }

  public static void main(String[] args) {
    int[] A = {2, 1, 1, 2, 3, 1};
    System.out.println(new Distinct().solution(A));
  }
}
