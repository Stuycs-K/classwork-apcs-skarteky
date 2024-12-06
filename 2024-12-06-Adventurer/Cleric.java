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

  }

  //heall or buff the target adventurer
  public abstract String support(Adventurer other){

  }

  //heall or buff self
  public abstract String support(){

  }

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other){

  }

}
