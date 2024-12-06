public class Warrior extends Adventurer{

  public Warrior(String name){
    super(name);
  }

  public Warrior(String name, int hp){
    super(name, hp);
  }

  public String attack(Adventuer other){
    other.applyDamage(1);
    return "Attacked other adventurer, dealing 1 damage!";
  }

  public String support(Adventuer other){
    other.setHP(getHP()++);
    return "Healed other adventurer, healing 1 HP!";
  }

  public static String support(){
    setHP(getHP()++);
    return "Healed other adventurer, healing 1 HP!";
  }

}
