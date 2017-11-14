package com.tuodao.bp.useraccount.persistence.model.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFinancialPlannerRuleExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UserFinancialPlannerRuleExample() {
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

        public Criteria andFinancialPlannerLevelIsNull() {
            addCriterion("financial_planner_level is null");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelIsNotNull() {
            addCriterion("financial_planner_level is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelEqualTo(Integer value) {
            addCriterion("financial_planner_level =", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelNotEqualTo(Integer value) {
            addCriterion("financial_planner_level <>", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelGreaterThan(Integer value) {
            addCriterion("financial_planner_level >", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("financial_planner_level >=", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelLessThan(Integer value) {
            addCriterion("financial_planner_level <", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("financial_planner_level <=", value, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelIn(List<Integer> values) {
            addCriterion("financial_planner_level in", values, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelNotIn(List<Integer> values) {
            addCriterion("financial_planner_level not in", values, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelBetween(Integer value1, Integer value2) {
            addCriterion("financial_planner_level between", value1, value2, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andFinancialPlannerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("financial_planner_level not between", value1, value2, "financialPlannerLevel");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalIsNull() {
            addCriterion("vip1_invitee_total is null");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalIsNotNull() {
            addCriterion("vip1_invitee_total is not null");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalEqualTo(Integer value) {
            addCriterion("vip1_invitee_total =", value, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalNotEqualTo(Integer value) {
            addCriterion("vip1_invitee_total <>", value, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalGreaterThan(Integer value) {
            addCriterion("vip1_invitee_total >", value, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip1_invitee_total >=", value, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalLessThan(Integer value) {
            addCriterion("vip1_invitee_total <", value, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalLessThanOrEqualTo(Integer value) {
            addCriterion("vip1_invitee_total <=", value, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalIn(List<Integer> values) {
            addCriterion("vip1_invitee_total in", values, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalNotIn(List<Integer> values) {
            addCriterion("vip1_invitee_total not in", values, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalBetween(Integer value1, Integer value2) {
            addCriterion("vip1_invitee_total between", value1, value2, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andVip1InviteeTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("vip1_invitee_total not between", value1, value2, "vip1InviteeTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalIsNull() {
            addCriterion("due_in_fund_total is null");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalIsNotNull() {
            addCriterion("due_in_fund_total is not null");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalEqualTo(BigDecimal value) {
            addCriterion("due_in_fund_total =", value, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalNotEqualTo(BigDecimal value) {
            addCriterion("due_in_fund_total <>", value, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalGreaterThan(BigDecimal value) {
            addCriterion("due_in_fund_total >", value, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("due_in_fund_total >=", value, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalLessThan(BigDecimal value) {
            addCriterion("due_in_fund_total <", value, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("due_in_fund_total <=", value, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalIn(List<BigDecimal> values) {
            addCriterion("due_in_fund_total in", values, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalNotIn(List<BigDecimal> values) {
            addCriterion("due_in_fund_total not in", values, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_in_fund_total between", value1, value2, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDueInFundTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("due_in_fund_total not between", value1, value2, "dueInFundTotal");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerIsNull() {
            addCriterion("direct_cashback_per is null");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerIsNotNull() {
            addCriterion("direct_cashback_per is not null");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerEqualTo(Double value) {
            addCriterion("direct_cashback_per =", value, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerNotEqualTo(Double value) {
            addCriterion("direct_cashback_per <>", value, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerGreaterThan(Double value) {
            addCriterion("direct_cashback_per >", value, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerGreaterThanOrEqualTo(Double value) {
            addCriterion("direct_cashback_per >=", value, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerLessThan(Double value) {
            addCriterion("direct_cashback_per <", value, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerLessThanOrEqualTo(Double value) {
            addCriterion("direct_cashback_per <=", value, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerIn(List<Double> values) {
            addCriterion("direct_cashback_per in", values, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerNotIn(List<Double> values) {
            addCriterion("direct_cashback_per not in", values, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerBetween(Double value1, Double value2) {
            addCriterion("direct_cashback_per between", value1, value2, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andDirectCashbackPerNotBetween(Double value1, Double value2) {
            addCriterion("direct_cashback_per not between", value1, value2, "directCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerIsNull() {
            addCriterion("indirect_cashback_per is null");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerIsNotNull() {
            addCriterion("indirect_cashback_per is not null");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerEqualTo(Double value) {
            addCriterion("indirect_cashback_per =", value, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerNotEqualTo(Double value) {
            addCriterion("indirect_cashback_per <>", value, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerGreaterThan(Double value) {
            addCriterion("indirect_cashback_per >", value, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerGreaterThanOrEqualTo(Double value) {
            addCriterion("indirect_cashback_per >=", value, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerLessThan(Double value) {
            addCriterion("indirect_cashback_per <", value, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerLessThanOrEqualTo(Double value) {
            addCriterion("indirect_cashback_per <=", value, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerIn(List<Double> values) {
            addCriterion("indirect_cashback_per in", values, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerNotIn(List<Double> values) {
            addCriterion("indirect_cashback_per not in", values, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerBetween(Double value1, Double value2) {
            addCriterion("indirect_cashback_per between", value1, value2, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andIndirectCashbackPerNotBetween(Double value1, Double value2) {
            addCriterion("indirect_cashback_per not between", value1, value2, "indirectCashbackPer");
            return (Criteria) this;
        }

        public Criteria andValidityTypeIsNull() {
            addCriterion("validity_type is null");
            return (Criteria) this;
        }

        public Criteria andValidityTypeIsNotNull() {
            addCriterion("validity_type is not null");
            return (Criteria) this;
        }

        public Criteria andValidityTypeEqualTo(Integer value) {
            addCriterion("validity_type =", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotEqualTo(Integer value) {
            addCriterion("validity_type <>", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeGreaterThan(Integer value) {
            addCriterion("validity_type >", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("validity_type >=", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeLessThan(Integer value) {
            addCriterion("validity_type <", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("validity_type <=", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeIn(List<Integer> values) {
            addCriterion("validity_type in", values, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotIn(List<Integer> values) {
            addCriterion("validity_type not in", values, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeBetween(Integer value1, Integer value2) {
            addCriterion("validity_type between", value1, value2, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("validity_type not between", value1, value2, "validityType");
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