package practice3.assignment2;


/*
* Порядок ініциалізації буде:
*   static parent
*   static child
*           |
*   instance parent
*   constructor parent
*           |
*   instance parent
*   constructor parent
* */

public class InitOrderTask {
    public static void run() {
        new ChildInit();
    }

    public static void main(String[] args) {
        InitOrderTask.run();
    }
}
