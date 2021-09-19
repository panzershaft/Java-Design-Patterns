package proxy_pattern.proxy;

import proxy_pattern.interfaces.ThirdPartyYouTubeLib;
import proxy_pattern.real_classes.ThirdPartyYouTubeClass;
import proxy_pattern.real_classes.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy(){
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()){
            cachePopular = this.youtubeService.popularVideos();
        }else{
            System.out.println("Retrieved list form cache");
        }
        return null;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null){
            video = this.youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        }else{
            System.out.println("Retrieved video " + videoId + " from cache.");
        }
        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
