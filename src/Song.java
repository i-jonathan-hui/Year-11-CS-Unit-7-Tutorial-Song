import java.util.*;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> people;
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        people = new ArrayList();
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }

    public int howMany(ArrayList<String> names) {
        int cnt = 0;
        for (int i=0; i<names.size(); i++) {
            boolean exist = false;
            for (int j=0; j<people.size(); j++) {
                if (people.get(j).equals(names.get(i).toLowerCase())) exist = true;
            }
            if (!exist)  {
                people.add(names.get(i).toLowerCase());
                cnt++;
            }
        }
        return cnt;
    }
}
