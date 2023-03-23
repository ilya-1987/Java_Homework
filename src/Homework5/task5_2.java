package Homework5;

import java.util.*;
public class task5_2 {
    public static void main(String[] args) {

        System.out.println("Количество имен в списке отсортированные по убыванию");
        List<String> db = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов");
        System.out.println(getStat(db));

    }

        public static LinkedHashMap<String, Integer> getStat(List<String> db) {
        HashMap<String, Integer> base = new HashMap<>();
        LinkedHashMap<String, Integer> nb = new LinkedHashMap<>();

        // собираем кол-во повторений имен
        for (String names :
                db) {
            // Отделяем имена от фамилий
            String name = names.split(" ")[0];
            if (base.containsKey(name)) {
                int c = base.get(name);
                base.replace(name, ++c);
            } else {
                base.put(name, 1);
            }
        }

        // сортировка с сокращением объекта Map на каждом цикле. формирование нового упорядоченнго об.LinkedHashMap
        do {
            int m = 0;
            String max_key = "";
            for (Map.Entry<String, Integer> entry : base.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (value > m) {
                    m = value;
                    max_key = key;
                }
            }
            nb.put(max_key, m);
            base.remove(max_key);
        } while (!base.isEmpty());
        return nb;
    }

}