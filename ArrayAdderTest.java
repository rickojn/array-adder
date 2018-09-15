import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAdderTest {

    private int [] [] arrays;
    @org.junit.Before
    public void setUp() throws Exception {
        int [] array1 = new int[]{1};
        int [] array2 = new int[]{1};
        arrays = new int[][] {array1,array2};
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSum() {
        ArrayAdder arrayAdder = new ArrayAdder();
        assertEquals(2,arrayAdder.getSum(arrays));
    }
}