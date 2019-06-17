package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class FoodinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public FoodinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
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
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFoodnameIsNull() {
            addCriterion("foodname is null");
            return (Criteria) this;
        }

        public Criteria andFoodnameIsNotNull() {
            addCriterion("foodname is not null");
            return (Criteria) this;
        }

        public Criteria andFoodnameEqualTo(String value) {
            addCriterion("foodname =", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotEqualTo(String value) {
            addCriterion("foodname <>", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThan(String value) {
            addCriterion("foodname >", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("foodname >=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThan(String value) {
            addCriterion("foodname <", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThanOrEqualTo(String value) {
            addCriterion("foodname <=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLike(String value) {
            addCriterion("foodname like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotLike(String value) {
            addCriterion("foodname not like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameIn(List<String> values) {
            addCriterion("foodname in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotIn(List<String> values) {
            addCriterion("foodname not in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameBetween(String value1, String value2) {
            addCriterion("foodname between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotBetween(String value1, String value2) {
            addCriterion("foodname not between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIsNull() {
            addCriterion("foodprice is null");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIsNotNull() {
            addCriterion("foodprice is not null");
            return (Criteria) this;
        }

        public Criteria andFoodpriceEqualTo(Double value) {
            addCriterion("foodprice =", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotEqualTo(Double value) {
            addCriterion("foodprice <>", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceGreaterThan(Double value) {
            addCriterion("foodprice >", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("foodprice >=", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceLessThan(Double value) {
            addCriterion("foodprice <", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceLessThanOrEqualTo(Double value) {
            addCriterion("foodprice <=", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIn(List<Double> values) {
            addCriterion("foodprice in", values, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotIn(List<Double> values) {
            addCriterion("foodprice not in", values, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceBetween(Double value1, Double value2) {
            addCriterion("foodprice between", value1, value2, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotBetween(Double value1, Double value2) {
            addCriterion("foodprice not between", value1, value2, "foodprice");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFoodpicIsNull() {
            addCriterion("foodpic is null");
            return (Criteria) this;
        }

        public Criteria andFoodpicIsNotNull() {
            addCriterion("foodpic is not null");
            return (Criteria) this;
        }

        public Criteria andFoodpicEqualTo(String value) {
            addCriterion("foodpic =", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicNotEqualTo(String value) {
            addCriterion("foodpic <>", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicGreaterThan(String value) {
            addCriterion("foodpic >", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicGreaterThanOrEqualTo(String value) {
            addCriterion("foodpic >=", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicLessThan(String value) {
            addCriterion("foodpic <", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicLessThanOrEqualTo(String value) {
            addCriterion("foodpic <=", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicLike(String value) {
            addCriterion("foodpic like", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicNotLike(String value) {
            addCriterion("foodpic not like", value, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicIn(List<String> values) {
            addCriterion("foodpic in", values, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicNotIn(List<String> values) {
            addCriterion("foodpic not in", values, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicBetween(String value1, String value2) {
            addCriterion("foodpic between", value1, value2, "foodpic");
            return (Criteria) this;
        }

        public Criteria andFoodpicNotBetween(String value1, String value2) {
            addCriterion("foodpic not between", value1, value2, "foodpic");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidIsNull() {
            addCriterion("foodstyleid is null");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidIsNotNull() {
            addCriterion("foodstyleid is not null");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidEqualTo(Integer value) {
            addCriterion("foodstyleid =", value, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidNotEqualTo(Integer value) {
            addCriterion("foodstyleid <>", value, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidGreaterThan(Integer value) {
            addCriterion("foodstyleid >", value, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodstyleid >=", value, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidLessThan(Integer value) {
            addCriterion("foodstyleid <", value, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidLessThanOrEqualTo(Integer value) {
            addCriterion("foodstyleid <=", value, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidIn(List<Integer> values) {
            addCriterion("foodstyleid in", values, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidNotIn(List<Integer> values) {
            addCriterion("foodstyleid not in", values, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidBetween(Integer value1, Integer value2) {
            addCriterion("foodstyleid between", value1, value2, "foodstyleid");
            return (Criteria) this;
        }

        public Criteria andFoodstyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("foodstyleid not between", value1, value2, "foodstyleid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foodinfo
     *
     * @mbg.generated do_not_delete_during_merge Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foodinfo
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
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