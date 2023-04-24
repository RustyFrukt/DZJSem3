/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */

 import java.util.HashMap;
 import java.util.Map;
 public class planets {
     public static void main(String[] args) {
         String message = "Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон, Юпитер, Сатурн, Венера";
         String[] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
 
         Map<String, Integer> counterMap = new HashMap<>();
         for (String word : words) {
             if (!word.isEmpty()) {
                 Integer count = counterMap.get(word);
                 if (count == null) {
                     count = 0;
                 }
                 counterMap.put(word, ++count);
             }
         }
 
         for (String word : counterMap.keySet()) {
             System.out.println(word + ": " + counterMap.get(word));
         }
     }
 }