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
        String message = "PLAYING: " + this.playlist;
        System.out.println(message);
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
            if (item instanceof Playlist){
                Playlist inner = (Playlist) item;
                for(IComponent inner_item : inner.playlist){
                    System.out.println(inner_item);
                }
            }
            System.out.println(item);
        }

    }
}
