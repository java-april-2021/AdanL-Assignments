import java.util.HashMap;
public class HashMapFun{
    public static void main(String[] args) {

        HashMap <String, String> trackList = new HashMap<String, String>();

        trackList.put("Somebody", "Once told me" );
        trackList.put("Hey Now", "You're a rockstar" );
        trackList.put("Ac/Dc", "You've been Thunderstruck!!" );
        trackList.put("Prayer", "Shot through the heart" );

        System.out.println(trackList.get("Somebody"));

        for (HashMap.Entry <String, String> album : trackList.entrySet()){
        System.out.println("Song Title: " + album.getKey() + " Lyrics: " + album.getValue());
        }
    }
}