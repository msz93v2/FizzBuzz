public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int countdown = 100;
        while (countdown > 0){
            if (countdown % 2 == 0){
                countdown = countdown / 2;
            }
            else{
                countdown = countdown - 1;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
