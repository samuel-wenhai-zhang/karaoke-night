import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class KaraokeDJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<PlayListEntry> playlist = new LinkedList<PlayListEntry>();

        outerloop:
        while (true) {
            System.out.println(
                "Would you like to:\n" + 
                "1. Add a song\n" + 
                "2. Get the next song in the queue\n" + 
                "3. Exit"
            );
            try {
                String choice = in.nextLine();
                switch (choice) {
                    case "1":
                        do {
                            
                        } while (choice.equals(""));
                        break;
                    case "2":
                        break;
                    case "3":
                        break outerloop;
                    default:
                        System.out.println("Invalid input.");
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input.");
            }
            
        }
    }
}