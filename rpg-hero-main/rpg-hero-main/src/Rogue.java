public class Rogue extends Hero{


    public Rogue(String name) {
        super(name);
        this.heroAttribute = new HeroAttribute(2, 6, 1);
        validWeaponType.add("DAGGERS");
        validWeaponType.add("SWORDS");
        validArmorType.add("MAIL");
        validArmorType.add("LEATHER");
    }

    public void levelUp() {
        super.levelUp(1, 4, 1);
    }

    @Override
    public void equipWeapon(Weapon weapon){
        super.equipWeapon(weapon);
    }




}
