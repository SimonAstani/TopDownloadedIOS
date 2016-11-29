package com.example.simon.top10downloader;

/**
 * Created by simon on 11/29/2016.
 */

public class FeedEntry {
    private String name;
    private String artist;
    private String realesedate;
    private String summary;
    private String imageURL;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRealesedate() {
        return realesedate;
    }

    public void setRealesedate(String realesedate) {
        this.realesedate = realesedate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "name=" + name + '\n' +
                ", artist=" + artist + '\n' +
                ", realesedate=" + realesedate + '\n' +
                ", imageURL=" + imageURL + '\n' +
                ", content=" + content + '\n';
    }
}
