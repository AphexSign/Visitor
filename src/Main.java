public class Main {
    public static void main(String[] args) {

        Cat cat=new Cat("Vasya");
        Dog dog=new Dog("Sharik");
        System.out.println(cat.getName());

        VisitorCry funkCry=new VisitorCry();
        VisitorEat funkEat=new VisitorEat();

        cat.accept(funkCry);
        dog.accept(funkEat);


    }
}
