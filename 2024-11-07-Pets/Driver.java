public class Driver {
  public static void main(String[] args){
    Animal cat = new Animal("Meow", 5, "John");
    cat.speak();
    Bird bird = new Bird("Kawkaw", 10, "Bob", 10, "Brown");
    bird.speak();
  }
}
