import java.util.ArrayList;

public abstract class Hero {

    protected int level;
    protected String name;

    protected int LevelAttributes;
    protected HeroAttribute heroAttribute;

    //lists to store weapons and armor
    ArrayList<String> validWeaponType = new ArrayList<String>();
    ArrayList<String>validArmorType = new ArrayList<String>();


    //make new hero
    public Hero(String name) {
        this.name = name;
        this.level = 1;

    }


    public void levelUp(int strength, int dexterity, int intelligence) {
        level++;
        heroAttribute.incrementDexterity(dexterity);
        heroAttribute.incrementStrength(strength);
        heroAttribute.incrementIntelligence(intelligence);
        System.out.println("Level'd up");
        System.out.println("Level: " + level);


    }

    //Checks if hero can equip weapon or armor
    //If weapon/armor is not in classes list, or level is too low, an exception is thrown
    public void equipWeapon(Weapon weapon) {

        try {
            if (this.level < weapon.requiredLevel) {
                throw new InvalidWeaponException("Too low level");
            }
            if(!validWeaponType.contains(weapon.weaponType.name())){
                throw new InvalidWeaponException("Your class does not support this weapon");
            }

        } catch (InvalidWeaponException err) {
            System.err.println(err);
            return;
        }

    }

    public void equipArmor(Armor armor) {

        try {
            if (this.level < armor.requiredLevel) {
                throw new InvalidArmorException("Too low level");
            }
            if(!validArmorType.contains(armor.armorType.name())){
                throw new InvalidArmorException("Your class does not support this armor type");
            }

        } catch (InvalidArmorException err) {
            System.err.println(err);
            return;
        }

    }








}
