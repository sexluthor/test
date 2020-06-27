public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("turns " + turns(984143, 1, 1000000));
        System.out.println("myTurns " + myTurns(984143, 1, 1000000));
    }

    public static int turns (int n, int low, int high) {
        int turns = 0;
// Продолжаем, пока имеется число для угадывания
        while (high >= low) {
            turns++;
            int mid = (low + high) / 2;
            if (mid == n) {
                System.out.println(mid);
                return turns;
            } else if (mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(n);
        return turns;

    }

    public static int myTurns (int n, int low, int high) {
        int turns = 0;
        int totalValue = high / 2;
        while (high >= totalValue && turns < 60) {
            turns++;
//            int mid = (low + high) / 2;
            if (totalValue == n) {
                System.out.println(totalValue);
                return turns;
            } else if (totalValue < n) {
                totalValue += (high - totalValue) / 2;
            } else {
                totalValue -= (high - totalValue) / 2;
            }
        }

        System.out.println(totalValue);
        return turns;

    }

}
