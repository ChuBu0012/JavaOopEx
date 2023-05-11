class Programmer extends Employee {
    public String Skill = "Java Javascript";

    public Programmer(String name, Double salary) {
        super(name, salary);
        bonus();
        System.out.println("I'm Programmer!");
        displayEmployee();
    }

    public void bonus() {
        System.out.println("Bonus = 50%");
    }
}
