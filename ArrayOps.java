public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {1,-2,3,-4,5};
        System.out.println(findMissingInt(new int[] {3, 0, 1}));
        System.out.println(secondMaxValue(new int[] {6, 9, 4, 7, 3, 4}));
        System.out.println(containsTheSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5}));
        System.out.println(isSorted(new int[] {7, 5, 4, 3, -12}));
    }

    public static int findMissingInt(int[] array) {
        int n = array.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        int missing;

        if (array.length >= 1) {
            for (int i = 0; i < n; i++) {
                actualSum = actualSum + array[i];
            }
            missing = expectedSum - actualSum;
            return missing;
        }
        return -1;
    }

    public static int secondMaxValue(int[] array) {
        int firstMax = Math.max(array[0], array[1]);
        int secondMax = Math.min(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            if (array[i] > firstMax) { //we found another max.We update the second max to be the first
                // max as now we have a greater value and the current value to be the new max
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i]; //as it's not greater than first max but greater than secondmax,
                // we found a new second max and change its value now
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean result1 = true;
        boolean result2 = true;
        int count;

        for (int i = 0; i <array1.length; i++) {
            count=0;
            for (int j = 0; j <array2.length; j++) {
                if(array1[i] != array2[j]){
                    count++;
                }
            }
            if(count == array2.length){
                result1 = false;
                break;
            }
        }

        for (int i = 0; i <array2.length; i++) {
            count=0;
            for (int j = 0; j <array1.length; j++) {
                if(array2[i] != array1[j]){
                    count++;
                }
            }
            if(count == array1.length){
                result2 = false;
                break;
            }
        }
        return result1 && result2;
    }

    public static boolean isSorted(int[] array) {
        boolean increase = true;
        boolean decrease = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) { //we found an element that is greater than the following one
                increase = false;
                break;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) { //we found an element that is smaller than the following one
                decrease = false;
                break;
            }
        }
        return increase || decrease; 
    }
}