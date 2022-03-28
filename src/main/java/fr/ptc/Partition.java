package fr.ptc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Partition {

    public static int[][] partition(int[] list, int size) {
        if (list == null || list.length == 0) {
            return null;
        }

        int partitions = list.length / size + (list.length % size != 0 ? 1 : 0);
        int[][] newList = new int[partitions][];

        int pos = 0;
        for (int index = 0; index <= list.length - size; index += size, pos++) {
            newList[pos] = Arrays.copyOfRange(list, index, index + size);
        }

        if (pos < partitions) {
            newList[pos] = Arrays.copyOfRange(list, pos * size, list.length);
        }

        return newList;

    }
}
