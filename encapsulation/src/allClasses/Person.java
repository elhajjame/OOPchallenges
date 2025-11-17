package allClasses;

public class Person {
    private String name;
    private int age;
    private Passport passport;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void assignPassport(Passport p){
        this.passport = p;
    }

    public Passport getPassport(){
        return passport;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    public void displayInfo(){
        System.out.println("====== passport info ======");
        System.out.println("full name: " + name);
        System.out.println("age: " + age);
    if (passport != null) {
        passport.displayPassInfo();
        }else{System.out.println("no passport assigned");}
    }
}
