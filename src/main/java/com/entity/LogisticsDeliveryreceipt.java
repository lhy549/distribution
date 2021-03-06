package com.entity;

import java.util.Date;

public class LogisticsDeliveryreceipt {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryreceipt.deliveryReceiptID
     *
     * @mbg.generated
     */
    private String deliveryreceiptid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryreceipt.startCity
     *
     * @mbg.generated
     */
    private String startcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryreceipt.endCity
     *
     * @mbg.generated
     */
    private String endcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryreceipt.midCity
     *
     * @mbg.generated
     */
    private String midcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryreceipt.makeDtae
     *
     * @mbg.generated
     */
    private Date makedtae;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryreceipt.State
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryreceipt.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryreceipt.deliveryReceiptID
     *
     * @return the value of logistics_deliveryreceipt.deliveryReceiptID
     *
     * @mbg.generated
     */
    public String getDeliveryreceiptid() {
        return deliveryreceiptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryreceipt.deliveryReceiptID
     *
     * @param deliveryreceiptid the value for logistics_deliveryreceipt.deliveryReceiptID
     *
     * @mbg.generated
     */
    public void setDeliveryreceiptid(String deliveryreceiptid) {
        this.deliveryreceiptid = deliveryreceiptid == null ? null : deliveryreceiptid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryreceipt.startCity
     *
     * @return the value of logistics_deliveryreceipt.startCity
     *
     * @mbg.generated
     */
    public String getStartcity() {
        return startcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryreceipt.startCity
     *
     * @param startcity the value for logistics_deliveryreceipt.startCity
     *
     * @mbg.generated
     */
    public void setStartcity(String startcity) {
        this.startcity = startcity == null ? null : startcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryreceipt.endCity
     *
     * @return the value of logistics_deliveryreceipt.endCity
     *
     * @mbg.generated
     */
    public String getEndcity() {
        return endcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryreceipt.endCity
     *
     * @param endcity the value for logistics_deliveryreceipt.endCity
     *
     * @mbg.generated
     */
    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryreceipt.midCity
     *
     * @return the value of logistics_deliveryreceipt.midCity
     *
     * @mbg.generated
     */
    public String getMidcity() {
        return midcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryreceipt.midCity
     *
     * @param midcity the value for logistics_deliveryreceipt.midCity
     *
     * @mbg.generated
     */
    public void setMidcity(String midcity) {
        this.midcity = midcity == null ? null : midcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryreceipt.makeDtae
     *
     * @return the value of logistics_deliveryreceipt.makeDtae
     *
     * @mbg.generated
     */
    public Date getMakedtae() {
        return makedtae;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryreceipt.makeDtae
     *
     * @param makedtae the value for logistics_deliveryreceipt.makeDtae
     *
     * @mbg.generated
     */
    public void setMakedtae(Date makedtae) {
        this.makedtae = makedtae;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryreceipt.State
     *
     * @return the value of logistics_deliveryreceipt.State
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryreceipt.State
     *
     * @param state the value for logistics_deliveryreceipt.State
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryreceipt.COMMENT
     *
     * @return the value of logistics_deliveryreceipt.COMMENT
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryreceipt.COMMENT
     *
     * @param comment the value for logistics_deliveryreceipt.COMMENT
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}