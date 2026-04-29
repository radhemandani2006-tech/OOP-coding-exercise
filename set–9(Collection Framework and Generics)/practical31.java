import java.util.LinkedList;

public class practical31 {

    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<String>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Full Playlist:");
        System.out.println(playlist);

        System.out.println("\nPlaying first song: " + playlist.removeFirst());

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        System.out.println("\nSkipping last song: " + playlist.removeLast());

        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}
