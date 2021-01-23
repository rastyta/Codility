package com.rasty.iterations;

public class BinaryGap {

  public int solution(int N) {
    char[] binaryChars = Integer.toBinaryString(N).toCharArray();
    int count = 0;
    int maxGapLength = 0;
    // loop through our binary string
    // O(log N)
    for(char e : binaryChars){
      // if we encounter a 0, then we increment our count variable
      if (e == '0') {
        count++;
      }
      // if we encounter a 1, then we are finished with our CURRENT gap
      if (e == '1') {
        // update our maxGapLength if needed
        if (count > maxGapLength) {
          maxGapLength = count;
        }
        // reset count variable so we can count the length of the next gap
        count = 0;
      }
    }
    return maxGapLength;
  }
}
