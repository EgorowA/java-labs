package lab7;

import java.util.ArrayList;
import java.util.List;

public class VideoBlog {
    private String bloggerName;
    private List<Video> videos;

    public VideoBlog(String bloggerName) {
        this.bloggerName = bloggerName;
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public List<Video> getVideos() {
        return videos;
    }
}

