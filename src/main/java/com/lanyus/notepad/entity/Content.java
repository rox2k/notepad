package com.lanyus.notepad.entity;

public class Content {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.uri
     *
     * @mbggenerated
     */
    private String uri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.is_lock
     *
     * @mbggenerated
     */
    private String isLock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.uri
     *
     * @return the value of content.uri
     *
     * @mbggenerated
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.uri
     *
     * @param uri the value for content.uri
     *
     * @mbggenerated
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.password
     *
     * @return the value of content.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.password
     *
     * @param password the value for content.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.is_lock
     *
     * @return the value of content.is_lock
     *
     * @mbggenerated
     */
    public String getIsLock() {
        return isLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.is_lock
     *
     * @param isLock the value for content.is_lock
     *
     * @mbggenerated
     */
    public void setIsLock(String isLock) {
        this.isLock = isLock == null ? null : isLock.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.content
     *
     * @return the value of content.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.content
     *
     * @param content the value for content.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}