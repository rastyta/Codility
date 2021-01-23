package com.rasty.sorting;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDiscIntersections {
  public int solution(int[] A){
    int intersections = 0;
    List<Circle> circles = new ArrayList<>();
    for (int i=0; i<A.length; i++) {
      if(intersections>10000000){
        return -1;
      }
      int start = i - A[i];
      int end = i + A[i];
      for(Circle circle : circles){
        if(end < circle.start || start>circle.end){
          continue;
        }
        intersections+=1;
      }
      circles.add(new Circle(start,end));
    }
    return intersections;
  }

  public static void main(String[] args) {
    int[] A = {1, 2147483647, 0};
    System.out.println(new NumberOfDiscIntersections().solution(A));
  }

  class Circle{

    private int start = 0;
    private int end = 0;

    public Circle(int start, int end) {
      this.start = start;
      this.end = end;
    }
    public int getStart() {
      return start;
    }
    public int getEnd() {
      return end;
    }
  }
}
