package com.gamehub.essentials.Abstractions;


public abstract class Game {
    private String id;
    private String name;
    private String APIURL;
    private int minUserCount;
    private int maxUserCount;
    private String thumbnailPath;
    private String secretGameKey;

    public Game(String id, String name, String redirectURI, int minUserCount, int maxUserCount, String thumbnailPath, String secretGameKey) {
        this.id = id;
        this.name = name;
        this.APIURL = redirectURI;
        this.minUserCount = minUserCount;
        this.maxUserCount = maxUserCount;
        this.thumbnailPath = thumbnailPath;
        this.secretGameKey = secretGameKey;
    }

    public Game() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAPIURL() {
        return APIURL;
    }

    public void setAPIURL(String APIURL) {
        this.APIURL = APIURL;
    }

    public int getMinUserCount() {
        return minUserCount;
    }

    public void setMinUserCount(int minUserCount) {
        this.minUserCount = minUserCount;
    }

    public int getMaxUserCount() {
        return maxUserCount;
    }

    public void setMaxUserCount(int maxUserCount) {
        this.maxUserCount = maxUserCount;
    }

    public String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }

    public String getSecretGameKey() {
        return secretGameKey;
    }

    public void setSecretGameKey(String secretGameKey) {
        this.secretGameKey = secretGameKey;
    }
}
