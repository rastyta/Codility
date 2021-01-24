package com.rasty.leader;

import java.util.HashMap;
import java.util.Map;
//https://app.codility.com/demo/results/trainingAUGQK4-YKQ/
/**
 * An array A consisting of N integers is given. The dominator of array A is the value that occurs
 * in more than half of the elements of A.
 *
 * <p>For example, consider array A such that
 *
 * <p>A[0] = 3 A[1] = 4 A[2] = 3 A[3] = 2 A[4] = 3 A[5] = -1 A[6] = 3 A[7] = 3 The dominator of A is
 * 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7)
 * and 5 is more than a half of 8.
 *
 * <p>Write a function
 *
 * <p>class Solution { public int solution(int[] A); }
 *
 * <p>that, given an array A consisting of N integers, returns index of any element of array A in
 * which the dominator of A occurs. The function should return −1 if array A does not have a
 * dominator.
 *
 * <p>For example, given array A such that
 *
 * <p>A[0] = 3 A[1] = 4 A[2] = 3 A[3] = 2 A[4] = 3 A[5] = -1 A[6] = 3 A[7] = 3 the function may
 * return 0, 2, 4, 6 or 7, as explained above.
 *
 * <p>Write an efficient algorithm for the following assumptions:
 *
 * <p>N is an integer within the range [0..100,000]; each element of array A is an integer within
 * the range [−2,147,483,648..2,147,483,647].
 */
public class Dominator {
  public int solution(int[] A) {
    // Using "hashMap" for counting
    Map<Integer, Integer> map = new HashMap<>();

    // 1. Counting
    // map(key, value) ---> map(number, count)
    for(int i=0; i<A.length; i++){
      if( !map.containsKey(A[i]) ){ // new number
        map.put(A[i],1);          // "put" new number
      }
      else{
        int count = map.get(A[i]); // "get" count
        map.put(A[i], count+1);    // count++
      }
    }

    // 2. find the max number of counts
    int max_Number =0;
    int max_Count =0;
    // note: use "map.keySet()" in for loop
    for( int key: map.keySet() ){
      int cur_Count = map.get(key); // get value
      if( cur_Count > max_Count){
        max_Count = cur_Count;    // update max count
        max_Number = key;
      }
    }

    // 3. check if there is a "dominator" or not
    if( max_Count > (A.length)/2 ){
      // then, max_Number is the "dominator"
    }
    else{
      return -1; // no dominator
    }

    // 4. return "any index" of "the dominator"
    for(int i=0; i<A.length; i++){
      if(A[i] == max_Number){
        return i; // return the index
      }
    }

    return -1;
  }
}
