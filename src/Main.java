public class Main {
    public static void main(String[] args) {
        findSums();


    }

    public static void findSums() {
        int sum = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.print("Sandardyn summasy: " + sum);
    }

}