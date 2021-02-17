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

    public class CommentsInfo {
        private int countCommentsInfo;
        private boolean canPost;
        private boolean groupsCanPost;
        private boolean canClose;
        private boolean canOpen;
    }

    public class Copyrigth {
        private int idCopyrigth;
        private String linkCopyrigth;
        private String nameCopyrigth;
        private String typeCopyrigth;
    }

    public class Like {
        private int countLike;
        private boolean canOpen;
        private boolean canOpen;
        private boolean canOpen;
    }

    public class Report {
        private int countreport;
        private boolean userReposted;
    }

    public class ViewsInfo {
        private int countViewsInfo;
    }

    public class PostSourse {
        private String type;
        private String platform;
        private String data;
        private String url;
    }

    private class Geo {
        private String type;
        private String coordinates;
        private Place place;

        public class Place {
            private int id;
            private String titla;
            private int latitude;
            private int longitude;
            private int created;
            private String icon;
            private int checkins;
            private int updated;
            private int type;
            private int country;
            private int city;
            private String adress;/
        }
    }

    public class Donut {
        private boolean isDonut;
        private int paidDuration;
        private boolean canPablishFreeCopy;
        private String editMode;
    }

}