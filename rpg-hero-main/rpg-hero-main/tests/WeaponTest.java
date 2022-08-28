import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    public void testWeaponNameField(){
        //ARRANGE
        Weapon axe = new Weapon("axe",3,Slot.WEAPON, 5, WeaponType.AXES);
        String expected = "axe";
        //ACT
        String actual = axe.name;
        //ASSERT
        assertEquals(expected, actual);

    }

    @Test
    public void testRequiredLevelFieldOnWeapon(){
        //ARRANGE
        Weapon axe = new Weapon("axe",3,Slot.WEAPON, 5, WeaponType.AXES);
        int expected = 3;
        //ACT
        int actual = axe.requiredLevel;
        //ASSERT
        assertEquals(expected, actual);
    }


    @Test
    public void testDamgeFieldonWeapon(){
        //ARRANGE
        Weapon axe = new Weapon("axe",3,Slot.WEAPON, 5, WeaponType.AXES);
        int expected = 5;
        //ACT
        int actual = axe.weaponDamage;
        //ASSERT
        assertEquals(expected, actual);
    }








}