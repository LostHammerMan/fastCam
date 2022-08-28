package ch20;

public class NestedLoopTest {
    public static void main(String[] args) {

        int dan = 2;
        int count = 1;
        int num =0 ;

//        for ( ; dan <= 9; dan++){
//            for (count = 1 ; count <= 9; count++){
//                num = dan * count;
//                System.out.println(dan + " * " + count + " = " + num);
//            }
//            System.out.println("--------------");
//        }
//
        dan = 2;
        count = 1;
        num = 0;
        while (dan <= 9){
            count = 1; // count가 9가 된 뒤 10이 되어 종료되므로, count 를 다시 1로 초기화
            while (count <= 9){
                num = dan * count;
                System.out.println(dan + " * " + count + " = " + num);

                count++;
            }
            System.out.println();
            dan++;
        }
    }
}
