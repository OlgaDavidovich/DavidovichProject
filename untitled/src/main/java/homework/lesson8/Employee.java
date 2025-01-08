package homework.lesson8;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
      /*  @Override
        public String toString () {
            return "My name is " + fio + '\n' + "my position is " + position + '\n' +
                    "my email is " + email + '\n' + "my phone is " + phone + '\n' +
                    "my salary is " + salary + '\n' + "my age is " + age;
        } */
    public void printInfo () {
            System.out.println("My name is " + fio + '\n' + "my position is " + position + '\n' +
                    "my email is " + email + '\n' + "my phone is " + phone + '\n' +
                    "my salary is " + salary + '\n' + "my age is " + age);
        }
    public static void main(String[] args) {


        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        emplArray[1] = new Employee("Sidorov Siarhei", "QA", "serhei@mail.ru", 298522323, 35000, 28);
        emplArray[2] = new Employee("Petrov Petr", "DevOps", "petrov@mail.ru", 298895236, 40000, 42);
        emplArray[3] = new Employee("Gomer Anna", "AQA", "anna@mail.ru", 298589523, 45000, 38);
        emplArray[4] = new Employee("Tild Andrey", "CEO", "andrey@mail.ru", 291111111, 190000, 45);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age>40) {
                emplArray[i].printInfo();
                System.out.println("==================");
            }
        }
    }
}
