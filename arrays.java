public class arrays {
    public static void main(String[] args) {
        int[] array1;
        int array2[];
        int[] array3 = new int[1000];
        array3[0] = 10;
        array3[999] = 11;
        for (int value : array3)
            System.out.print(value +" ");
        System.out.print(array3.length);
        int[] array4 = {10, 20, 30, 40, 50};
        int[][] array5 = new int[10][20];
    }
}
