//https://app.codility.com/demo/results/trainingDYEJW5-G5N/
package com.rasty.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOfDiscIntersections {
  public int solution(int[] A){
    int intersections = 0;
    List<Integer> starts = new ArrayList<>();
    List<Integer> ends = new ArrayList<>();

    for (int i = 0; i < A.length; i++) {
      starts.add(i-A[i]);
      ends.add(i+A[i]);
    }
    Collections.sort(starts);
    Collections.sort(ends);
    //this is the tricky part to understand
    //on the left we have the boundaries of open circles, on the right the boundary of the next circle
    //as long as there are circles open (rightLimit[i] >= leftLimit[j]) and (j < A.length)
    int j = 0;
    for (int i = 0; i < A.length; i++) {
      while(j < A.length && ends.get(i) >= starts.get(j)){
        //we have circles at each position, so, as long as the left boundaries are smaller or equal to the right boundary,
        // there are circles intersecting there
        //if j surpasses j, it means we overcalculated and we start to decrease the number of intersections
        intersections += j-i;
        //pass to the next open circle
        j++;
      }
      if(intersections > 10000000) return -1;
    }
    return intersections;
  }

  public static void main(String[] args) {
    int[] A = {1, 5, 2, 1, 4, 0};
    System.out.println(new NumberOfDiscIntersections().solution(A));
  }
}
