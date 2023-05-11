abstract class Student {
    private String id;

    public abstract void Register();

    public abstract void PreTest();

    public abstract void PostTest();

    public void setID(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
