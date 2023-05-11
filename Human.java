class Human {
    public void skill() {
        System.out.println("No skill");
    }

    public void skill(String... lang) {
        System.out.print("Skill = ");
        for (String skill : lang) {
            System.out.print(skill + " ");
        }
    }
}
