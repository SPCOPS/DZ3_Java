// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
import java.util.ArrayList;
import java.util.Collections;

public class DZ3 {
     public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println("Список 1: " + list1);

        list1.removeIf(n -> n % 2 == 0);
        System.out.println("Список без четных чисел: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        System.out.println("Список 2: " + list2);
        int min = Collections.min(list2);
        int max = Collections.max(list2);
        double average = list2.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
