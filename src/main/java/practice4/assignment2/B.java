package practice4.assignment2;

public class B extends A {
    @Override
    public void process(Object o) {
        System.out.println("process object B");
    }

    public void process(String string) {
        System.out.println(string);
    }
}
