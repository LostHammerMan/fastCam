package ch19;

public class ForTest {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        for (int i = 0; i < 10 ; i++, count++){
            sum += count;
        }
        System.out.println(sum);
        System.out.println("-----------------------------");

        int num = 1;
        int sum2 = 0;

        while (num <= 10){
            sum2 += num++;
        }
        System.out.println(sum2);
    }
}
