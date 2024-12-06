public class Warrior extends Adventurer{

  private String specialName = "Rage";
  private int special = 100;
  private int maxSpecial = 100;

  public Warrior(String name){
    super(name);
  }

  public Warrior(String name, int hp){
    super(name, hp);
  }

  public String getSpecialName(){
    return specialName;
  }

  public int getSpecial(){
    return special;
  }

  public void setSpecial(int n){
    this.special = n;
  }

  public int getSpecialMax(){
    return maxSpecial;
  }

  public String attack(Adventurer other){
    other.applyDamage(1);
    return "Attacked other adventurer, dealing 1 damage!";
  }

  public String support(Adventurer other){
    other.setHP(getHP() + 1);
    return "Healed other adventurer, healing 1 HP!";
  }

  public String support(){
    setHP(getHP() + 1);
    return "Healed other adventurer, healing 1 HP!";
  }

  public String specialAttack(Adventurer other){
    if (get)
    other.applyDamage(1);
    return "Attacked other adventurer, dealing 1 damage!";
  }
}
