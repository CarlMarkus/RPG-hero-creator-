public class Ranger extends Hero {
    public Ranger(String name) {
        super(name);
        this.heroAttribute = new HeroAttribute(1,7,1);
        validWeaponType.add("BOWS");
        validArmorType.add("LEATHER");
        validArmorType.add("MAIL");
    }


    public void levelUp() {
        super.levelUp(1, 5, 1);
    }
}
