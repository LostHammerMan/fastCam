package ch15;

public class IfElseIfTest {
    public static void main(String[] args) {

        int age = 12;
        int charge;

        if(age < 8){
            charge = 1000;
            System.out.println("애들은 집에 가라");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초딩이냐???");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("급식이냐???");
        }else {
            charge = 3000;
            System.out.println("성인이네....");
        }
        System.out.println("입장료는 " + charge + " 입니다");
    }
}
