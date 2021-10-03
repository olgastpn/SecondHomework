package homework;

public class SecondHomework {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }

        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }


        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int x : arr2) {
            if (x < 6) {
                x = x * 2;
            }
            System.out.println(x);

        }


        int[][] arr3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr3[i][j] = 1;
                }
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
    }
}