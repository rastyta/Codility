package com.rasty.timecomplexity;

public class FrogJmp {
  public int solution(int X, int Y, int D){
    int distanceToJump = Y - X;
    int jumpsRequired = distanceToJump / D;
    if(distanceToJump % D != 0) {
      jumpsRequired++; //only add extra jump if remainder exists
    }
    return jumpsRequired;
  }

  public static void main(String[] args) {
    System.out.println(
    new FrogJmp().solution(10,85,30));
  }
}
