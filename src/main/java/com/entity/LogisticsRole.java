package com.entity;

public class LogisticsRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_role.roleID
     *
     * @mbg.generated
     */
    private String roleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_role.roleName
     *
     * @mbg.generated
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_role.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_role.roleID
     *
     * @return the value of logistics_role.roleID
     *
     * @mbg.generated
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_role.roleID
     *
     * @param roleid the value for logistics_role.roleID
     *
     * @mbg.generated
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_role.roleName
     *
     * @return the value of logistics_role.roleName
     *
     * @mbg.generated
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_role.roleName
     *
     * @param rolename the value for logistics_role.roleName
     *
     * @mbg.generated
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_role.COMMENT
     *
     * @return the value of logistics_role.COMMENT
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_role.COMMENT
     *
     * @param comment the value for logistics_role.COMMENT
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}