package ru.netology.domain;

public class Repost {
    private boolean canRepost;
    private int repostsSum;
    private int repostId;
    private int reposterId;

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public int getRepostsSum() {
        return repostsSum;
    }

    public void setRepostsSum(int repostsSum) {
        this.repostsSum = repostsSum;
    }

    public int getRepostId() {
        return repostId;
    }

    public void setRepostId(int repostId) {
        this.repostId = repostId;
    }

    public int getReposterId() {
        return reposterId;
    }

    public void setReposterId(int reposterId) {
        this.reposterId = reposterId;
    }
}
