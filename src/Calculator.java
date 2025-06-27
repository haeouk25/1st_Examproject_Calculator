//양심고백... ChatGPT의 도움을 조금 받았습니다.
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계산식을 입력해주세요.(예: 10+20)\n더하기(+), 빼기(-), 곱하기(*), 나누기(/)가 가능합니다.\n계산식: ");
        String input = scanner.nextLine().replaceAll(" ", ""); // 공백 제거

        char operator = 0;
        int operatorIndex = -1;

        // 연산자 찾기
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("연산자가 올바르지 않습니다.");
            return;
        }

        // 숫자 추출
        String left = input.substring(0, operatorIndex);
        String right = input.substring(operatorIndex + 1);

        double num1 = Double.parseDouble(left);
        double num2 = Double.parseDouble(right);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나누기는 0으로 할 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println("계산 결과: " + result);
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
        }

        scanner.close();
    }
}