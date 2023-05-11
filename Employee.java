import java.util.Random;

class Employee {
    private String id;
    private String name;
    private Double salary;

    // const static variable
    static final int MINSALARY = 12000;

    // Constructor
    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Double salary) {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high - low) + low;
        this.id = String.valueOf(result);
        this.name = name;
        this.salary = salary;
    }

    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // seter Method
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // geter Method
    public void displayEmployee() {
        System.out.println("ID = " + this.id + "\n" + "Name = " + this.name + "\n" + "Salary = " + this.salary + "\n");
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void bonus(){
        System.out.println("Hello Bonus!");
    };
}
