package Lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        MessageBoard board = new MessageBoard();
        User user1 = new User("Mikey", board);

        user1.post("My first post");
    }
}
