package com.lwm.springcloud.entities;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table msgindex
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class MsgindexKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msgindex.owner
     *
     * @mbggenerated
     */
    private Integer owner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msgindex.friend
     *
     * @mbggenerated
     */
    private Integer friend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msgindex.contentID
     *
     * @mbggenerated
     */
    private Integer contentid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msgindex.owner
     *
     * @return the value of msgindex.owner
     *
     * @mbggenerated
     */
    public Integer getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msgindex.owner
     *
     * @param owner the value for msgindex.owner
     *
     * @mbggenerated
     */
    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msgindex.friend
     *
     * @return the value of msgindex.friend
     *
     * @mbggenerated
     */
    public Integer getFriend() {
        return friend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msgindex.friend
     *
     * @param friend the value for msgindex.friend
     *
     * @mbggenerated
     */
    public void setFriend(Integer friend) {
        this.friend = friend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msgindex.contentID
     *
     * @return the value of msgindex.contentID
     *
     * @mbggenerated
     */
    public Integer getContentid() {
        return contentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msgindex.contentID
     *
     * @param contentid the value for msgindex.contentID
     *
     * @mbggenerated
     */
    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }
}