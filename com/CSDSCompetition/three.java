public class three {
    public static void main(String[] args) {
        int[] N = {1, 1, 0, 0, 0};

        int size = N.length - 1;

        if(canCarReach(N, size)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    static boolean canCarReach(int[] N, int size) {
        int fuel = 0;


        for (int i = 0; i < N.length; i++) {
            fuel += N[i];
        }


        return fuel >=size;
    }
}
