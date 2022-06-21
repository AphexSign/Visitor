public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public String getName(){
        return super.getName();
    }

    public void accept(Visitor visitor){
        visitor.visit(this);

    }

}
