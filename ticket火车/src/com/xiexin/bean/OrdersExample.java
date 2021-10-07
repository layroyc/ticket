package com.xiexin.bean;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCheciIsNull() {
            addCriterion("checi is null");
            return (Criteria) this;
        }

        public Criteria andCheciIsNotNull() {
            addCriterion("checi is not null");
            return (Criteria) this;
        }

        public Criteria andCheciEqualTo(String value) {
            addCriterion("checi =", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciNotEqualTo(String value) {
            addCriterion("checi <>", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciGreaterThan(String value) {
            addCriterion("checi >", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciGreaterThanOrEqualTo(String value) {
            addCriterion("checi >=", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciLessThan(String value) {
            addCriterion("checi <", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciLessThanOrEqualTo(String value) {
            addCriterion("checi <=", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciLike(String value) {
            addCriterion("checi like", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciNotLike(String value) {
            addCriterion("checi not like", value, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciIn(List<String> values) {
            addCriterion("checi in", values, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciNotIn(List<String> values) {
            addCriterion("checi not in", values, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciBetween(String value1, String value2) {
            addCriterion("checi between", value1, value2, "checi");
            return (Criteria) this;
        }

        public Criteria andCheciNotBetween(String value1, String value2) {
            addCriterion("checi not between", value1, value2, "checi");
            return (Criteria) this;
        }

        public Criteria andYudingtimeIsNull() {
            addCriterion("yudingTime is null");
            return (Criteria) this;
        }

        public Criteria andYudingtimeIsNotNull() {
            addCriterion("yudingTime is not null");
            return (Criteria) this;
        }

        public Criteria andYudingtimeEqualTo(String value) {
            addCriterion("yudingTime =", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeNotEqualTo(String value) {
            addCriterion("yudingTime <>", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeGreaterThan(String value) {
            addCriterion("yudingTime >", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("yudingTime >=", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeLessThan(String value) {
            addCriterion("yudingTime <", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeLessThanOrEqualTo(String value) {
            addCriterion("yudingTime <=", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeLike(String value) {
            addCriterion("yudingTime like", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeNotLike(String value) {
            addCriterion("yudingTime not like", value, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeIn(List<String> values) {
            addCriterion("yudingTime in", values, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeNotIn(List<String> values) {
            addCriterion("yudingTime not in", values, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeBetween(String value1, String value2) {
            addCriterion("yudingTime between", value1, value2, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andYudingtimeNotBetween(String value1, String value2) {
            addCriterion("yudingTime not between", value1, value2, "yudingtime");
            return (Criteria) this;
        }

        public Criteria andZuoweiIsNull() {
            addCriterion("zuowei is null");
            return (Criteria) this;
        }

        public Criteria andZuoweiIsNotNull() {
            addCriterion("zuowei is not null");
            return (Criteria) this;
        }

        public Criteria andZuoweiEqualTo(String value) {
            addCriterion("zuowei =", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiNotEqualTo(String value) {
            addCriterion("zuowei <>", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiGreaterThan(String value) {
            addCriterion("zuowei >", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiGreaterThanOrEqualTo(String value) {
            addCriterion("zuowei >=", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiLessThan(String value) {
            addCriterion("zuowei <", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiLessThanOrEqualTo(String value) {
            addCriterion("zuowei <=", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiLike(String value) {
            addCriterion("zuowei like", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiNotLike(String value) {
            addCriterion("zuowei not like", value, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiIn(List<String> values) {
            addCriterion("zuowei in", values, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiNotIn(List<String> values) {
            addCriterion("zuowei not in", values, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiBetween(String value1, String value2) {
            addCriterion("zuowei between", value1, value2, "zuowei");
            return (Criteria) this;
        }

        public Criteria andZuoweiNotBetween(String value1, String value2) {
            addCriterion("zuowei not between", value1, value2, "zuowei");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andChengpersonIsNull() {
            addCriterion("chengPerson is null");
            return (Criteria) this;
        }

        public Criteria andChengpersonIsNotNull() {
            addCriterion("chengPerson is not null");
            return (Criteria) this;
        }

        public Criteria andChengpersonEqualTo(String value) {
            addCriterion("chengPerson =", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonNotEqualTo(String value) {
            addCriterion("chengPerson <>", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonGreaterThan(String value) {
            addCriterion("chengPerson >", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonGreaterThanOrEqualTo(String value) {
            addCriterion("chengPerson >=", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonLessThan(String value) {
            addCriterion("chengPerson <", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonLessThanOrEqualTo(String value) {
            addCriterion("chengPerson <=", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonLike(String value) {
            addCriterion("chengPerson like", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonNotLike(String value) {
            addCriterion("chengPerson not like", value, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonIn(List<String> values) {
            addCriterion("chengPerson in", values, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonNotIn(List<String> values) {
            addCriterion("chengPerson not in", values, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonBetween(String value1, String value2) {
            addCriterion("chengPerson between", value1, value2, "chengperson");
            return (Criteria) this;
        }

        public Criteria andChengpersonNotBetween(String value1, String value2) {
            addCriterion("chengPerson not between", value1, value2, "chengperson");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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