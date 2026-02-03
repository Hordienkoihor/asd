package practice2.assignment2;

public class Main {
    public static void main(String[] args) {
        int[] arr = null;

        System.out.println("min: " + ArrayStat.findMin(arr));
        System.out.println("max: " + ArrayStat.findMax(arr));
        System.out.println("avg: " + ArrayStat.calculateAvg(arr));
    }
}
