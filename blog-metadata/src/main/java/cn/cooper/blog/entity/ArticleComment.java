package cn.cooper.blog.entity;

import java.util.Date;

public class ArticleComment {
    private Integer id;

    private Integer articleId;

    private String userName;

    private String blogUrl;

    private Date createTime;

    private String email;

    private Integer fatherComm;

    private String beFeedback;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl == null ? null : blogUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getFatherComm() {
        return fatherComm;
    }

    public void setFatherComm(Integer fatherComm) {
        this.fatherComm = fatherComm;
    }

    public String getBeFeedback() {
        return beFeedback;
    }

    public void setBeFeedback(String beFeedback) {
        this.beFeedback = beFeedback == null ? null : beFeedback.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}