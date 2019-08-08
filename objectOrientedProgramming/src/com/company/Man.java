package com.company;

public class Man extends Human implements Growing {


  public Man(int age, double weight, double height) {
    super(age, weight, height);
  }


  @Override public void grow() {
    weight += 5;
    height += 5;
    System.out.println("Grow as a man");
  }

}
