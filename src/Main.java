public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");

        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Task 2");

        String lastName = "Ivanov ";
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Task 3");

        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameTrue);
    }
}