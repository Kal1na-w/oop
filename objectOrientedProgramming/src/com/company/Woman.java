package com.company;

public class Woman extends Human implements Growing {

  private int age;

  private int height;

  private double weight;

  public Woman(int age, int height, double weight) {
    super(age, height, weight);
  }

  @Override
  public void grow() {
    weight += 3;
    height += 3;
    System.out.println("Grow as a woman");
  }

  @Override
  public String toString() {
    return "Woman{" +
        "age=" + age +
        ", height=" + height +
        ", weight=" + weight +
        '}';
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}



























