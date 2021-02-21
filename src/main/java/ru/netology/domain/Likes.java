package ru.netology.domain;

public class Likes {
    private boolean canLike;
    private int likesSum;
    private boolean canRemoveLike;
    private boolean likesSum;

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getLikesSum() {
        return likesSum;
    }

    public void setLikesSum(int likesSum) {
        this.likesSum = likesSum;
    }

    public boolean isCanRemoveLike() {
        return canRemoveLike;
    }

    public void setCanRemoveLike(boolean canRemoveLike) {
        this.canRemoveLike = canRemoveLike;
    }

    public boolean isLikesSum() {
        return likesSum;
    }

    public void setLikesSum(boolean likesSum) {
        this.likesSum = likesSum;
    }
}
