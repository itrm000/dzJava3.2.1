package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private int ownerIdж;
    private String domain;
    private String querry;
    private boolean ownersOnly;
    private int count;
    private int offset;
    private int postId;

    public Post[] search(
            int ownerId,
            String domain,
            String querry,
            boolean ownersOnly,
            int count,
            int offset
    ) {
        return null;
    }

    public void delete(
            int ownerId,
            int postId
    ) {
        System.out.println("null");
    }

}
