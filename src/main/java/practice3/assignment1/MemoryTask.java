package practice3.assignment1;

public class MemoryTask {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        /*"оригінальне" посилання на об'єкт */
        Something obj = new Something();

        /*друге посилання на той самий об'єкт */
        Something obj2 = obj;

        /*примітив*/
        int prim = 3;

        /*масив примітивів*/
        double[] arr = new double[3];

        System.out.println("prim = " + prim);

        /*виведеться текст такого шаблон: тип масиву + @ + хешкод */
        System.out.println("arr: " + arr);

        /*порівняння двох посилань через ==*/
        System.out.println("one object links: " + (obj == obj2));

        /*для наочності виводимо хешкод з обох посилань, який очевидно буде однаковим*/
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }

}
