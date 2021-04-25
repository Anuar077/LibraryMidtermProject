package entity;

public class CommentEntity {
    int commentid;
    String commenttitle;
    String commentauthor;
    String commentpage;
    String commentyear;

    public CommentEntity(String commentauthor, String commenttitle) {
        this.commentauthor = commentauthor;
        this.commenttitle = commenttitle;
        this.commentpage = "";
        this.commentyear = "";
    }


    public CommentEntity(String commentauthor, String commenttitle, String commentpage, String commentyear) {
        this.commentid = -1;
        this.commentauthor = commentauthor;
        this.commenttitle = commenttitle;
        this.commentpage = commentpage;
        this.commentyear = commentyear;
    }

    public CommentEntity(int bookid, String commentauthor, String commenttitle, String commentpage, String commentyear) {
        this.commentid = commentid;
        this.commentauthor = commentauthor;
        this.commenttitle = commenttitle;
        this.commentpage = commentpage;
        this.commentyear = commentyear;
    }

    public CommentEntity() {

    }

    @Override
    public String toString() {
        return "LibraryEntity{" +
                "bookid=" + commentid +
                ", title='" + commenttitle + '\'' +
                ", author='" + commentauthor + '\'' +
                ", page='" + commentpage + '\'' +
                ", year='" + commentyear + '\'' +
                '}';
    }

    public String getCommentAuthor() {
        return commentauthor;
    }

    public void setCommentAuthor(String commentauthor) {
        this.commentauthor = commentauthor;
    }

    public String getCommentPage() {
        return commentpage;
    }

    public void setCommentPage(String commentpage) {
        this.commentpage = commentpage;
    }

    public String getCommentTitle() {
        return commenttitle;
    }

    public void setCommentTitle(String commenttitle) {
        this.commenttitle = commenttitle;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public String getCommentYear() {
        return commentyear;
    }

    public void setCommentYear(String commentyear) {
        this.commentyear = commentyear;
    }
}
