class MaxNum {
    public static void main(String[] args) {
        int[] array = {12, 43, 12, -65, 778, 123, 32, 76, 464, 1001, 1488, 228};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("maximum number in array: "+max);
    }
}
