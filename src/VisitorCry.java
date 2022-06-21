public class VisitorCry extends Visitor{

    public void visit(Cat cat){
        System.out.println(cat.getName()+" делает мяу-мяу");
    }

    public void visit(Dog dog){
        System.out.println(dog.getName()+" делает гав-гав");
    }


}
