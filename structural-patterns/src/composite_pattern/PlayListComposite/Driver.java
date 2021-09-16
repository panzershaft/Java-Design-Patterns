package composite_pattern.PlayListComposite;

import composite_pattern.PlayListComposite.composite.Playlist;
import composite_pattern.PlayListComposite.leaf.Song;

public class Driver {
    public static void main (String[] args){
        Playlist studyPlayList = new Playlist("Study");

        // Synth Pop playlist
        Playlist synthPopPlayList = new Playlist("Synth Pop");
        Song synth1 = new Song("Girl Like You", "Toro Y Moi");
        Song synth2 = new Song("Outside", "Tops");
        synthPopPlayList.add(synth1);
        synthPopPlayList.add(synth2);
        System.out.println("------------ SYNTH POP PURE --------------");
        synthPopPlayList.viewAlbums();
        System.out.println("------------------------------------------");

        Playlist experimentalPlaylist = new Playlist("Experimental");
        Song experimentalSong1 = new Song("About you", "XXYYXX");
        Song experimentalSong2 = new Song("Motivation", "Clams Casino");
        Song experimentalSong3 = new Song("Computer Vision", "Oneohtrix Point Never");
        experimentalPlaylist.add(experimentalSong1);
        experimentalPlaylist.add(experimentalSong2);
        experimentalPlaylist.add(experimentalSong3);
        float slowSpeed = 0.5f;
        experimentalPlaylist.setPlaybackSpeed(slowSpeed);
        System.out.println("------------ EXPERIMENTAL PURE --------------");
        experimentalPlaylist.viewAlbums();
        System.out.println("---------------------------------------------");

        System.out.println("------------ EXPERIMENTAL + SYNTH POP --------------");
        experimentalPlaylist.add(synthPopPlayList);
        experimentalPlaylist.viewAlbums();
        System.out.println("-----------------------------------------------------");

        studyPlayList.add(experimentalPlaylist);

        Song glitchSong = new Song("Textuell", "Oval");
        float fasterSpeed = 1.2f;
        glitchSong.setPlaybackSpeed(fasterSpeed);
        glitchSong.play();
        String name = glitchSong.getName();
        String artist = glitchSong.getName();
        System.out.println ("The song name is " + name );
        System.out.println ("The song artist is " + artist );

        // Add glitchSong to the "Study" playlist
        studyPlayList.add(glitchSong);

        // Play "Study" playlist.
        studyPlayList.play();

        // Get the playlist name of studyPlaylist → "Study"
        System.out.println ("The Playlist's name is " + studyPlayList.getName() );

    }
}
