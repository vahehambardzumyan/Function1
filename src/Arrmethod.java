public class Arrmethod {

    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {
        int[] b = new int[5];
        b = new int[]{3, 5, 8, 7, 9};
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");

        }
    }
}