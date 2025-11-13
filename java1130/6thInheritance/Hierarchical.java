class Animal
{
    void eat()

  {
        System.out.println("Animal is eating at my home");
  }

}

class Dog extends Animal
{
    void bhaw()

   {
        System.out.println("Dog is doing bhaw bhaw with me!");
   }

}

class Cat extends Animal
 {
    void meow()
   {
        System.out.println("Cat is doing meow meow with me!");
   }
 }

class Hierarchical
{
    public static void main(String args[])
  {
        Dog dog = new Dog();
        dog.eat();
        dog.bhaw(); 

        Cat cat = new Cat();
        cat.eat();
        cat.meow(); 

   }
}