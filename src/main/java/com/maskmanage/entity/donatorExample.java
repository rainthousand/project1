package com.maskmanage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class donatorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public donatorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDonatoridIsNull() {
            addCriterion("donatorId is null");
            return (Criteria) this;
        }

        public Criteria andDonatoridIsNotNull() {
            addCriterion("donatorId is not null");
            return (Criteria) this;
        }

        public Criteria andDonatoridEqualTo(Integer value) {
            addCriterion("donatorId =", value, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridNotEqualTo(Integer value) {
            addCriterion("donatorId <>", value, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridGreaterThan(Integer value) {
            addCriterion("donatorId >", value, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("donatorId >=", value, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridLessThan(Integer value) {
            addCriterion("donatorId <", value, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridLessThanOrEqualTo(Integer value) {
            addCriterion("donatorId <=", value, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridIn(List<Integer> values) {
            addCriterion("donatorId in", values, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridNotIn(List<Integer> values) {
            addCriterion("donatorId not in", values, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridBetween(Integer value1, Integer value2) {
            addCriterion("donatorId between", value1, value2, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("donatorId not between", value1, value2, "donatorid");
            return (Criteria) this;
        }

        public Criteria andDonatornameIsNull() {
            addCriterion("donatorName is null");
            return (Criteria) this;
        }

        public Criteria andDonatornameIsNotNull() {
            addCriterion("donatorName is not null");
            return (Criteria) this;
        }

        public Criteria andDonatornameEqualTo(String value) {
            addCriterion("donatorName =", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameNotEqualTo(String value) {
            addCriterion("donatorName <>", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameGreaterThan(String value) {
            addCriterion("donatorName >", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameGreaterThanOrEqualTo(String value) {
            addCriterion("donatorName >=", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameLessThan(String value) {
            addCriterion("donatorName <", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameLessThanOrEqualTo(String value) {
            addCriterion("donatorName <=", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameLike(String value) {
            addCriterion("donatorName like", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameNotLike(String value) {
            addCriterion("donatorName not like", value, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameIn(List<String> values) {
            addCriterion("donatorName in", values, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameNotIn(List<String> values) {
            addCriterion("donatorName not in", values, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameBetween(String value1, String value2) {
            addCriterion("donatorName between", value1, value2, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatornameNotBetween(String value1, String value2) {
            addCriterion("donatorName not between", value1, value2, "donatorname");
            return (Criteria) this;
        }

        public Criteria andDonatortelIsNull() {
            addCriterion("donatorTel is null");
            return (Criteria) this;
        }

        public Criteria andDonatortelIsNotNull() {
            addCriterion("donatorTel is not null");
            return (Criteria) this;
        }

        public Criteria andDonatortelEqualTo(String value) {
            addCriterion("donatorTel =", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelNotEqualTo(String value) {
            addCriterion("donatorTel <>", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelGreaterThan(String value) {
            addCriterion("donatorTel >", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelGreaterThanOrEqualTo(String value) {
            addCriterion("donatorTel >=", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelLessThan(String value) {
            addCriterion("donatorTel <", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelLessThanOrEqualTo(String value) {
            addCriterion("donatorTel <=", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelLike(String value) {
            addCriterion("donatorTel like", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelNotLike(String value) {
            addCriterion("donatorTel not like", value, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelIn(List<String> values) {
            addCriterion("donatorTel in", values, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelNotIn(List<String> values) {
            addCriterion("donatorTel not in", values, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelBetween(String value1, String value2) {
            addCriterion("donatorTel between", value1, value2, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatortelNotBetween(String value1, String value2) {
            addCriterion("donatorTel not between", value1, value2, "donatortel");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridIsNull() {
            addCriterion("donatorUserId is null");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridIsNotNull() {
            addCriterion("donatorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridEqualTo(Integer value) {
            addCriterion("donatorUserId =", value, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridNotEqualTo(Integer value) {
            addCriterion("donatorUserId <>", value, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridGreaterThan(Integer value) {
            addCriterion("donatorUserId >", value, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("donatorUserId >=", value, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridLessThan(Integer value) {
            addCriterion("donatorUserId <", value, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridLessThanOrEqualTo(Integer value) {
            addCriterion("donatorUserId <=", value, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridIn(List<Integer> values) {
            addCriterion("donatorUserId in", values, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridNotIn(List<Integer> values) {
            addCriterion("donatorUserId not in", values, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridBetween(Integer value1, Integer value2) {
            addCriterion("donatorUserId between", value1, value2, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatoruseridNotBetween(Integer value1, Integer value2) {
            addCriterion("donatorUserId not between", value1, value2, "donatoruserid");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateIsNull() {
            addCriterion("donatorSignDate is null");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateIsNotNull() {
            addCriterion("donatorSignDate is not null");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateEqualTo(Date value) {
            addCriterion("donatorSignDate =", value, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateNotEqualTo(Date value) {
            addCriterion("donatorSignDate <>", value, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateGreaterThan(Date value) {
            addCriterion("donatorSignDate >", value, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("donatorSignDate >=", value, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateLessThan(Date value) {
            addCriterion("donatorSignDate <", value, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateLessThanOrEqualTo(Date value) {
            addCriterion("donatorSignDate <=", value, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateIn(List<Date> values) {
            addCriterion("donatorSignDate in", values, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateNotIn(List<Date> values) {
            addCriterion("donatorSignDate not in", values, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateBetween(Date value1, Date value2) {
            addCriterion("donatorSignDate between", value1, value2, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatorsigndateNotBetween(Date value1, Date value2) {
            addCriterion("donatorSignDate not between", value1, value2, "donatorsigndate");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumIsNull() {
            addCriterion("donatorIDnum is null");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumIsNotNull() {
            addCriterion("donatorIDnum is not null");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumEqualTo(String value) {
            addCriterion("donatorIDnum =", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumNotEqualTo(String value) {
            addCriterion("donatorIDnum <>", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumGreaterThan(String value) {
            addCriterion("donatorIDnum >", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumGreaterThanOrEqualTo(String value) {
            addCriterion("donatorIDnum >=", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumLessThan(String value) {
            addCriterion("donatorIDnum <", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumLessThanOrEqualTo(String value) {
            addCriterion("donatorIDnum <=", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumLike(String value) {
            addCriterion("donatorIDnum like", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumNotLike(String value) {
            addCriterion("donatorIDnum not like", value, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumIn(List<String> values) {
            addCriterion("donatorIDnum in", values, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumNotIn(List<String> values) {
            addCriterion("donatorIDnum not in", values, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumBetween(String value1, String value2) {
            addCriterion("donatorIDnum between", value1, value2, "donatoridnum");
            return (Criteria) this;
        }

        public Criteria andDonatoridnumNotBetween(String value1, String value2) {
            addCriterion("donatorIDnum not between", value1, value2, "donatoridnum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table donator
     *
     * @mbggenerated do_not_delete_during_merge Wed May 27 13:01:29 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table donator
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}