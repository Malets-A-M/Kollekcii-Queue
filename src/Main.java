import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> personList = new LinkedList<>();
        generateClients((List<Person>) personList);
        while (personList.size()>0){
            if (personList.peek().getTickets() > 1){
                personList.peek().changeTickets();
                System.out.println(personList.peek().getName() + " " + personList.peek().getSurname() + " прокатился на аттракционе. Билетов осталось: " + personList.peek().getTickets());
                personList.add(personList.poll());
            } else {
                personList.peek().changeTickets();
                System.out.println(personList.peek().getName() + " " + personList.peek().getSurname() + " прокатился на аттракционе. Билетов осталось: " + personList.peek().getTickets());
                personList.poll();
                System.out.println("Очередь: " + personList.size());
            }
        }
    }

    public static List<Person> generateClients(List<Person> personList) {

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        return personList;
    }
}