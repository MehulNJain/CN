class animal{
    private String privatevar = "I am Private";
    protected String protectedvar= "I am Protected";
    public String publicvar = "I am Public";

    public void display(){
        System.out.println("Inside animal class");
        System.out.println(privatevar);
        System.out.println(protectedvar);
        System.out.println(publicvar);
    }
}
class dog extends animal{
    public void show(){
        System.out.println("Inside dog class");
        //HERE private var is not accessible !!
        System.out.println(protectedvar);
        System.out.println(publicvar);
    }
}

public class singleinheri {
    public static void main(String[]args)
    {
        dog d = new dog();
        d.show();
        d.display();


    }
}
