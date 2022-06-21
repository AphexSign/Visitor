public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public String getName(){
        return super.getName();
    }

    public void accept(Visitor visitor){
        visitor.visit(this);

    }
}
