package com.kodilla.testing.forum;

public class ForumComment {

    ForumPost forumPost;
    String commentBody;
    String commentAuthor;

    public ForumComment(ForumPost forumPost, String commentBody, String commentAuthor) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.commentAuthor = commentAuthor;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (!forumPost.equals(that.forumPost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return commentAuthor.equals(that.commentAuthor);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + commentAuthor.hashCode();
        return result;
    }
}
