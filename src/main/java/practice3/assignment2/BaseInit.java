package practice3.assignment2;

public class BaseInit {

    /*static block*/
    static {
        System.out.println("static block base init");
    }

    /*instance block*/
    {
        System.out.println("instance block base init");
    }

    /*constructor*/
    public BaseInit() {
        System.out.println("constructor BaseInit");
    }
}
