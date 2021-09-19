package proxy_pattern.interfaces;
/*
    Example taken from: refactoring.guru
 */

import proxy_pattern.real_classes.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
