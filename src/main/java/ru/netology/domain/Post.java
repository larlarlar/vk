package ru.netology.domain;

public class Post {
    private int id;
    private int authorId;
    private int ownerId;
    private boolean edit;
    private int editorId;
    private int community;
    private boolean communityMembersOnly;
    private int date;
    private boolean addBookMark;
    private String text;
    private int linkPreview;
    private int attachments;
    private boolean canRepost;
    private int reposterId;
    private boolean shareWithFriendViaMessage;
    private String copyLink;
    private boolean canReport;
    private int repostsSum;
    private int viewsSum;
    private boolean canPin;
    private boolean isPinned;
    private boolean canLike;
    private int likesSum;
    private boolean canComment;
    private int commenterId;
    private String commentText;
    private boolean commentsQueue;
    private boolean canLikeComment;
    private int commentLikesSum;
    private boolean canReportComment;
    private boolean canReplyComment;
    private int replierId;
    private String commentReplyText;
    private int commentsSum;
    private boolean authorisatedUsersOnly;
    private boolean delete;
    private String geo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public int getEditorId() {
        return editorId;
    }

    public void setEditorId(int editorId) {
        this.editorId = editorId;
    }

    public int getCommunity() {
        return community;
    }

    public void setCommunity(int community) {
        this.community = community;
    }

    public boolean isCommunityMembersOnly() {
        return communityMembersOnly;
    }

    public void setCommunityMembersOnly(boolean communityMembersOnly) {
        this.communityMembersOnly = communityMembersOnly;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isAddBookMark() {
        return addBookMark;
    }

    public void setAddBookMark(boolean addBookMark) {
        this.addBookMark = addBookMark;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLinkPreview() {
        return linkPreview;
    }

    public void setLinkPreview(int linkPreview) {
        this.linkPreview = linkPreview;
    }

    public int getAttachments() {
        return attachments;
    }

    public void setAttachments(int attachments) {
        this.attachments = attachments;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public int getReposterId() {
        return reposterId;
    }

    public void setReposterId(int reposterId) {
        this.reposterId = reposterId;
    }

    public boolean isShareWithFriendViaMessage() {
        return shareWithFriendViaMessage;
    }

    public void setShareWithFriendViaMessage(boolean shareWithFriendViaMessage) {
        this.shareWithFriendViaMessage = shareWithFriendViaMessage;
    }

    public String getCopyLink() {
        return copyLink;
    }

    public void setCopyLink(String copyLink) {
        this.copyLink = copyLink;
    }

    public boolean isCanReport() {
        return canReport;
    }

    public void setCanReport(boolean canReport) {
        this.canReport = canReport;
    }

    public int getRepostsSum() {
        return repostsSum;
    }

    public void setRepostsSum(int repostsSum) {
        this.repostsSum = repostsSum;
    }

    public int getViewsSum() {
        return viewsSum;
    }

    public void setViewsSum(int viewsSum) {
        this.viewsSum = viewsSum;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

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

    public boolean isAuthorisatedUsersOnly() {
        return authorisatedUsersOnly;
    }

    public void setAuthorisatedUsersOnly(boolean authorisatedUsersOnly) {
        this.authorisatedUsersOnly = authorisatedUsersOnly;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }
}
