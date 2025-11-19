package classes;

public class dog extends Animal {
    
    @Override
    public void makeSound(){
        System.out.println("dog bark: haw haw ");
    }
    @Override
    public void eat(){
        System.out.println("dog eat feet");
    }
    
}
