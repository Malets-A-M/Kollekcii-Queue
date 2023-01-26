import java.util.Random;

public class Person {
    private String name;
    private String surname;
    private int tickets;

    private String[] arrName = new String[] {"Андрей", "Петя", "Вася", "Коля", "Игорь", "Миша", "Витя", "Саша", "Таня", "Оля", "Света", "Лена"};
    private String[] arrSurname = new String[] {"Иванов", "Петров", "Фомин", "Лобанов", "Рязанцев", "Жданов", "Пупкин"};

    public Person(){
        Random random = new Random();
        this.name = arrName[random.nextInt(arrName.length - 1)];
        this.surname = arrSurname[random.nextInt(arrSurname.length - 1)];
        tickets = random.nextInt(10) + 1;
        System.out.println(name + " " + surname + " || Билетов: " + tickets);
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getTickets(){
        return tickets;
    }
    public int changeTickets(){
        if (tickets !=0){
            tickets--;
        }
        return tickets;
    }

    @Override
    public String toString() {
        return name + " " + surname + " || Билетов: " + tickets;
    }
}

