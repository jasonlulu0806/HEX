package com.lwm.springcloud.entities;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table content
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Content {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.contentID
     *
     * @mbggenerated
     */
    private Integer contentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content.message
     *
     * @mbggenerated
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.contentID
     *
     * @return the value of content.contentID
     *
     * @mbggenerated
     */
    public Integer getContentid() {
        return contentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.contentID
     *
     * @param contentid the value for content.contentID
     *
     * @mbggenerated
     */
    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.createtime
     *
     * @return the value of content.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.createtime
     *
     * @param createtime the value for content.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.type
     *
     * @return the value of content.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.type
     *
     * @param type the value for content.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content.message
     *
     * @return the value of content.message
     *
     * @mbggenerated
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content.message
     *
     * @param message the value for content.message
     *
     * @mbggenerated
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}