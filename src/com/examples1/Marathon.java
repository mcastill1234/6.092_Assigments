package com.examples1;

public class Marathon {
    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        int minIndex = getMinIndex(times);
        int secMinInd = getSecondMinIndex(times);

        System.out.println("The slowest person is: " + names[minIndex]);
        System.out.println("The slowest time is: " + times[minIndex]);

        System.out.println("The second slowest person is: " + names[secMinInd]);
        System.out.println("The second slowest time is: " + times[secMinInd]);
    }

    public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i=0; i<values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx = getMinIndex(values);

        for (int i=0; i<values.length; i++) {
            if (i == minIdx){
                continue;
            }
            if (secondIdx == -1 || values[i] < values[secondIdx]) {
                secondIdx = i;
            }
        }

        return secondIdx;
    }
}
