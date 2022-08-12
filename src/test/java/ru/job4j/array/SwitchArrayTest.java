package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {6, 3, 5, 7, 8};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {6, 3, 7, 5, 8};
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void whenSwap4to5() {
        int[] input = {0, 0, 0, 0, 9, 0, 0};
        int source = 4;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 0, 0, 0, 0, 9, 0};
        assertThat(result).containsExactly(expected);
    }
}
