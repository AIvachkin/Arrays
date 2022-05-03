public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int minSumm = 200_001 ;
        int maxSumm = - 1 ;
        for (int j : arr) {
            if (j < minSumm) {
                minSumm = j;
            }
            if (j > maxSumm) {
                maxSumm = j;
            }
            //System.out.println(arr[i]);
        }
        System.out.print("Минимальная сумма трат за день составила " + minSumm + " рублей." +
                "Максимальная сумма трат за день составила " + maxSumm + " рублей.");
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}


