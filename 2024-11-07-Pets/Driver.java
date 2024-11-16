// By overriding the getName() method, whenever we used the getName() method with an object of the Bird class, it returns The MIGHTY, following its name.
// When we used the getName() method with an object of the Animal class, it does not add the MIGHTY...
// This tells us that overridden methods apply only in objects of the subclass with the overridden method.
// Creating Bird b2 gave us an error because an animal is not always a bird.
// In this instance, we tried defining an animal as a bird, which is not always true, resulting in an error.
// Birds are a subclass of Animals, since birds are a type of animal (a bird is an animal, but an animal is not a bird).

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
