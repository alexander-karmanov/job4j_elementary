package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int dataIndex = 0; dataIndex < data.length; dataIndex++) {
            int min = MinDiapason.findMin(data, dataIndex, data.length - 1);
            int index = FindLoop.indexInRange(data, min, dataIndex, data.length - 1);
            SwitchArray.swap(data, index, dataIndex);
        }
         return data;
    }
}
