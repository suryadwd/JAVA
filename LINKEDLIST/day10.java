package LINKEDLIST;

public class day10 {

  public static void main(String[] args) {
    
    Car c1 = new Car(76,"syraj");
    System.out.println(c1.name);

  }
}

// Define the Car class
class Car {
  int price;
  String name;

  Car(int price, String name) {
    this.price = price;
    this.name = name;
  }
}
