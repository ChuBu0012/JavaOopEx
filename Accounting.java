class Accounting extends Employee {
    public String Skill = "Manage Money";

    public Accounting(String name, Double salary) {
        super(name, salary);
        System.out.println("I'm Accounting!");
        displayEmployee();
    }
}
