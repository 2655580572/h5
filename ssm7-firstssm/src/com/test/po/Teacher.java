package com.test.po;

public class Teacher {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.name
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.sex
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.age
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.pwd
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    private String pwd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.name
     *
     * @return the value of teacher.name
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.name
     *
     * @param name the value for teacher.name
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.sex
     *
     * @return the value of teacher.sex
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.sex
     *
     * @param sex the value for teacher.sex
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.age
     *
     * @return the value of teacher.age
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.age
     *
     * @param age the value for teacher.age
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.pwd
     *
     * @return the value of teacher.pwd
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.pwd
     *
     * @param pwd the value for teacher.pwd
     *
     * @mbggenerated Thu Dec 01 14:01:02 CST 2016
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}