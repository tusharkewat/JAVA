package Encapsulation;

class Employee {
    private int id;
    private String name;
    private int salary;

    void setValues(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void getDetails() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class Office {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setValues(31, "Tushar", 100000);
        obj.getDetails();
    }

}
