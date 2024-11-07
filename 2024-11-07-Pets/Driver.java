//8. What is the difference before and after you override this method? What does this tell us about methods that are overridden?
//After overriding the method, only the bird constructor uses the overridden method: the original Animal constructor still uses the old method.
//This tells us that if you override a method in a subclass, you can still access the origianal method.
//Only the Bird storing an Animal didn't work.
// This is likely because animal doesn't have all the parameters needed to create an instance of a Bird.
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
