import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PaginationHelperTest2 {
    char [] items = {'a','b','c','d'};
    PaginationHelper pHelper = new PaginationHelper(items, 4);

    @Test
    @DisplayName("pageCount() Method Test")
    public void pageCountTest () {
        assertEquals(pHelper.pageCount() , 1);
        assertNotEquals(pHelper.pageCount(),34);
    }

    @Test
    @DisplayName("itemCount() Method Test")
    public void itemCountTest () {
        assertEquals(pHelper.itemCount() ,4 );
        assertNotEquals(pHelper.itemCount() , 5);
    }

    @Test
    @DisplayName("pageIndex() Method Test")
    public void pageIndexTest(){
        assertEquals(pHelper.pageIndex(5) ,-1);
        assertEquals(pHelper.pageIndex(2),0);
        assertEquals(pHelper.pageIndex(10), -1);
        assertEquals(pHelper.pageIndex(-10), -1);
    }

}
