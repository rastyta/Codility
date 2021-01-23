package com.rasty.timecomplexity;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
  public int solution(int[] A) {
    int missing = 1;
    Set<Integer> set = new HashSet<>();
    for (int i : A) {
      set.add(i);
      if (i == missing) {
        while (set.contains(missing)) {
          missing++;
        }
      }
    }
    return missing;
  }

  public static void main(String[] args) {
    int[] A = {1, 3, 6, 4, 2};
    System.out.println(new PermMissingElem().solution(A));
  }
}
