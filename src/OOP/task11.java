package OOP;

import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
        String[] memory = { "object15", null, null, "object2", null, null, null, null, "object32", null, "object4" };
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int nonNullIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[nonNullIndex] = array[i];
                if (nonNullIndex != i) {
                    array[i] = null;
                }
                nonNullIndex++;
            }
        }
    }
}
