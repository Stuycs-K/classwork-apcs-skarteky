public class Cleric extends Adventurer{
  private int mana, maxMana;

  public Cleric(String name){
    super(name);
    mana = 15;
    maxMana = 15;
  }

  public Cleric(String name, int hp){
    super(name, hp);
    mana = 15;
    maxMana = 15;
  }

  public Cleric(String name, int hp, int mana){
    super(name, hp);
    this.mana = mana;
    this.maxMana = mana;
  }

  public Cleric(){
    this("Nigel");
  }

  public String getSpecialName(){
    return "Mana";
  }
  //accessor methods
  public int getSpecial(){
    return this.mana;
  }
  public void setSpecial(int n){
    mana = n;
  }
  public int getSpecialMax(){
    return this.maxMana;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.applyDamage(1);
    return "Attacked " + other.toString() + " for 1 HP!";
  }

  //heall or buff the target adventurer
  // heals based on maxHp
  public String support(Adventurer other){
    if(getmaxHP()/4 + other.getHP() > other.getmaxHP()){
        int temp = other.getHP();
        other.setHP(other.getmaxHP());
        return "Healed for " + (other.getmaxHP() - temp) + " HP!";
      }else {
        other.setHP(getmaxHP()/4 + other.getHP());
        return other.toString() + " healed for " + getmaxHP()/4 + " HP!";
      }
  }

  //heall or buff self
  // increase own maxHP
  public String support(){
    setmaxHP((int)(getmaxHP() * 1.25));
    setHP((int)(getHP() * 1.25));
    return "Increased Max HP to " + getmaxHP() + " HP!";
  }

  //hurt or hinder the target adventurer, consume some special resource
  // restore hp, restore special
  public String specialAttack(Adventurer other){
    if(getSpecial() > 3){
    if(getmaxHP()/2 + other.getHP() > other.getmaxHP()){
        int temp = other.getHP();
        other.setHP(other.getmaxHP());
        int temp2 = other.getSpecial();
        other.restoreSpecial(other.getSpecialMax()/4);
        this.mana -= 4;
        return other.toString() + " healed for " + (other.getmaxHP() - temp) + " HP, " + other.getSpecialName() + " restored by " + (other.getSpecial() - temp2) + "!";
      }else {
        other.setHP(getmaxHP()/2 + other.getHP());
        int temp = other.getSpecial();
        other.restoreSpecial(other.getSpecialMax()/4);
        this.mana -= 4;
        return other.toString() + " healed for " + getmaxHP()/2 + " HP, " + other.getSpecialName() + " restored by " + (other.getSpecial() - temp) + "!";
      }
    }else {
      return "Failed to heal " + other + ", instead: " + support();
    }

  }

}
