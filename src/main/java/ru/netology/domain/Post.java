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
    private boolean attachments;
    private Repost repostInfo;
    private boolean shareWithFriendViaMessage;
    private String copyLink;
    private boolean canReport;
    private int viewsSum;
    private boolean canPin;
    private boolean isPinned;
    private Likes likesInfo;
    private Comments commentsInfo;
    private boolean authorisatedUsersOnly;
    private boolean delete;
    private Geo geoInfo;

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

    public boolean isAttachments() {
        return attachments;
    }

    public void setAttachments(boolean attachments) {
        this.attachments = attachments;
    }

    public Repost getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(Repost repostInfo) {
        this.repostInfo = repostInfo;
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

    public Likes getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(Likes likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Comments getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(Comments commentsInfo) {
        this.commentsInfo = commentsInfo;
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

    public Geo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(Geo geoInfo) {
        this.geoInfo = geoInfo;
    }
}
