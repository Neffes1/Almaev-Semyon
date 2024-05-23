public class WoodenSticksGame {

    public static int calculateSticks(int sticks) {
        while (sticks > 1) {
            if (sticks % 2 == 0) {
                sticks /= 2;
            } else {
                sticks--;
            }
        }
        return sticks;
    }

    public static void main(String[] args) {
        int initialSticks = 357983; // количество палочек на столе
        int tanyaSticks = calculateSticks(initialSticks);

        System.out.println("Палочек у Тани после игры: " + tanyaSticks);
    }
}
