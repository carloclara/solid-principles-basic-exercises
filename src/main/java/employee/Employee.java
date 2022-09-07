package employee;

public class Employee {

    private int id;
    private String name;
    private int age;

    Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void printEmployeeDetails() {
        System.out.println("ID: "+ id
            + " NAME: " + name
            + " AGE:" + age);
    }

}
