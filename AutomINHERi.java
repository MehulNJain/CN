class Automobile{
    void showtype()
    {
        System.out.println("This is an Automobile");
    }
}

class twowheeler extends Automobile{
    void showtype()
    {
        System.out.println("THis is a 2wheeler");
    }
}

class fourwheeler extends Automobile{
    void showtype()
    {
        System.out.println("This is a 4wheeler");
    }
}

class heavy extends Automobile{
    void showtype()
    {
        System.out.println("This is a heavy vehicle");
    }
}

class frontwheel extends fourwheeler{
    void drivetype(){
        System.out.println("Front wheel drive");
    }

}

class rearwheel extends fourwheeler{
    void drivetype(){
        System.out.println("rearwheel drive");
    }
}

class allwheel extends fourwheeler{
    void drivetype()
    {
        System.out.println("All wheel drive");
    }
}

public class AutomINHERi{

    public static void main(String[]args)
    {
        twowheeler bike = new twowheeler();
        bike.showtype();

        heavy truck = new heavy();
        truck.showtype();

        frontwheel fwdcar = new frontwheel();
        fwdcar.showtype();
        fwdcar.drivetype();

        rearwheel rwdcar = new rearwheel();
        rwdcar.showtype();
        rwdcar.drivetype();

        allwheel allcar = new allwheel();
        allcar.showtype();
        allcar.drivetype();
    }
    
}
