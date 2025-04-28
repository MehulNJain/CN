class animal
{}
class dog extends animal{

}
public class instancecheck {
    public static void main(String[]args)
    {
        animal a = new animal();
        dog d = new dog();
        System.out.println("is 'a' istance of Animal?"+ (a instanceof animal));
        
        System.out.println("is 'd' istance of Animal?"+ (d instanceof animal));
        System.out.println("is 'a' istance of Animal?"+ (a instanceof dog));
    }    
}
