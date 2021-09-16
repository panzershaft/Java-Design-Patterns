package composite_pattern.PlayListComposite.leaf;

import composite_pattern.PlayListComposite.interfaces.IComponent;

public class Song implements IComponent {
    public String songName;
    public String artists;
    public float speed = 1;

    public Song(String songName, String artists){
        this.songName = songName;
        this.artists = artists;
    }

    @Override
    public void play() {
        String message = "PLAYING SONG: " + songName + ", by: " + artists;
        System.out.println(message);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        System.out.println("Playback speed: " + speed);
    }

    @Override
    public String getName() {
        return songName;
    }

    public String getArtists(){
        return artists;
    }

    public String toString(){
        return "[SONG: "+songName+ ", ARTIST: "+ artists+"]";
    }
}
