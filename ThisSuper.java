class animal{
    String name = "Animal";
    void display()
    {
        System.out.println("I am an "+ name);
    }


}
class dog extends animal{
    String name = "Dog";
    void showname(){
        System.out.println("Name using this:"+this.name);
        System.out.println("Name using Super: "+super.name);
    }
    void display(){
        System.out.println("Inside dog class");
        super.display();
    }
}

public class ThisSuper {
    public static void main(String[]args)
    {
        dog d = new dog();
        d.showname();
        d.display();

    }
    
}
