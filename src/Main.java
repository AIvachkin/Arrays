public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        float expenses30days = 0f ;
        for (int j : arr) {
            //System.out.println(arr[i]);
            expenses30days = expenses30days + j;
        }
        float expensesAverage = expenses30days / arr.length ;
        System.out.println("Средняя сумма трат за месяц составила " + expensesAverage + " рублей.");
        //System.out.println("Сумма трат за месяц составила " + expenses30days + " рублей");
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

