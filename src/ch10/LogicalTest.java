package ch10;

public class LogicalTest {
    public static void main(String[] args){

        int num1 = 10;
        int i = 2;

        boolean value = ( (num1 = num1 + 10) < 10) && ( (i = i+2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); //2 , 앞에 항이 이미 false 이므로 뒤에 항은 연산되지 않음
    }
}
