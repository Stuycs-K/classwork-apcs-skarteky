//8. What is the difference before and after you override this method? What does this tell us about methods that are overridden?
//After overriding the method, only the bird constructor uses the overridden method, yet still can call the old method: the original Animal constructor still uses the old method.
//This tells us that if you override a method in a subclass, you can still access the original method, meaning that the original method is not affected.
// The one that doesn't work is the Bird variable storing an Animal object.
// This didn't work because a Bird is an Animal, but an Animal is not a Bird so it cannot be stored in a Bird variable.
// This aligns with the is-a relationship between the Bird and Animal classes, as Bird extends Animal, meaning it is an Animal, which Animal, as the suoerclass, is not a Bird.

public class Driver{
  public static void main(String[] args) {
    Animal cat = new Animal ("meow", 2, "green mario");
    Animal dog = new Animal ("woof", 2, "red luigi");
    cat.speak();
    dog.speak();
    Bird bird = new Bird ("tweet", 2, "pink daisy", 100, "pink");
    bird.speak();
    //Bird bird2 = new Animal("squack", 2, "yellow peach");
    Animal dinosaur = new Bird("caw caw", 100000000, "mark zuckerberg", 4, "green");
  }
}
