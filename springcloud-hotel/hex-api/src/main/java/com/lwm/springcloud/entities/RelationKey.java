package com.lwm.springcloud.entities;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table relation
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class RelationKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column relation.owner
     *
     * @mbggenerated
     */
    private Integer owner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column relation.friend
     *
     * @mbggenerated
     */
    private Integer friend;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column relation.owner
     *
     * @return the value of relation.owner
     *
     * @mbggenerated
     */
    public Integer getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column relation.owner
     *
     * @param owner the value for relation.owner
     *
     * @mbggenerated
     */
    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column relation.friend
     *
     * @return the value of relation.friend
     *
     * @mbggenerated
     */
    public Integer getFriend() {
        return friend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column relation.friend
     *
     * @param friend the value for relation.friend
     *
     * @mbggenerated
     */
    public void setFriend(Integer friend) {
        this.friend = friend;
    }
}