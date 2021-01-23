package com.rasty.countingelements;

import java.util.Arrays;

public class MaxCounters {
  public int[] solution(int N, int[] A){
    final int condition = N + 1;
    int currentMax = 0;
    int lastUpdate = 0;
    int[] countersArray = new int[N];

    for (int currentValue : A) {
      if (currentValue == condition) {
        lastUpdate = currentMax;
      } else {
        int position = currentValue - 1;
        if (countersArray[position] < lastUpdate)
          countersArray[position] = lastUpdate + 1;
        else
          countersArray[position]++;

        if (countersArray[position] > currentMax) {
          currentMax = countersArray[position];
        }
      }

    }

    for (int iii = 0; iii < N; iii++) {
      if (countersArray[iii] < lastUpdate)
        countersArray[iii] = lastUpdate;
    }

    return countersArray;
  }

  public static void main(String[] args) {
    int[] A = {3,4,4,6,1,4,4};
    System.out.println(Arrays.toString(new MaxCounters().solution(5, A)));
  }
}
