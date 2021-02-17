package ru.netology.domain;

public class Post {

    private int id;
    private int ownerId;
    private int data;
    private TextPost text;
    private String imageUrl;

    private CommentsInfo commentsInfo;
    private int countLike;
    private String countViewsInfo;
    private String countRepost;

    public class TextPost {
        private String textTextPost;
        private String logoUrl;
    }

    public class CommentsInfo {
        private int idCommentsInfo;
        private int idOwnerCommentsInfo;
        private int dataCommentsInfo;
        private String textCommentsInfo;
        private int countCommentsInfo;
    }

















}