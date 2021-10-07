package com.xiexin.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SelectticketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SelectticketExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPlacestartIsNull() {
            addCriterion("placestart is null");
            return (Criteria) this;
        }

        public Criteria andPlacestartIsNotNull() {
            addCriterion("placestart is not null");
            return (Criteria) this;
        }

        public Criteria andPlacestartEqualTo(String value) {
            addCriterion("placestart =", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartNotEqualTo(String value) {
            addCriterion("placestart <>", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartGreaterThan(String value) {
            addCriterion("placestart >", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartGreaterThanOrEqualTo(String value) {
            addCriterion("placestart >=", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartLessThan(String value) {
            addCriterion("placestart <", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartLessThanOrEqualTo(String value) {
            addCriterion("placestart <=", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartLike(String value) {
            addCriterion("placestart like", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartNotLike(String value) {
            addCriterion("placestart not like", value, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartIn(List<String> values) {
            addCriterion("placestart in", values, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartNotIn(List<String> values) {
            addCriterion("placestart not in", values, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartBetween(String value1, String value2) {
            addCriterion("placestart between", value1, value2, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlacestartNotBetween(String value1, String value2) {
            addCriterion("placestart not between", value1, value2, "placestart");
            return (Criteria) this;
        }

        public Criteria andPlaceendIsNull() {
            addCriterion("placeEnd is null");
            return (Criteria) this;
        }

        public Criteria andPlaceendIsNotNull() {
            addCriterion("placeEnd is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceendEqualTo(String value) {
            addCriterion("placeEnd =", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendNotEqualTo(String value) {
            addCriterion("placeEnd <>", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendGreaterThan(String value) {
            addCriterion("placeEnd >", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendGreaterThanOrEqualTo(String value) {
            addCriterion("placeEnd >=", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendLessThan(String value) {
            addCriterion("placeEnd <", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendLessThanOrEqualTo(String value) {
            addCriterion("placeEnd <=", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendLike(String value) {
            addCriterion("placeEnd like", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendNotLike(String value) {
            addCriterion("placeEnd not like", value, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendIn(List<String> values) {
            addCriterion("placeEnd in", values, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendNotIn(List<String> values) {
            addCriterion("placeEnd not in", values, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendBetween(String value1, String value2) {
            addCriterion("placeEnd between", value1, value2, "placeend");
            return (Criteria) this;
        }

        public Criteria andPlaceendNotBetween(String value1, String value2) {
            addCriterion("placeEnd not between", value1, value2, "placeend");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startDate not between", value1, value2, "startdate");
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

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("StartTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("StartTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTedengIsNull() {
            addCriterion("TeDeng is null");
            return (Criteria) this;
        }

        public Criteria andTedengIsNotNull() {
            addCriterion("TeDeng is not null");
            return (Criteria) this;
        }

        public Criteria andTedengEqualTo(String value) {
            addCriterion("TeDeng =", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengNotEqualTo(String value) {
            addCriterion("TeDeng <>", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengGreaterThan(String value) {
            addCriterion("TeDeng >", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengGreaterThanOrEqualTo(String value) {
            addCriterion("TeDeng >=", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengLessThan(String value) {
            addCriterion("TeDeng <", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengLessThanOrEqualTo(String value) {
            addCriterion("TeDeng <=", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengLike(String value) {
            addCriterion("TeDeng like", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengNotLike(String value) {
            addCriterion("TeDeng not like", value, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengIn(List<String> values) {
            addCriterion("TeDeng in", values, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengNotIn(List<String> values) {
            addCriterion("TeDeng not in", values, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengBetween(String value1, String value2) {
            addCriterion("TeDeng between", value1, value2, "tedeng");
            return (Criteria) this;
        }

        public Criteria andTedengNotBetween(String value1, String value2) {
            addCriterion("TeDeng not between", value1, value2, "tedeng");
            return (Criteria) this;
        }

        public Criteria andOnezuoIsNull() {
            addCriterion("OneZuo is null");
            return (Criteria) this;
        }

        public Criteria andOnezuoIsNotNull() {
            addCriterion("OneZuo is not null");
            return (Criteria) this;
        }

        public Criteria andOnezuoEqualTo(String value) {
            addCriterion("OneZuo =", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoNotEqualTo(String value) {
            addCriterion("OneZuo <>", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoGreaterThan(String value) {
            addCriterion("OneZuo >", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoGreaterThanOrEqualTo(String value) {
            addCriterion("OneZuo >=", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoLessThan(String value) {
            addCriterion("OneZuo <", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoLessThanOrEqualTo(String value) {
            addCriterion("OneZuo <=", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoLike(String value) {
            addCriterion("OneZuo like", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoNotLike(String value) {
            addCriterion("OneZuo not like", value, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoIn(List<String> values) {
            addCriterion("OneZuo in", values, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoNotIn(List<String> values) {
            addCriterion("OneZuo not in", values, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoBetween(String value1, String value2) {
            addCriterion("OneZuo between", value1, value2, "onezuo");
            return (Criteria) this;
        }

        public Criteria andOnezuoNotBetween(String value1, String value2) {
            addCriterion("OneZuo not between", value1, value2, "onezuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoIsNull() {
            addCriterion("TwoZuo is null");
            return (Criteria) this;
        }

        public Criteria andTwozuoIsNotNull() {
            addCriterion("TwoZuo is not null");
            return (Criteria) this;
        }

        public Criteria andTwozuoEqualTo(String value) {
            addCriterion("TwoZuo =", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoNotEqualTo(String value) {
            addCriterion("TwoZuo <>", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoGreaterThan(String value) {
            addCriterion("TwoZuo >", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoGreaterThanOrEqualTo(String value) {
            addCriterion("TwoZuo >=", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoLessThan(String value) {
            addCriterion("TwoZuo <", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoLessThanOrEqualTo(String value) {
            addCriterion("TwoZuo <=", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoLike(String value) {
            addCriterion("TwoZuo like", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoNotLike(String value) {
            addCriterion("TwoZuo not like", value, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoIn(List<String> values) {
            addCriterion("TwoZuo in", values, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoNotIn(List<String> values) {
            addCriterion("TwoZuo not in", values, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoBetween(String value1, String value2) {
            addCriterion("TwoZuo between", value1, value2, "twozuo");
            return (Criteria) this;
        }

        public Criteria andTwozuoNotBetween(String value1, String value2) {
            addCriterion("TwoZuo not between", value1, value2, "twozuo");
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