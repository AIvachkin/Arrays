public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int expenses30days = 0 ;
        for (int j : arr) {
            //System.out.println(arr[i]);
            expenses30days = expenses30days + j;
        }
        System.out.println("Сумма трат за месяц составила " + expenses30days + " рублей");
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

