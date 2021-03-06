package proxy_pattern.client;

import proxy_pattern.interfaces.ThirdPartyYouTubeLib;
import proxy_pattern.real_classes.Video;

import java.util.HashMap;

public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api){
        this.api = api;
    }

    public void renderVideoPage(String videoId){
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos(){
        HashMap<String, Video> list = api.popularVideos();
        if(list != null){
            for (Video video : list.values()) {
                System.out.println("ID: " + video.id + " / Title: " + video.title);
            }
        }

        System.out.println("-------------------------------\n");
    }
}
