class IronMan extends SuperHero implements SkillHero, Nation {
    public IronMan() {
        setName("IronMan");
        setAge("38");
    }

    public void skill(String skill) {
        System.out.println(skill);
    }

    public void moving(String moving) {
        System.out.println("Moving = " + moving);
    }

    public void waepon(String waepon) {
        System.out.println("Weapon = " + waepon);

    }

    public void jump(String jump) {
        System.out.println("Jump = " + jump);

    }

    public void setNation(String nation){
        
    }
}
