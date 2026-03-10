package practice8.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        List<String> emptyList = new ArrayList<>();

        List<String> notEmptyList = new ArrayList<>();
        notEmptyList.add("Hello");
        notEmptyList.add("World");

        firstOrNull(emptyList);
        firstOrNull(notEmptyList);

        //2
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.21332);
        numbers.add(10);
        System.out.println(sum(numbers));

        //3
        List<Number> ids = new ArrayList<>();
        addDefaultIds(ids);
        System.out.println(ids);
    }

    private static <T> void firstOrNull(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Fist element: " + list.get(0));
        }
    }

    private static double sum(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }

    private static void addDefaultIds(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(22142123);
    }
}
