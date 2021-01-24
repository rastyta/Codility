package com.rasty.stacksandqueues;

import java.util.Stack;

//https://app.codility.com/demo/results/trainingQJVQ6H-RVK/
/**
 * A string S consisting of N characters is considered to be properly nested if any of the following
 * conditions is true:
 *
 * <p>S is empty; S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string; S has
 * the form "VW" where V and W are properly nested strings. For example, the string "{[()()]}" is
 * properly nested but "([)()]" is not.
 *
 * <p>Write a function:
 *
 * <p>class Solution { public int solution(String S); }
 *
 * <p>that, given a string S consisting of N characters, returns 1 if S is properly nested and 0
 * otherwise.
 *
 * <p>For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the
 * function should return 0, as explained above.
 *
 * <p>Write an efficient algorithm for the following assumptions:
 *
 * <p>N is an integer within the range [0..200,000]; string S consists only of the following
 * characters: "(", "{", "[", "]", "}" and/or ")".
 */

public class Brackets {
  public int solution(String S){
    // main idea: use "Stack" (push and pop)
    //special cases
    if(S.length() == 0) return 1;
    if(S.length() % 2 != 0) return 0;

    // new Stack<Character>()
    Stack<Character> stack = new Stack<>();
    // scan the string (just one pass)
    for(int i=0; i< S.length(); i++){
      // note: push "its pair"
      if( S.charAt(i) == '(' ){
        stack.push(')');
      }
      else if( S.charAt(i) == '[' ){
        stack.push(']');
      }
      else if( S.charAt(i) == '{' ){
        stack.push('}');
      }
      // pop and check
      else if( S.charAt(i) == ')' || S.charAt(i) == ']' || S.charAt(i) == '}'){
        // important: check if the stack is empty or not (be careful)
        if(stack.isEmpty()){
          return 0;
        }
        else{
          if(stack.pop() != S.charAt(i)){ // not a pair
            return 0;
          }
        }
      }
    }
    // note: check if the stack is empty or not
    if(stack.isEmpty())
      return 1;
    return 0;

  }

  public static void main(String[] args) {
    String S1 = "{[()()]}";
    System.out.println(new Brackets().solution(S1));
    String S2 = "([)()]";
    System.out.println(new Brackets().solution(S2));
  }
}
