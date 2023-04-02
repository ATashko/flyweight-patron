import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClothesFactoryTest {

    @Test
    void getTheRightElement(){
        Clothes clothes = ClothesFactory.getClothesMap("XS", "Hoodie", false, false);

        assertEquals(clothes.getSize(), "XS");
        assertEquals(clothes.getType(), "Hoodie");
        assertFalse(clothes.isNew());
        assertFalse(clothes.isInternational());
    }

    @Test
    void getFactorySize(){
        Clothes hoodie = ClothesFactory.getClothesMap("XS", "Hoodie", false, false);
        Clothes hoodie1 = ClothesFactory.getClothesMap("XS", "Hoodie", false, false);
        Clothes pants = ClothesFactory.getClothesMap("XS", "Pants", false, false);
        Clothes pants2 = ClothesFactory.getClothesMap("XS", "Pants", false, false);

        assertEquals(2, ClothesFactory.clothesMap.size());
        assertTrue(ClothesFactory.clothesMap.size() == 2);

    }


}