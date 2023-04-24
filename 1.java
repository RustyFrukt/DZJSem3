/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
import java.util.*;
public class del {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> new_list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(generateRandomInt(20));
            }
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % 2 != 0){
                    new_list.add(list.get(j));
                }
            }
            System.out.println(list);
            System.out.println(new_list);
        }
        public static int generateRandomInt(int upperRange){
            Random random = new Random();
            return random.nextInt(upperRange);
        }
    }