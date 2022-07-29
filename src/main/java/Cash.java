import java.util.Random;

public class Cash {

    Random random = new Random();

    int[] shop1 = new int[random.nextInt(10)];
    int[] shop2 = new int[random.nextInt(10)];
    int[] shop3 = new int[random.nextInt(10)];


// рандомно заполним массивы и посчитаем его сумму
    public int payments(int[] shop) {
        int sumForShop = 0;

        for (int i = 0; i < shop.length; i++) {
            shop[i] = random.nextInt(100);
        }

        for (int y = 0; y < shop.length; y++) {
            sumForShop += shop[y];
        }
        System.out.println("Сумма массива " + Thread.currentThread().getName() + " = " + sumForShop);
        return sumForShop;
    }
}
