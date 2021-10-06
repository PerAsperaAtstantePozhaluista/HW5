package HomeWorkLesson5;

public class HomeWork5 {

    public static void main(String[] args) {

        Employee ourEmployee = new Employee();


        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Chandler Bing", "Accountant","chan-chan@friends.com","9992223451",5000,29);
        employeesArray[1] = new Employee("Gandalf the Grey", "Head of Department", "FrodoIdiK@Mordo.ru", "6661119090", 9999,127);
        employeesArray[2] = new Employee("Mad Max", "Driver", "RoadOfFury@gmail.com", "6666666666", 10000,32);
        employeesArray[3] = new Employee("Cheshire Cat", "Guard", "smile@foreverytime.org", "8787878787", 1110, 6);
        employeesArray[4] = new Employee("Jim Carrey", "Actor", "Truman'sShow@goddamn.com", "7654389911", 90000,59);

        for ( int i = 0; i < 5; i++) {
            if (employeesArray[i].getAge() > 40) {
                System.out.println("Employee older than 40 y.e. >>>" + employeesArray[i].getInformation());
            }
        }



    }
}
