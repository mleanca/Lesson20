package Lesson20Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Joey", "Manager", true, true, false, 37, "Management"));
        employeeList.add(new Employee("Gina", "Project Manager", true, true, false, 30, "Management"));
        employeeList.add(new Employee("Rina", "Senior Programmer", true, true, true, 40, "Management"));
        employeeList.add(new Employee("Leo", "Senior Programmer", true, true, true, 32, "Software"));
        employeeList.add(new Employee("Mateo", "Junior Programmer", true, false, true, 23, "Software"));
        employeeList.add(new Employee("Maria", "Intern", false, false, true, 20, "Non-management"));



        System.out.println("1.Employees who can conduct the interview, are over 25, paid per hour, and in the Management level/department (max 5 entries): ");
        List<Employee> employeesWhoInterviewAndOver25 = employeeList.stream()
                .filter(e -> e.canConductInterview() && e.paidPerHour() && e.getAge() > 25 && e.getDepartment().equals("Management"))
                .limit(5)
                .collect(Collectors.toList());

        employeesWhoInterviewAndOver25.forEach(e -> System.out.println(e.getName()));

        //1.Employees who can conduct the interview, are over 25, paid per hour, and in the Management level/department (max 5 entries):
        //Rina
        //Leo



        System.out.println();
        System.out.println("2.Employees who are not paid per hour and over 30:");
        List<String> employeesNotPaidPerHourAndOver30 = employeeList.stream()
                .filter(e -> !e.paidPerHour() && e.getAge() > 30)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        employeesNotPaidPerHourAndOver30.forEach(name -> System.out.println(name));

        //2.Employees who are not paid per hour and over 30:
        //Joey



        System.out.println();
        System.out.println("3.Employees who can train, conduct interview, and in Software Department:");
        List<String> employeesWhoCanTrainInterviewSoftware = employeeList.stream()
                .filter(e -> e.canConductInterview() && e.canAttendTraining() && e.getDepartment().equals("Software"))
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        employeesWhoCanTrainInterviewSoftware.forEach(name -> System.out.println(name));

        //3.Employees who can train, conduct interview, and in Software Department:
        //Leo


    }
}
