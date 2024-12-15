public class Parallelogram {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;
        int offset = 5; // Initial Spaces

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < offset; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
            offset--;
        }
    }
}
