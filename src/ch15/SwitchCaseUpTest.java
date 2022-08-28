package ch15;

import java.util.Scanner;

public class SwitchCaseUpTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 선택하세요");
        int month = scanner.nextInt();

        int day = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한 달은 31일 입니다");
                yield 31;
            }

            case 4, 6, 9, 11 -> {
                System.out.println("한 달은 30일입니다");
                yield 30;
            }

            case 2 -> {
                System.out.println("한 달은 28일입니다");
                yield 28;
            }

            default -> {
                System.out.println("존재하지 않는 달입니다");
                yield 0;
            }
        };


    }
}
