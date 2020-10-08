package collectionsHomework;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook{

    private final HashMap<String, ArrayList<Person>> book= new HashMap<>();


    public void add(String surname, String number, String email){
        if(book.containsKey(surname)){
            ArrayList<Person> database= book.get(surname);
            database.add(new Person(surname, number, email));
        } else {
            ArrayList<Person> database= new ArrayList<>();
            database.add(new Person(surname, number, email));
            book.put(surname,database);
        }
    }
    public ArrayList<String> getMail(String surname){
        if(!book.containsKey(surname)) return null;
        ArrayList<Person> database= book.get(surname);
        ArrayList<String> result= new ArrayList<>();
        for (int i = 0; i<database.size(); i++){
            result.add(database.get(i).email);
        }
        return result;
    }

    public ArrayList<String> getPhone(String surname){
        if(!book.containsKey(surname)) return null;
        ArrayList<Person> database= book.get(surname);
        ArrayList<String> result= new ArrayList<>();
        for (int i = 0; i<database.size(); i++){
            result.add(database.get(i).number);
        }
        return result;

    }



}