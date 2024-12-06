public class Driver{
  public static void main(String[] args){
    Adventurer billy = new Warrior("billy", 100);
    Adventurer bob = new Warrior("bob", 100);

    System.out.println(billy.getName());
    System.out.println(billy.getHP());
    System.out.println(billy.getmaxHP());
    System.out.println(billy.attack(bob));
    System.out.println(bob.getHP());
    System.out.println(bob.specialAttack(billy));
    System.out.println(billy.getHP());

  }
}
