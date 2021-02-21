package ru.netology.domain;

public class Comments {
    private boolean canComment;
    private int commenterId;
    private String commentText;
    private boolean canDelete;
    private boolean canEdit;
    private boolean commentsQueue;
    private boolean canLikeComment;
    private int commentLikesSum;
    private boolean canReportComment;
    private boolean canReplyComment;
    private int replierId;
    private String commentReplyText;
    private int commentsSum;

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public int getCommenterId() {
        return commenterId;
    }

    public void setCommenterId(int commenterId) {
        this.commenterId = commenterId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCommentsQueue() {
        return commentsQueue;
    }

    public void setCommentsQueue(boolean commentsQueue) {
        this.commentsQueue = commentsQueue;
    }

    public boolean isCanLikeComment() {
        return canLikeComment;
    }

    public void setCanLikeComment(boolean canLikeComment) {
        this.canLikeComment = canLikeComment;
    }

    public int getCommentLikesSum() {
        return commentLikesSum;
    }

    public void setCommentLikesSum(int commentLikesSum) {
        this.commentLikesSum = commentLikesSum;
    }

    public boolean isCanReportComment() {
        return canReportComment;
    }

    public void setCanReportComment(boolean canReportComment) {
        this.canReportComment = canReportComment;
    }

    public boolean isCanReplyComment() {
        return canReplyComment;
    }

    public void setCanReplyComment(boolean canReplyComment) {
        this.canReplyComment = canReplyComment;
    }

    public int getReplierId() {
        return replierId;
    }

    public void setReplierId(int replierId) {
        this.replierId = replierId;
    }

    public String getCommentReplyText() {
        return commentReplyText;
    }

    public void setCommentReplyText(String commentReplyText) {
        this.commentReplyText = commentReplyText;
    }

    public int getCommentsSum() {
        return commentsSum;
    }

    public void setCommentsSum(int commentsSum) {
        this.commentsSum = commentsSum;
    }
}
