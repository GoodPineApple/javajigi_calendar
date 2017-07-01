package step01Sum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by taemi on 2017-07-01.
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println("두수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        String firstStr = scan.next();
        String secondStr = scan.next();
        int firstNum = Integer.parseInt(firstStr);
        int secondNum = Integer.parseInt(secondStr);
        System.out.println("두 수의 합은 " + (firstNum + secondNum) + "입니다.");
    }
}
