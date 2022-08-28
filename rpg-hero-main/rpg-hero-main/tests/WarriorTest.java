import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    public void testWarriordefaultAttributesWhenCreated(){
        //ARRANGE
        Warrior warriorTest = new Warrior("WarriorName");
        HeroAttribute expected = new HeroAttribute(5,2,1);
        //ACT
        HeroAttribute actual= warriorTest.heroAttribute;
        //ASSERT
        assertEquals(expected,actual);
    }

    @Test
    public void testIfLevelUpIncrementsAttributesWithTheCorrectAmount() {
        //ARRANGE
        Warrior warriorTest =  new Warrior("WarriorName");
        warriorTest.levelUp();
        HeroAttribute expected = new HeroAttribute(8,4,2);
        //ACT
        HeroAttribute actual = warriorTest.heroAttribute;
        //ASSERT
        assertEquals(expected, actual);
    }



    @Test
    void levelUp() {



    }

    @Test
    public void testIfWarriorCanEquipAxe() {
        //ARRANGE
        Warrior warriorTest =  new Warrior("WarriorName");
        Weapon axe = new Weapon("axe",1,Slot.WEAPON, 5, WeaponType.AXES);



    }
}