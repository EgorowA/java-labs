package lab8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Comment comment1 = new Comment("Great", 10, 1);
        Comment comment2 = new Comment("Bad", 5, 2);
        Comment comment3 = new Comment("Don't know", 2, 10);

        Video video1 = new Video("Video 1", "https://video1.com", 100, 50, 5);
        video1.addComment(comment1);
        video1.addComment(comment2);

        Video video2 = new Video("Video 2", "https://video2.com", 200, 30, 15);
        video2.addComment(comment3);

        VideoBlog blog = new VideoBlog("BloggerName");
        blog.addVideo(video1);
        blog.addVideo(video2);

        System.out.println("Total views: " + getTotalViews(blog));
        System.out.println("Is there a comment more liked than the video? " + isCommentMoreLikedThanVideo(blog));

        List<Video> mostDislikedVideos = getMostDislikedVideos(blog);
        if (mostDislikedVideos.isEmpty()) {
            System.out.println("No videos with dislikes.");
        } else {
            System.out.println("Most disliked video(s):");
            for (Video video : mostDislikedVideos) {
                System.out.println(video.getTitle());
            }
        }

        Video foundVideo = findVideoByUrl(blog, "https://video1.com");
        System.out.println("Found video: " + (foundVideo != null ? foundVideo.getTitle() : "Not found"));
    }

    public static int getTotalViews(VideoBlog blog) {
        int totalViews = 0;
        for (Video video : blog.getVideos()) {
            totalViews += video.getViews();
        }
        return totalViews;
    }

    public static boolean isCommentMoreLikedThanVideo(VideoBlog blog) {
        for (Video video : blog.getVideos()) {
            for (Comment comment : video.getComments()) {
                if (comment.getLikes() > video.getLikes()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<Video> getMostDislikedVideos(VideoBlog blog) {
        List<Video> result = new ArrayList<>();
        int maxDislikes = 0;

        Iterator<Video> iterator = blog.getVideos().iterator();
        while (iterator.hasNext()) {
            Video video = iterator.next();
            if (video.getDislikes() > maxDislikes) {
                maxDislikes = video.getDislikes();
                result.clear();
                result.add(video);
            } else if (video.getDislikes() == maxDislikes) {
                result.add(video);
            }
        }

        return result;
    }

    public static Video findVideoByUrl(VideoBlog blog, String url) {
        return blog.getVideoByUrl(url);
    }
}
