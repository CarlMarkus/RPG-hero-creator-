public class Warrior extends Hero {


    public Warrior(String name) {
        super(name);
        this.heroAttribute = new HeroAttribute(5,2,1);
        System.out.println("Strenght: " + heroAttribute.getStrength());
        System.out.println("Dexterity: " + heroAttribute.getDexterity());
        System.out.println("Intelligence: " + heroAttribute.getIntelligence());
        validWeaponType.add("AXES");
        validWeaponType.add("HAMMERS");
        validWeaponType.add("SWORDS");
        validArmorType.add("MAIL");
        validArmorType.add("PLATE");
       // this.validWeaponType = new WeaponType[]{};
    }

    public void levelUp() {
        super.levelUp(3, 2, 1);
    }

    @Override
    public void equipWeapon(Weapon weapon){
        super.equipWeapon(weapon);
    }



}
