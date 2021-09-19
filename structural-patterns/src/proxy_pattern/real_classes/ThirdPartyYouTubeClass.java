package proxy_pattern.real_classes;

import proxy_pattern.interfaces.ThirdPartyYouTubeLib;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com");
        return getSomeVideo(videoId);
    }

    private int random(int min, int max){
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.println("Conecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading popular videos... ");
        experienceNetworkLatency();
        HashMap<String, Video> hash_map = new HashMap<>();
        hash_map.put("cats", new Video("1", "cats.avi"));
        hash_map.put("dogs", new Video("2", "dogs.avi"));
        hash_map.put("parrots", new Video("3", "parrots.avi"));
        hash_map.put("kolas", new Video("4", "kolas.avi"));

        System.out.println("Done! \n");
        return hash_map;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video... ");
        experienceNetworkLatency();

        Video video = new Video(videoId, "Some video");
        System.out.println("Done! \n");
        return video;
    }

}
