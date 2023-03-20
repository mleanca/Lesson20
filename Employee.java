package Lesson20Ex;

public class Employee {

    private String name;
    private String job;
    private boolean canAttendTraining;
    private boolean canConductInterview;
    private boolean paidPerHour;
    private int age;
    private String department;

    public Employee(String name, String job, boolean canAttendTraining, boolean canConductInterview, boolean paidPerHour, int age, String department) {
        this.name = name;
        this.job = job;
        this.canAttendTraining = canAttendTraining;
        this.canConductInterview = canConductInterview;
        this.paidPerHour = paidPerHour;
        this.age = age;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public boolean canConductInterview() { return canConductInterview; }

    public boolean canAttendTraining() {
        return canAttendTraining;
    }

    public boolean paidPerHour() {
        return paidPerHour;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
