import java.util.Queue;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class KaraokeDJ {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        Scanner reader = new Scanner(new File("songs.txt"));
        ArrayList<Song> songs = new ArrayList<Song>();
        Queue<PlayListEntry> playlist = new LinkedList<PlayListEntry>();
        
        while (reader.hasNextLine()) {
            String[] line = reader.nextLine().split(";");
            Song s = new Song(line[0], line[1], line[2]);
            songs.add(s);
        }

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
                        while (true) {
                            System.out.print("Please enter the song number(enter to list songs) ");
                            choice = in.nextLine();
                            if (!choice.equals("")) {
                                break;
                            }
                            for (int i = 0; i < songs.size(); i++) {
                                System.out.println((i + 1) + " - " + songs.get(i));
                            }
                        }
                        int index = Integer.parseInt(choice) - 1;
                        Song s = songs.get(index);
                        System.out.print("Please enter the name of the performer: ");
                        choice = in.nextLine();
                        PlayListEntry pe = new PlayListEntry(choice, s);
                        playlist.add(pe);
                        break;
                    case "2":
                        if (!playlist.isEmpty()) {
                            System.out.println("Next up: " + playlist.remove());
                        }
                        else {
                            System.out.println("There are no singers in the queue.");
                        }
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