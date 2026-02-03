package practice3.assignment2;

public class ChildInit extends BaseInit {

    /*static block*/
    static {
        System.out.println("static block child init");
    }

    /*instance block*/
    {
        System.out.println("instance block child init");
    }

    /*constructor*/
    public ChildInit() {
        System.out.println("constructor child init");
    }
}
