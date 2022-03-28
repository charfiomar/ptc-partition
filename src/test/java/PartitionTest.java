import org.junit.Test;

import static fr.ptc.Partition.partition;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public class PartitionTest {

    protected final int[] _NULL_ITEMS_LIST = null;
    protected final int[] _EMPTY_ITEMS_LIST = {};
    protected final int[] _1_ITEM_LIST = {1};
    protected final int[] _3_ITEMS_LIST = {1, 2, 3};
    protected final int[] _5_ITEMS_LIST = {1, 2, 3, 4, 5};

    @Test
    public void testPartitionWithNullList() {
        int[][] result = partition(_NULL_ITEMS_LIST, 1);
        assertNull(result);
    }

    @Test
    public void testPartitionWithEmptyList() {
        int[][] result = partition(_EMPTY_ITEMS_LIST, 1);
        assertNull(result);
    }

    @Test
    public void testPartitionWith1ItemList() {
        int[][] result;

        result = partition(_1_ITEM_LIST, 1);
        assertArrayEquals(result, new int[][]{{1}});

        result = partition(_1_ITEM_LIST, 2);
        assertArrayEquals(result, new int[][]{{1}});

        result = partition(_1_ITEM_LIST, 3);
        assertArrayEquals(result, new int[][]{{1}});

        result = partition(_1_ITEM_LIST, 5);
        assertArrayEquals(result, new int[][]{{1}});

        result = partition(_1_ITEM_LIST, 7);
        assertArrayEquals(result, new int[][]{{1}});

    }

    @Test
    public void testPartitionWith3ItemsList() {
        int[][] result;

        result = partition(_3_ITEMS_LIST, 1);
        assertArrayEquals(result, new int[][]{{1}, {2}, {3}});

        result = partition(_3_ITEMS_LIST, 2);
        assertArrayEquals(result, new int[][]{{1, 2}, {3}});

        result = partition(_3_ITEMS_LIST, 3);
        assertArrayEquals(result, new int[][]{{1, 2, 3}});

        result = partition(_3_ITEMS_LIST, 5);
        assertArrayEquals(result, new int[][]{{1, 2, 3}});

        result = partition(_3_ITEMS_LIST, 7);
        assertArrayEquals(result, new int[][]{{1, 2, 3}});

    }

    @Test
    public void testPartitionWith5ItemsList() {
        int[][] result;

        result = partition(_5_ITEMS_LIST, 1);
        assertArrayEquals(result, new int[][]{{1}, {2}, {3}, {4}, {5}});

        result = partition(_5_ITEMS_LIST, 2);
        assertArrayEquals(result, new int[][]{{1, 2}, {3, 4}, {5}});

        result = partition(_5_ITEMS_LIST, 3);
        assertArrayEquals(result, new int[][]{{1, 2, 3}, {4, 5}});

        result = partition(_5_ITEMS_LIST, 5);
        assertArrayEquals(result, new int[][]{{1, 2, 3, 4, 5}});

        result = partition(_5_ITEMS_LIST, 7);
        assertArrayEquals(result, new int[][]{{1, 2, 3, 4, 5}});
    }
}
