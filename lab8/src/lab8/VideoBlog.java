package lab8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VideoBlog {
    private String bloggerName;
    private Set<Video> videos;
    private Map<String, Video> videoMap;

    public VideoBlog(String bloggerName) {
        this.bloggerName = bloggerName;
        this.videos = new HashSet<>();
        this.videoMap = new HashMap<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
        videoMap.put(video.getUrl(), video);
    }

    public Set<Video> getVideos() {
        return videos;
    }

    public Video getVideoByUrl(String url) {
        return videoMap.get(url);
    }
}

