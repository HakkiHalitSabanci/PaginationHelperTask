import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PaginationHelperTest3 {
    char [] items = {'a','b','c','d','e','f','g','h'};
    PaginationHelper pHelper = new PaginationHelper(items, 2);

    @Test
    @DisplayName("pageCount() Method Test")
    public void pageCountTest () {
        assertEquals(pHelper.pageCount() , 4);
        assertNotEquals(pHelper.pageCount(),1);
    }

    @Test
    @DisplayName("itemCount() Method Test")
    public void itemCountTest () {
        assertEquals(pHelper.itemCount() , 8);
        assertNotEquals(pHelper.itemCount() , 5);
    }

    @Test
    @DisplayName("pageIndex() Method Test")
    public void pageIndexTest(){
        //'a','b','c','d','e','f','g','h'
        // 0   1   2   3   4   5   6   7
        //[a,b] , [c,d] , [e,f] , [g,h]
        //  0       1       2       3
        assertEquals(pHelper.pageIndex(5) ,2);
        assertEquals(pHelper.pageIndex(2),1);
        assertEquals(pHelper.pageIndex(10), -1);
        assertEquals(pHelper.pageIndex(-10), -1);
    }

}
