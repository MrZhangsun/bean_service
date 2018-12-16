package top.zhangsun.bean.pojo.entity;

import java.util.Date;

public class Bean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.rate
     *
     * @mbg.generated
     */
    private Float rate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.currency
     *
     * @mbg.generated
     */
    private String currency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.creae_time
     *
     * @mbg.generated
     */
    private Date creaeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_BEAN.delete
     *
     * @mbg.generated
     */
    private Boolean delete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.id
     *
     * @return the value of CHINA_SOFT_BEAN.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.id
     *
     * @param id the value for CHINA_SOFT_BEAN.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.type
     *
     * @return the value of CHINA_SOFT_BEAN.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.type
     *
     * @param type the value for CHINA_SOFT_BEAN.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.name
     *
     * @return the value of CHINA_SOFT_BEAN.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.name
     *
     * @param name the value for CHINA_SOFT_BEAN.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.rate
     *
     * @return the value of CHINA_SOFT_BEAN.rate
     *
     * @mbg.generated
     */
    public Float getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.rate
     *
     * @param rate the value for CHINA_SOFT_BEAN.rate
     *
     * @mbg.generated
     */
    public void setRate(Float rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.currency
     *
     * @return the value of CHINA_SOFT_BEAN.currency
     *
     * @mbg.generated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.currency
     *
     * @param currency the value for CHINA_SOFT_BEAN.currency
     *
     * @mbg.generated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.creae_time
     *
     * @return the value of CHINA_SOFT_BEAN.creae_time
     *
     * @mbg.generated
     */
    public Date getCreaeTime() {
        return creaeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.creae_time
     *
     * @param creaeTime the value for CHINA_SOFT_BEAN.creae_time
     *
     * @mbg.generated
     */
    public void setCreaeTime(Date creaeTime) {
        this.creaeTime = creaeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.update_time
     *
     * @return the value of CHINA_SOFT_BEAN.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.update_time
     *
     * @param updateTime the value for CHINA_SOFT_BEAN.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_BEAN.delete
     *
     * @return the value of CHINA_SOFT_BEAN.delete
     *
     * @mbg.generated
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_BEAN.delete
     *
     * @param delete the value for CHINA_SOFT_BEAN.delete
     *
     * @mbg.generated
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}