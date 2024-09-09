public class Multiples {
    public static void main(String[] args) {
        int i = 3;
        int num_3 = 0;
        int num_5 = 0;
        int num_total = 0;
        while (i < 1000) {
            if ((i%3==0) && (i%5==0)){
                num_total++;
            }
            else if (i%3==0){
                num_3++;
            }
            else if (i%5==0){
                num_5++;
            }
            i++;
        }
        System.out.println(num_total + num_3 + num_5);
    }
}
