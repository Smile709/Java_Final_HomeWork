import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class PhoneBook {
        private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

        public void add(String name, Integer phoneNum) {

            if (phoneBook.containsKey(name)) {
                // Если запись существует, добавляем новый номер телефона в существующую запись
                ArrayList<Integer> phoneNumbers = phoneBook.get(name);
                phoneNumbers.add(phoneNum);
                phoneNumbers.sort(Comparator.reverseOrder());
            } else {
                // Если записи с именем name нет, создаем новую запись
                ArrayList<Integer> phoneNumbers = new ArrayList<>();
                phoneNumbers.add(phoneNum);
                phoneBook.put(name, phoneNumbers);
            }
        }
        public ArrayList<Integer> find(String name) {
        // Проверяем, существует ли запись с именем name
            if (phoneBook.containsKey(name)) {
                // Если запись существует, возвращаем список номеров телефона
                return phoneBook.get(name);
            } else {
                // Если записи с именем name нет, возвращаем пустой список
                return new ArrayList<>();
            }
        }
        public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        // Возвращаем всю телефонную книгу
            return phoneBook;
        }
}

