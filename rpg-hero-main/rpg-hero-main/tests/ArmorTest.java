import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {

    @Test
    public void testNameFieldOnArmor(){
        //ARRANGE
        Armor plateArmor = new Armor("SuperArmor", 1, Slot.LEGS, ArmorType.PLATE);
        String expected = "SuperArmor";
        //ACT
        String actual = plateArmor.name;
        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void testRequiredLevelFieldOnArmor(){
        //ARRANGE
        Armor plateArmor = new Armor("armor", 1, Slot.LEGS, ArmorType.PLATE);
        int expected = 1;
        //ACT
        int actual = plateArmor.requiredLevel;
        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void testArmorTypeFieldInArmor(){
        //ARRANGE
        Armor plateArmor = new Armor("armor", 1, Slot.LEGS, ArmorType.PLATE);
        String expected = "PLATE";
        //ACT
        String actual = String.valueOf(plateArmor.armorType);
        //ASSERT
        assertEquals(expected, actual);
    }




}