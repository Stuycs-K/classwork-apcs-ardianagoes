// When we overrided the getName() method, whenever we use the getName() with an object of the bird class, it returns The MIGHTY and the name/
// When we use the getName() method with an object of the Animal class, it will not add the MIGHTY...

// This gave us an error because an animal is not always a bird.
// In this instance, we tried defining a bird as an animal, which is not always true, resulting in an error.
//

public class Driver {
  public static void main(String[] args){
    Animal cat = new Animal("Meow", 5, "John");
    cat.speak();
    Bird bird = new Bird("Kawkaw", 10, "Bob", 10, "Brown");
    bird.speak();
    Animal a1 = new Animal("Woof", 6, "Doug");
    Bird b1 = new Bird("Roof", 100, "Billy", 50, "Green");
    //Bird b2 = new Animal("Hehe", 4, "Ardian");
    Animal a2 = new Bird("Pewpew", 24, "Bobby", 2, "Pink");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
