package collectionsHomework;
/*Написать простой класс PhoneBook(внутри использовать HashMap):
В качестве ключа использовать фамилию
В каждой записи всего два поля: phone, e-mail
Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов), и отдельный метод для поиска e-mail по фамилии.*/

public class MainClass {

    public static void main(String[] args){

        PhoneBook phonebook = new PhoneBook();

        System.out.println("Содержимое справочника");
        phonebook.add("Васильев", "89945556644", "vaas@mail.ru");
        phonebook.add("Савельев", "87775554466","sava@mail.ru");
        phonebook.add("Васильев", "89445558899", "basil@mail.ru");
        phonebook.add("Михайлов", "89654321144", "mishan9@mail.ru");
        phonebook.add("Иванов", "89663335588","van@mail.ru");
    

        System.out.println("Получаем номера телефонов и email-ы:");
        System.out.println("Васильев:");
        System.out.println(phonebook.getPhone("Васильев"));
        System.out.println(phonebook.getMail("Васильев"));
        System.out.println("Савельев:");
        System.out.println(phonebook.getPhone("Савельев"));
        System.out.println(phonebook.getMail("Савельев"));
        System.out.println("Михайлов:");
        System.out.println(phonebook.getPhone("Михайлов"));
        System.out.println(phonebook.getMail("Михайлов"));
        System.out.println("Иванов:");
        System.out.println(phonebook.getPhone("Иванов"));
        System.out.println(phonebook.getMail("Иванов"));
        



        }
}

