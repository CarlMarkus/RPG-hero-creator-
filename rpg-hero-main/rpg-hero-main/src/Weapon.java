public class Weapon extends Item{

    protected int weaponDamage;
    protected WeaponType weaponType;


    public Weapon(String name, int requiredLevel, Slot slot, int weaponDamage, WeaponType weaponType) {
        super(name, requiredLevel, slot);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
    }


}
