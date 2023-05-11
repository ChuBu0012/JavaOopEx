abstract class SuperHero {
    private String name;
    private String age;
    private String job;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void displayHero() {
        System.out.println("Name = " + this.name + "\nAge = " + this.age + "\nJob = " + this.job);
    }

    public abstract void skill(String skill);
}
