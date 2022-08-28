import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    public void testMageDefaultAttributesWhenCreated(){
        //ARRANGE
        Mage mageTest = new Mage("MageName");
        HeroAttribute expected = new HeroAttribute(1,1,8);
        //ACT
        HeroAttribute actual = mageTest.heroAttribute;
        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void testIfLevelUpIncrementsAttributesWithTheCorrectAmount() {
        //ARRANGE
        Mage mageTest =  new Mage("MageName");
        mageTest.levelUp();
        HeroAttribute expected = new HeroAttribute(2,2,13);
        //ACT
        HeroAttribute actual = mageTest.heroAttribute;
        //ASSERT
        assertEquals(expected, actual);

    }

}