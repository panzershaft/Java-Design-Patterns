package composite_pattern.PlayListComposite.composite;

import composite_pattern.PlayListComposite.interfaces.IComponent;

import java.util.ArrayList;

public class Playlist implements IComponent {
    private String playListName;
    public ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlist = new ArrayList<>();
        this.playListName = playlistName;
    }

    @Override
    public void play() {
        for(IComponent item : playlist){
            if (item instanceof Playlist) item.getName();
            else System.out.println( "PLAYING: " + item.getName());
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent item : playlist)
            item.setPlaybackSpeed(speed);
    }

    @Override
    public String getName() {
        return playListName;
    }

    public void add(IComponent component){
        this.playlist.add(component);
    }

    public void remove(IComponent component){
        this.playlist.remove(component);
    }

    public void viewAlbums(){
        for(IComponent item : playlist){
            if (item instanceof Playlist) ((Playlist) item).viewAlbums();
            else System.out.println(item.toString());
        }
    }
}
