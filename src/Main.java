public class Main {
    public static void main(String[] args) {
        int size = 10;
        checkExerciseOne(size);
        System.out.println(isMultiple(100,5));
        System.out.println(isMultiple(100,6));
        System.out.println(isOdd(5));
        System.out.println(isOdd(6));
        System.out.println(sumUpToNumber(10));
        System.out.println(sumEvenUpToNumber(10));
        System.out.println(2 + 4 + 6 + 8 + 10);
    }

    public static class GameEntry {
        public int score = 0;

        public GameEntry() {
            this.score = 10;
        }
    }
    public static void checkExerciseOne(int size){
        GameEntry[] A = new GameEntry[size];
        for (int i = 0; i < size; i++){
            A[i] = new GameEntry();
        }
        GameEntry[] B = A.clone();
        A[4].score = 550;
        System.out.println(B[4].score);
        // B[4] references to A[4] so this will print 550!!
    }

    public static boolean isMultiple(long n, long m){
        return n % m == 0;
    }

    public static boolean isOdd(int i){
        int truncHalf = i / 2;
        double trueHalf = i * 0.5;

        return !((double) truncHalf == trueHalf);
    }

    public static int sumUpToNumber(int n){
        if (n <= 1)
            return n;
        return n + sumUpToNumber(n-1);
    }

    public static int sumEvenUpToNumber(int n){
        if (n <= 1)
            return 0;
        else if (n == 2)
            return n;
        else if (isOdd(n))
            return sumEvenUpToNumber(n-1);
        else
            return n + sumEvenUpToNumber(n-1);
    }
}