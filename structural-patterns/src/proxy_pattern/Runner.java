package proxy_pattern;

import proxy_pattern.client.YouTubeDownloader;
import proxy_pattern.proxy.YouTubeCacheProxy;
import proxy_pattern.real_classes.ThirdPartyYouTubeClass;

public class Runner {
    public static void main (String[] args){
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + " ms");
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();
        downloader.renderPopularVideos();
        downloader.renderVideoPage("cats");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dogs");
        downloader.renderVideoPage("cats");
        downloader.renderVideoPage("parrots");

        long estTime = System.currentTimeMillis() - startTime;
        System.out.println("Time passed: " + estTime + "ms");
        return estTime;

    }
}
