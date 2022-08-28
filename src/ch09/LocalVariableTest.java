package ch09;

public class LocalVariableTest {
    public static void main(String[] args) {

        var i = 10; // --> int 타입으로 추론
        var j = 10.0; // --> double
        var str = "hello"; // --> String

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";

        var str2 = str;
        System.out.println(str2);
        str = "hello";
//        str = 3;
    }
}
