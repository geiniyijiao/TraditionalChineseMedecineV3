package main.java.bean;

import java.util.ArrayList;
import java.util.List;

public class MedecineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedecineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMTypeIdIsNull() {
            addCriterion("m_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIdIsNotNull() {
            addCriterion("m_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeIdEqualTo(Integer value) {
            addCriterion("m_type_id =", value, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdNotEqualTo(Integer value) {
            addCriterion("m_type_id <>", value, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdGreaterThan(Integer value) {
            addCriterion("m_type_id >", value, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_type_id >=", value, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdLessThan(Integer value) {
            addCriterion("m_type_id <", value, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_type_id <=", value, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdIn(List<Integer> values) {
            addCriterion("m_type_id in", values, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdNotIn(List<Integer> values) {
            addCriterion("m_type_id not in", values, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("m_type_id between", value1, value2, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_type_id not between", value1, value2, "mTypeId");
            return (Criteria) this;
        }

        public Criteria andMTraitIsNull() {
            addCriterion("m_trait is null");
            return (Criteria) this;
        }

        public Criteria andMTraitIsNotNull() {
            addCriterion("m_trait is not null");
            return (Criteria) this;
        }

        public Criteria andMTraitEqualTo(String value) {
            addCriterion("m_trait =", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitNotEqualTo(String value) {
            addCriterion("m_trait <>", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitGreaterThan(String value) {
            addCriterion("m_trait >", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitGreaterThanOrEqualTo(String value) {
            addCriterion("m_trait >=", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitLessThan(String value) {
            addCriterion("m_trait <", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitLessThanOrEqualTo(String value) {
            addCriterion("m_trait <=", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitLike(String value) {
            addCriterion("m_trait like", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitNotLike(String value) {
            addCriterion("m_trait not like", value, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitIn(List<String> values) {
            addCriterion("m_trait in", values, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitNotIn(List<String> values) {
            addCriterion("m_trait not in", values, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitBetween(String value1, String value2) {
            addCriterion("m_trait between", value1, value2, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMTraitNotBetween(String value1, String value2) {
            addCriterion("m_trait not between", value1, value2, "mTrait");
            return (Criteria) this;
        }

        public Criteria andMUseIsNull() {
            addCriterion("m_use is null");
            return (Criteria) this;
        }

        public Criteria andMUseIsNotNull() {
            addCriterion("m_use is not null");
            return (Criteria) this;
        }

        public Criteria andMUseEqualTo(String value) {
            addCriterion("m_use =", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseNotEqualTo(String value) {
            addCriterion("m_use <>", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseGreaterThan(String value) {
            addCriterion("m_use >", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseGreaterThanOrEqualTo(String value) {
            addCriterion("m_use >=", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseLessThan(String value) {
            addCriterion("m_use <", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseLessThanOrEqualTo(String value) {
            addCriterion("m_use <=", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseLike(String value) {
            addCriterion("m_use like", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseNotLike(String value) {
            addCriterion("m_use not like", value, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseIn(List<String> values) {
            addCriterion("m_use in", values, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseNotIn(List<String> values) {
            addCriterion("m_use not in", values, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseBetween(String value1, String value2) {
            addCriterion("m_use between", value1, value2, "mUse");
            return (Criteria) this;
        }

        public Criteria andMUseNotBetween(String value1, String value2) {
            addCriterion("m_use not between", value1, value2, "mUse");
            return (Criteria) this;
        }

        public Criteria andMAffectIsNull() {
            addCriterion("m_affect is null");
            return (Criteria) this;
        }

        public Criteria andMAffectIsNotNull() {
            addCriterion("m_affect is not null");
            return (Criteria) this;
        }

        public Criteria andMAffectEqualTo(String value) {
            addCriterion("m_affect =", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectNotEqualTo(String value) {
            addCriterion("m_affect <>", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectGreaterThan(String value) {
            addCriterion("m_affect >", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectGreaterThanOrEqualTo(String value) {
            addCriterion("m_affect >=", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectLessThan(String value) {
            addCriterion("m_affect <", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectLessThanOrEqualTo(String value) {
            addCriterion("m_affect <=", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectLike(String value) {
            addCriterion("m_affect like", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectNotLike(String value) {
            addCriterion("m_affect not like", value, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectIn(List<String> values) {
            addCriterion("m_affect in", values, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectNotIn(List<String> values) {
            addCriterion("m_affect not in", values, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectBetween(String value1, String value2) {
            addCriterion("m_affect between", value1, value2, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAffectNotBetween(String value1, String value2) {
            addCriterion("m_affect not between", value1, value2, "mAffect");
            return (Criteria) this;
        }

        public Criteria andMAttentionIsNull() {
            addCriterion("m_attention is null");
            return (Criteria) this;
        }

        public Criteria andMAttentionIsNotNull() {
            addCriterion("m_attention is not null");
            return (Criteria) this;
        }

        public Criteria andMAttentionEqualTo(String value) {
            addCriterion("m_attention =", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionNotEqualTo(String value) {
            addCriterion("m_attention <>", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionGreaterThan(String value) {
            addCriterion("m_attention >", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("m_attention >=", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionLessThan(String value) {
            addCriterion("m_attention <", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionLessThanOrEqualTo(String value) {
            addCriterion("m_attention <=", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionLike(String value) {
            addCriterion("m_attention like", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionNotLike(String value) {
            addCriterion("m_attention not like", value, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionIn(List<String> values) {
            addCriterion("m_attention in", values, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionNotIn(List<String> values) {
            addCriterion("m_attention not in", values, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionBetween(String value1, String value2) {
            addCriterion("m_attention between", value1, value2, "mAttention");
            return (Criteria) this;
        }

        public Criteria andMAttentionNotBetween(String value1, String value2) {
            addCriterion("m_attention not between", value1, value2, "mAttention");
            return (Criteria) this;
        }
    }

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
    }
}