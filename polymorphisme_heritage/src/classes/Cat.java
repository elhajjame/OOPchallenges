package classes;

public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("cat said : mew mew");
    }

    @Override
    public void eat(){
        System.out.println("cat eats : fish!");
    }
}
