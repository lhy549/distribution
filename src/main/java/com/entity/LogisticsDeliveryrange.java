package com.entity;

import java.math.BigDecimal;

public class LogisticsDeliveryrange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryrange.rangeID
     *
     * @mbg.generated
     */
    private String rangeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryrange.dePID
     *
     * @mbg.generated
     */
    private String depid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryrange.areaID
     *
     * @mbg.generated
     */
    private String areaid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryrange.rangeName
     *
     * @mbg.generated
     */
    private String rangename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryrange.deliveryPrice
     *
     * @mbg.generated
     */
    private BigDecimal deliveryprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_deliveryrange.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryrange.rangeID
     *
     * @return the value of logistics_deliveryrange.rangeID
     *
     * @mbg.generated
     */
    public String getRangeid() {
        return rangeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryrange.rangeID
     *
     * @param rangeid the value for logistics_deliveryrange.rangeID
     *
     * @mbg.generated
     */
    public void setRangeid(String rangeid) {
        this.rangeid = rangeid == null ? null : rangeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryrange.dePID
     *
     * @return the value of logistics_deliveryrange.dePID
     *
     * @mbg.generated
     */
    public String getDepid() {
        return depid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryrange.dePID
     *
     * @param depid the value for logistics_deliveryrange.dePID
     *
     * @mbg.generated
     */
    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryrange.areaID
     *
     * @return the value of logistics_deliveryrange.areaID
     *
     * @mbg.generated
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryrange.areaID
     *
     * @param areaid the value for logistics_deliveryrange.areaID
     *
     * @mbg.generated
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryrange.rangeName
     *
     * @return the value of logistics_deliveryrange.rangeName
     *
     * @mbg.generated
     */
    public String getRangename() {
        return rangename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryrange.rangeName
     *
     * @param rangename the value for logistics_deliveryrange.rangeName
     *
     * @mbg.generated
     */
    public void setRangename(String rangename) {
        this.rangename = rangename == null ? null : rangename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryrange.deliveryPrice
     *
     * @return the value of logistics_deliveryrange.deliveryPrice
     *
     * @mbg.generated
     */
    public BigDecimal getDeliveryprice() {
        return deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryrange.deliveryPrice
     *
     * @param deliveryprice the value for logistics_deliveryrange.deliveryPrice
     *
     * @mbg.generated
     */
    public void setDeliveryprice(BigDecimal deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_deliveryrange.COMMENT
     *
     * @return the value of logistics_deliveryrange.COMMENT
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_deliveryrange.COMMENT
     *
     * @param comment the value for logistics_deliveryrange.COMMENT
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}