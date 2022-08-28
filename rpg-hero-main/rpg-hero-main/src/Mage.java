public class Mage extends Hero{

    public Mage(String name) {
        super(name);
        this.heroAttribute = new HeroAttribute(1,1,8);
        validWeaponType.add("STAFFS");
        validWeaponType.add("WANDS");
        validArmorType.add("CLOTH");
    }

    public void levelUp() {
        super.levelUp(1, 1, 5);
    }

    @Override
    public void equipWeapon(Weapon weapon){
        super.equipWeapon(weapon);
    }







}
