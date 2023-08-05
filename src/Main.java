import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray(int countDay, int minSpend, int maxSpend) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[countDay];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxSpend - minSpend) + minSpend;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 1 =========\n" +
                "=============================\n");

        int countDay = 30;
        int minSpend = 100_000;
        int maxSpend = 200_000;
        int[] arr = generateRandomArray(countDay, minSpend, maxSpend);


        int sum = 0;
        for (int spend: arr){
            sum += spend;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 2 =========\n" +
                "=============================\n");


        int countDay = 30;
        int minSpend = 100_000;
        int maxSpend = 200_000;
        int[] arr = generateRandomArray(countDay, minSpend, maxSpend);

        //решение как надо:
        int min = 200_000;
        int max = 100_000;

        for (int spend: arr) {
            if (spend < min) {
                min = spend;
            }

            if (spend > max) {
                max = spend;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. \nМаксимальная сумма трат за день составила " + max + " рублей");

        // как бы сделал я
//        Arrays.sort(arr);
//        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. \nМаксимальная сумма трат за день составила " + arr[arr.length -1] + " рублей");

    }
    public static void task3() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 3 =========\n" +
                "=============================\n");

        int countDay = 30;
        int minSpend = 100_000;
        int maxSpend = 200_000;
        int[] arr = generateRandomArray(countDay, minSpend, maxSpend);

        int sum = 0;
        for (int spend: arr){
            sum += spend;
        }
        float middleSpend = (float) sum / (float) countDay;
        System.out.println("Средняя сумма трат за месяц составила " + middleSpend + " рублей");

    }

    public static void task4() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 4 =========\n" +
                "=============================\n");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(".");


    }
}