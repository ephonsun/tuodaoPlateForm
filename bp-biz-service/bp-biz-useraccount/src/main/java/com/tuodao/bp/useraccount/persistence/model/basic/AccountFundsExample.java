package com.tuodao.bp.useraccount.persistence.model.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountFundsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AccountFundsExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTotalFundIsNull() {
            addCriterion("total_fund is null");
            return (Criteria) this;
        }

        public Criteria andTotalFundIsNotNull() {
            addCriterion("total_fund is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFundEqualTo(BigDecimal value) {
            addCriterion("total_fund =", value, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundNotEqualTo(BigDecimal value) {
            addCriterion("total_fund <>", value, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundGreaterThan(BigDecimal value) {
            addCriterion("total_fund >", value, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fund >=", value, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundLessThan(BigDecimal value) {
            addCriterion("total_fund <", value, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fund <=", value, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundIn(List<BigDecimal> values) {
            addCriterion("total_fund in", values, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundNotIn(List<BigDecimal> values) {
            addCriterion("total_fund not in", values, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fund between", value1, value2, "totalFund");
            return (Criteria) this;
        }

        public Criteria andTotalFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fund not between", value1, value2, "totalFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundIsNull() {
            addCriterion("finance_fund is null");
            return (Criteria) this;
        }

        public Criteria andFinanceFundIsNotNull() {
            addCriterion("finance_fund is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceFundEqualTo(BigDecimal value) {
            addCriterion("finance_fund =", value, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundNotEqualTo(BigDecimal value) {
            addCriterion("finance_fund <>", value, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundGreaterThan(BigDecimal value) {
            addCriterion("finance_fund >", value, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_fund >=", value, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundLessThan(BigDecimal value) {
            addCriterion("finance_fund <", value, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_fund <=", value, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundIn(List<BigDecimal> values) {
            addCriterion("finance_fund in", values, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundNotIn(List<BigDecimal> values) {
            addCriterion("finance_fund not in", values, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_fund between", value1, value2, "financeFund");
            return (Criteria) this;
        }

        public Criteria andFinanceFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_fund not between", value1, value2, "financeFund");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorIsNull() {
            addCriterion("gmt_creator is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorIsNotNull() {
            addCriterion("gmt_creator is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorEqualTo(String value) {
            addCriterion("gmt_creator =", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotEqualTo(String value) {
            addCriterion("gmt_creator <>", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorGreaterThan(String value) {
            addCriterion("gmt_creator >", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_creator >=", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorLessThan(String value) {
            addCriterion("gmt_creator <", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorLessThanOrEqualTo(String value) {
            addCriterion("gmt_creator <=", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorLike(String value) {
            addCriterion("gmt_creator like", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotLike(String value) {
            addCriterion("gmt_creator not like", value, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorIn(List<String> values) {
            addCriterion("gmt_creator in", values, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotIn(List<String> values) {
            addCriterion("gmt_creator not in", values, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorBetween(String value1, String value2) {
            addCriterion("gmt_creator between", value1, value2, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatorNotBetween(String value1, String value2) {
            addCriterion("gmt_creator not between", value1, value2, "gmtCreator");
            return (Criteria) this;
        }

        public Criteria andGmtModifierIsNull() {
            addCriterion("gmt_modifier is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifierIsNotNull() {
            addCriterion("gmt_modifier is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifierEqualTo(String value) {
            addCriterion("gmt_modifier =", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotEqualTo(String value) {
            addCriterion("gmt_modifier <>", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierGreaterThan(String value) {
            addCriterion("gmt_modifier >", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_modifier >=", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierLessThan(String value) {
            addCriterion("gmt_modifier <", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierLessThanOrEqualTo(String value) {
            addCriterion("gmt_modifier <=", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierLike(String value) {
            addCriterion("gmt_modifier like", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotLike(String value) {
            addCriterion("gmt_modifier not like", value, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierIn(List<String> values) {
            addCriterion("gmt_modifier in", values, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotIn(List<String> values) {
            addCriterion("gmt_modifier not in", values, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierBetween(String value1, String value2) {
            addCriterion("gmt_modifier between", value1, value2, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifierNotBetween(String value1, String value2) {
            addCriterion("gmt_modifier not between", value1, value2, "gmtModifier");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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