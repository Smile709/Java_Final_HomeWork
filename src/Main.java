public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Sidorov", 89991234);
        myPhoneBook.add("Sidorov", 89992345);
        myPhoneBook.add("Ivanov", 89111234);
        myPhoneBook.add("Petrov", 89221234);
        myPhoneBook.add("Ivanov", 89222345);
        myPhoneBook.add("Ivanov", 89342345);
        myPhoneBook.add("Ivanov", 89522345);
        myPhoneBook.add("Zadov", 89332345);

        System.out.println(PhoneBook.getPhoneBook());
        System.out.println("Номера по запрошенному имени - " + (myPhoneBook.find("Ivanov")));
    }
}