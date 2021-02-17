package ru.netology.domain;

public class Post {

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int data;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean frendsOnly;
    private CommentsInfo commentsInfo;
    private Copyrigth copyrigth;
    private Report report;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSourse postSourse;
    private int signerId;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postPonedId;
    private Donut donut;
}