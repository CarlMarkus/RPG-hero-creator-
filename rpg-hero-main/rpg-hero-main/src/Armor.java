public class Armor extends Item {

    protected ArmorType armorType;

    public Armor(String name, int requiredLevel, Slot slot, ArmorType armorType) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
    }
}
