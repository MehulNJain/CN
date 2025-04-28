package JavaPOE;

class SuperClass {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    private void privateMethod() {
        System.out.println("Private Method of SuperClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method of SuperClass");
    }

    public void publicMethod() {
        System.out.println("Public Method of SuperClass");
    }
}

class SubClass extends SuperClass {
    void accessSuperClassMembers() {
        System.out.println(protectedVar);
        System.out.println(publicVar);
        protectedMethod();
        publicMethod();
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        System.out.println(obj.publicVar);
        obj.publicMethod();
        obj.accessSuperClassMembers();
    }
}
