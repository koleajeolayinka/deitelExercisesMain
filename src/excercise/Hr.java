package excercise;

public class Hr {
    public static int[] newArray = new int[10];

    public static int[] arrays = {5, 4, 4, 2, 2, 8};
    public static void main(String[] args) {
        runHr();
    }

    private static void runHr() {
        int tobi = arrays[0] + arrays[1];
        System.out.println(tobi);
        int smallestNumber = 0;
        for (int i = 0; i < arrays.length; i++) {
            smallestNumber = smallestNumber + arrays[i];

        }
        System.out.println(smallestNumber);
        runArianal();
    }

    private static void runArianal() {

        for(int i = 0; i < newArray.length; i++){
            newArray[i] = i * i;
        }
        System.out.println(newArray[3]);
        for(int i = 0; i < newArray.length; i++){
            System.out.printf("%d%n", newArray[i]);

        }
    }
}
