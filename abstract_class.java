abstract class Animal
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName()
    {
        return name;
    }
}

// Abstracted class
class Dogs extends Animal
{
    public Dogs(String name)
    {
        super(name);
    }

    public void makeSound()
    {
        System.out.println(getName() + " barks");
    }
}

// Abstracted class
class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    public void makeSound()
    {
        System.out.println(getName() + " meows");
    }
}

public class abstract_class
{
    public static void main(String[] args)
    {
        Animal myDog = new Dogs("Buddy");
        Animal myCat = new Cat("Fluffy");

        myDog.makeSound();
        myCat.makeSound();
    }

}
