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
    return "Attacked " + other.getName()+ ", dealing 1 damage!";
  }

  public String support(Adventurer other){
    other.setHP(getHP() + 1);
    return "Healed " + other.getName() + ", healing 1 HP!";
  }

  public String support(){
    setHP(getHP() + 1);
    return "You healed yourself, healing 1 HP!";
  }

  public String specialAttack(Adventurer other){
    if (getSpecial() > 30){
      other.applyDamage(10);
      setSpecial(getSpecial() - 30);
      return "Used Special Attack against " + other.getName() +", dealing 10 damage!";
    }
    else {
      restoreSpecial(10);
      return "Not enough rage... you rest and regenerate 10 Rage";
    }
  }
}
