public class VisitorEat extends Visitor{

    public void visit(Cat cat){
        System.out.println(cat.getName()+" ест как кошка - рыбу");
    }

    public void visit(Dog dog){
        System.out.println(dog.getName()+" ест как собака - кусок мясо");
    }




}
