/*
Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
 */
import java.util.*;
public class minmaxsr {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(generateRandomInt(20));
            }
            double average = 0;
            for (int i = 0; i < list.size(); i++) {
                average += list.get(i);
            }
            System.out.println(list);
            System.out.println("Минимальный элемент: " + Collections.min(list));
            System.out.println("Максимальный элемент: " + Collections.max(list));
            System.out.println("Среднее значение: " + average / list.size());
        }
        public static int generateRandomInt(int upperRange){
            Random random = new Random();
            return random.nextInt(upperRange);
        }
    }