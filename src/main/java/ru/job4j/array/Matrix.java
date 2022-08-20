package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int cell = 0; cell < multiplicationTable[row].length; cell++) {
                    multiplicationTable[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return multiplicationTable;
    }
}