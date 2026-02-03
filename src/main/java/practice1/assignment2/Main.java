package practice1.assignment2;

import Assignment1.Dog;

public class Main {
    public static void main(String[] args) {
        /* first subtask */
        String firstStr = new String("hello");
        String secondStr = new String("hello");

        System.out.println("Comparing via == : " + (firstStr == secondStr));
        System.out.println("Comparing via equals : " + firstStr.equals(secondStr));
        System.out.println();

        /* second subtask */
        for (int i = -128; i <= 127; i++) {
            Integer a = i;

            if (a == i) {
                System.out.println(i + ":  однакові (true)");
            }
        }
        System.out.println();


        /* third subtask */
        /*
        * Висновок:
        *   Об'єкти класів при порівнянні через == порівнюють лише посилання
        *   Для глибокого порівняння потрібно використовувати метод equals()
        *   Однак для обгорток це наче не є так
        * */

        /* fourth subtask */

        Dog dog = new Dog("test Dog 2", "breed 1");
        Dog dog2 = new Dog("test Dog 2", "breed 2");
        Dog dog3 = new Dog("test Dog 3", "breed 2");
        Dog dog4 = new Dog("test Dog 2", "breed 2");

        System.out.println("Comparing with different breeds same name (expected false): " + dog.equals(dog2));
        System.out.println("Comparing with same fields (expected true): " + dog2.equals(dog4));
        System.out.println("Comparing with different name same breed (expected false): " + dog3.equals(dog2));



    }
}
