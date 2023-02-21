import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input_1 = "";
        String input_2 = "";

        System.out.print("person1의 이름: ");
        String person1 = sc.nextLine();
        System.out.print("person2의 이름: ");
        String person2 = sc.nextLine();

        System.out.printf("person1: %s, person2: %s 게임을 시작합니다.\n", person1, person2);
        System.out.println("각자 문장을 하나씩 말합니다.");
        System.out.println("person2가 person1의 말을 따라하면 게임이 종료됩니다.");

        do{
            System.out.print(person1 + ": ");
            input_1 = sc.next();
            System.out.print(person2 + ": ");
            input_2 = sc.next();

        }while (!input_1.equals(input_2));
        System.out.println("문자게임이 종료되었습니다.");
    }
}