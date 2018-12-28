package top.zhangsun.bean.pojo.entity;

import java.util.Date;

public class ActivityTypeEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_ACTIVITY_TYPE.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_ACTIVITY_TYPE.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_ACTIVITY_TYPE.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_ACTIVITY_TYPE.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_ACTIVITY_TYPE.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CHINA_SOFT_ACTIVITY_TYPE.delete_flag
     *
     * @mbg.generated
     */
    private String deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_ACTIVITY_TYPE.id
     *
     * @return the value of CHINA_SOFT_ACTIVITY_TYPE.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_ACTIVITY_TYPE.id
     *
     * @param id the value for CHINA_SOFT_ACTIVITY_TYPE.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_ACTIVITY_TYPE.name
     *
     * @return the value of CHINA_SOFT_ACTIVITY_TYPE.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_ACTIVITY_TYPE.name
     *
     * @param name the value for CHINA_SOFT_ACTIVITY_TYPE.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_ACTIVITY_TYPE.description
     *
     * @return the value of CHINA_SOFT_ACTIVITY_TYPE.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_ACTIVITY_TYPE.description
     *
     * @param description the value for CHINA_SOFT_ACTIVITY_TYPE.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_ACTIVITY_TYPE.create_time
     *
     * @return the value of CHINA_SOFT_ACTIVITY_TYPE.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_ACTIVITY_TYPE.create_time
     *
     * @param createTime the value for CHINA_SOFT_ACTIVITY_TYPE.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_ACTIVITY_TYPE.update_time
     *
     * @return the value of CHINA_SOFT_ACTIVITY_TYPE.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_ACTIVITY_TYPE.update_time
     *
     * @param updateTime the value for CHINA_SOFT_ACTIVITY_TYPE.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CHINA_SOFT_ACTIVITY_TYPE.delete_flag
     *
     * @return the value of CHINA_SOFT_ACTIVITY_TYPE.delete_flag
     *
     * @mbg.generated
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CHINA_SOFT_ACTIVITY_TYPE.delete_flag
     *
     * @param deleteFlag the value for CHINA_SOFT_ACTIVITY_TYPE.delete_flag
     *
     * @mbg.generated
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }
}