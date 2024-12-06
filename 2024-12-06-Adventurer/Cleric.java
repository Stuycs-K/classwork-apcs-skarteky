public class Cleric extends Adventurer{
  private int mana, maxMana;

  public Cleric(String name){
    super(name);
    mana = 15;
    maxMana = 15;
  }

  public Cleric(String name, int hp, int mana){
    super(name, hp);
    this.mana = mana;
    this.maxMana = mana;
  }

  public abstract String getSpecialName(){
    return "Mana";
  }
  //accessor methods
  public abstract int getSpecial(){
    return this.mana;
  }
  public abstract void setSpecial(int n){
    mana = n;
  }
  public abstract int getSpecialMax(){
    return this.maxMana;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other){
    other.applyDamage(1);
  }

  //heall or buff the target adventurer
  // heals based on maxHp
  public abstract String support(Adventurer other){
    if(this.getMaxHP()/4 + other.getHP() > other.getMaxHP()){
        int temp = other.getHP();
        other.setHP(other.getMaxHP());
        return "Healed for " + other.getMaxHP() - temp + " HP!";
      }else {
        other.setHP(this.getMaxHP()/4 + other.getHP());
        return other.toString() + " healed for " + this.getMaxHP()/4 + " HP!";
      }
  }

  //heall or buff self
  // increase own maxHP
  public abstract String support(){
    this.setMaxHP((int)(this.getMaxHP() * 1.25));
    this.setHP((int)(this.getHP() * 1.25));
    return "Increased Max HP to " + this.getMaxHP() + " HP!";
  }

  //hurt or hinder the target adventurer, consume some special resource
  // restore hp, restore special
  public abstract String specialAttack(Adventurer other){
    if(this.getMaxHP()/2 + other.getHP() > other.getMaxHP()){
        int temp = other.getHP();
        other.setHP(other.getMaxHP());
        int temp = other.getSpecial();
        other.restoreSpecial(other.getSpecialMax()/4);
        this.mana -= 4;
        return other.toString() + " healed for " + other.getMaxHP() - temp + " HP, " + other.getSpecialName() + " restored by " + other.getSpecial() - temp + "!";
      }else {
        other.setHP(this.getMaxHP()/2 + other.getHP());
        int temp = other.getSpecial();
        other.restoreSpecial(other.getSpecialMax()/4);
        this.mana -= 4;
        return other.toString() + " healed for " + this.getMaxHP()/2 + " HP, " + other.getSpecialName() + " restored by " + other.getSpecial() - temp + "!";
      }

  }

}
