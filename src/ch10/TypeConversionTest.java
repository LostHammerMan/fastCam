package ch10;

public class TypeConversionTest {
    public static void main(String[] args) {

        // explicit conversion
        byte bnum = 125;
        int inum = bnum; // 자동형변환
        System.out.println(inum);

        // implicit conversion
        int iNum2 = 255;
        byte bNum2 = (byte) iNum2;
        System.out.println(bNum2); // -1, 자료형의 범위를 넘어서는 데이터가 입력된 경우

        double dNum = 3.14;
        int iNum3 = (int) dNum;
        System.out.println(iNum3); // 3

        double dNum2 = 1.2;
        float fNum = 0.9F;

        int iNum4 = (int) dNum2 + (int) fNum; // 1 + 0
        int iNum5 = (int) (dNum2 + fNum); // 2.1 --> 2

        System.out.println("---------------------------------");
        System.out.println(iNum4);
        System.out.println(iNum5);
    }
}
