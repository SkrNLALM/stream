import java.sql.SQLOutput;
import java.util.List;


public class EmployeeTest {


    public static void main(String[] args) {


    //Print all emails -One employee has one email One To One
            EmployeeData.readAll()
            .map(Employee::getEmpEmail)
            .forEach(System.out::println);

            //Print  all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        //with FlatMap
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println( "******************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
}
}
