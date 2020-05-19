package com.hd.beast.entity.entity2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TManagerCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TManagerCommodityExample() {
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

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdIsNull() {
            addCriterion("supplier_com_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdIsNotNull() {
            addCriterion("supplier_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdEqualTo(Long value) {
            addCriterion("supplier_com_id =", value, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdNotEqualTo(Long value) {
            addCriterion("supplier_com_id <>", value, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdGreaterThan(Long value) {
            addCriterion("supplier_com_id >", value, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_com_id >=", value, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdLessThan(Long value) {
            addCriterion("supplier_com_id <", value, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_com_id <=", value, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdIn(List<Long> values) {
            addCriterion("supplier_com_id in", values, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdNotIn(List<Long> values) {
            addCriterion("supplier_com_id not in", values, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdBetween(Long value1, Long value2) {
            addCriterion("supplier_com_id between", value1, value2, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andSupplierComIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_com_id not between", value1, value2, "supplierComId");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNull() {
            addCriterion("real_price is null");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNotNull() {
            addCriterion("real_price is not null");
            return (Criteria) this;
        }

        public Criteria andRealPriceEqualTo(BigDecimal value) {
            addCriterion("real_price =", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("real_price <>", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThan(BigDecimal value) {
            addCriterion("real_price >", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_price >=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThan(BigDecimal value) {
            addCriterion("real_price <", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_price <=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIn(List<BigDecimal> values) {
            addCriterion("real_price in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("real_price not in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_price between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_price not between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIsNull() {
            addCriterion("commodity_desc is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIsNotNull() {
            addCriterion("commodity_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescEqualTo(String value) {
            addCriterion("commodity_desc =", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotEqualTo(String value) {
            addCriterion("commodity_desc <>", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThan(String value) {
            addCriterion("commodity_desc >", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_desc >=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThan(String value) {
            addCriterion("commodity_desc <", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThanOrEqualTo(String value) {
            addCriterion("commodity_desc <=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLike(String value) {
            addCriterion("commodity_desc like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotLike(String value) {
            addCriterion("commodity_desc not like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIn(List<String> values) {
            addCriterion("commodity_desc in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotIn(List<String> values) {
            addCriterion("commodity_desc not in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescBetween(String value1, String value2) {
            addCriterion("commodity_desc between", value1, value2, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotBetween(String value1, String value2) {
            addCriterion("commodity_desc not between", value1, value2, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoIsNull() {
            addCriterion("commodity_logo is null");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoIsNotNull() {
            addCriterion("commodity_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoEqualTo(String value) {
            addCriterion("commodity_logo =", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoNotEqualTo(String value) {
            addCriterion("commodity_logo <>", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoGreaterThan(String value) {
            addCriterion("commodity_logo >", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_logo >=", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoLessThan(String value) {
            addCriterion("commodity_logo <", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoLessThanOrEqualTo(String value) {
            addCriterion("commodity_logo <=", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoLike(String value) {
            addCriterion("commodity_logo like", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoNotLike(String value) {
            addCriterion("commodity_logo not like", value, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoIn(List<String> values) {
            addCriterion("commodity_logo in", values, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoNotIn(List<String> values) {
            addCriterion("commodity_logo not in", values, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoBetween(String value1, String value2) {
            addCriterion("commodity_logo between", value1, value2, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andCommodityLogoNotBetween(String value1, String value2) {
            addCriterion("commodity_logo not between", value1, value2, "commodityLogo");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNull() {
            addCriterion("reference_price is null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNotNull() {
            addCriterion("reference_price is not null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceEqualTo(String value) {
            addCriterion("reference_price =", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotEqualTo(String value) {
            addCriterion("reference_price <>", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThan(String value) {
            addCriterion("reference_price >", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThanOrEqualTo(String value) {
            addCriterion("reference_price >=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThan(String value) {
            addCriterion("reference_price <", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThanOrEqualTo(String value) {
            addCriterion("reference_price <=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLike(String value) {
            addCriterion("reference_price like", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotLike(String value) {
            addCriterion("reference_price not like", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIn(List<String> values) {
            addCriterion("reference_price in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotIn(List<String> values) {
            addCriterion("reference_price not in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceBetween(String value1, String value2) {
            addCriterion("reference_price between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotBetween(String value1, String value2) {
            addCriterion("reference_price not between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andPriceDescIsNull() {
            addCriterion("price_desc is null");
            return (Criteria) this;
        }

        public Criteria andPriceDescIsNotNull() {
            addCriterion("price_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDescEqualTo(String value) {
            addCriterion("price_desc =", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotEqualTo(String value) {
            addCriterion("price_desc <>", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescGreaterThan(String value) {
            addCriterion("price_desc >", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescGreaterThanOrEqualTo(String value) {
            addCriterion("price_desc >=", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescLessThan(String value) {
            addCriterion("price_desc <", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescLessThanOrEqualTo(String value) {
            addCriterion("price_desc <=", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescLike(String value) {
            addCriterion("price_desc like", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotLike(String value) {
            addCriterion("price_desc not like", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescIn(List<String> values) {
            addCriterion("price_desc in", values, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotIn(List<String> values) {
            addCriterion("price_desc not in", values, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescBetween(String value1, String value2) {
            addCriterion("price_desc between", value1, value2, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotBetween(String value1, String value2) {
            addCriterion("price_desc not between", value1, value2, "priceDesc");
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

        public Criteria andValidityTypeEqualTo(Short value) {
            addCriterion("validity_type =", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotEqualTo(Short value) {
            addCriterion("validity_type <>", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeGreaterThan(Short value) {
            addCriterion("validity_type >", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("validity_type >=", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeLessThan(Short value) {
            addCriterion("validity_type <", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeLessThanOrEqualTo(Short value) {
            addCriterion("validity_type <=", value, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeIn(List<Short> values) {
            addCriterion("validity_type in", values, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotIn(List<Short> values) {
            addCriterion("validity_type not in", values, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeBetween(Short value1, Short value2) {
            addCriterion("validity_type between", value1, value2, "validityType");
            return (Criteria) this;
        }

        public Criteria andValidityTypeNotBetween(Short value1, Short value2) {
            addCriterion("validity_type not between", value1, value2, "validityType");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Long value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Long value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Long value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Long value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Long> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Long> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Long value1, Long value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andUsingFlagIsNull() {
            addCriterion("using_flag is null");
            return (Criteria) this;
        }

        public Criteria andUsingFlagIsNotNull() {
            addCriterion("using_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUsingFlagEqualTo(Short value) {
            addCriterion("using_flag =", value, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagNotEqualTo(Short value) {
            addCriterion("using_flag <>", value, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagGreaterThan(Short value) {
            addCriterion("using_flag >", value, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("using_flag >=", value, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagLessThan(Short value) {
            addCriterion("using_flag <", value, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagLessThanOrEqualTo(Short value) {
            addCriterion("using_flag <=", value, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagIn(List<Short> values) {
            addCriterion("using_flag in", values, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagNotIn(List<Short> values) {
            addCriterion("using_flag not in", values, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagBetween(Short value1, Short value2) {
            addCriterion("using_flag between", value1, value2, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andUsingFlagNotBetween(Short value1, Short value2) {
            addCriterion("using_flag not between", value1, value2, "usingFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagIsNull() {
            addCriterion("sort_flag is null");
            return (Criteria) this;
        }

        public Criteria andSortFlagIsNotNull() {
            addCriterion("sort_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSortFlagEqualTo(Short value) {
            addCriterion("sort_flag =", value, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagNotEqualTo(Short value) {
            addCriterion("sort_flag <>", value, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagGreaterThan(Short value) {
            addCriterion("sort_flag >", value, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("sort_flag >=", value, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagLessThan(Short value) {
            addCriterion("sort_flag <", value, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagLessThanOrEqualTo(Short value) {
            addCriterion("sort_flag <=", value, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagIn(List<Short> values) {
            addCriterion("sort_flag in", values, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagNotIn(List<Short> values) {
            addCriterion("sort_flag not in", values, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagBetween(Short value1, Short value2) {
            addCriterion("sort_flag between", value1, value2, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andSortFlagNotBetween(Short value1, Short value2) {
            addCriterion("sort_flag not between", value1, value2, "sortFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIsNull() {
            addCriterion("commodity_type is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIsNotNull() {
            addCriterion("commodity_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeEqualTo(Long value) {
            addCriterion("commodity_type =", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNotEqualTo(Long value) {
            addCriterion("commodity_type <>", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeGreaterThan(Long value) {
            addCriterion("commodity_type >", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_type >=", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeLessThan(Long value) {
            addCriterion("commodity_type <", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeLessThanOrEqualTo(Long value) {
            addCriterion("commodity_type <=", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIn(List<Long> values) {
            addCriterion("commodity_type in", values, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNotIn(List<Long> values) {
            addCriterion("commodity_type not in", values, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeBetween(Long value1, Long value2) {
            addCriterion("commodity_type between", value1, value2, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNotBetween(Long value1, Long value2) {
            addCriterion("commodity_type not between", value1, value2, "commodityType");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumIsNull() {
            addCriterion("max_deal_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumIsNotNull() {
            addCriterion("max_deal_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumEqualTo(Short value) {
            addCriterion("max_deal_num =", value, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumNotEqualTo(Short value) {
            addCriterion("max_deal_num <>", value, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumGreaterThan(Short value) {
            addCriterion("max_deal_num >", value, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumGreaterThanOrEqualTo(Short value) {
            addCriterion("max_deal_num >=", value, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumLessThan(Short value) {
            addCriterion("max_deal_num <", value, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumLessThanOrEqualTo(Short value) {
            addCriterion("max_deal_num <=", value, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumIn(List<Short> values) {
            addCriterion("max_deal_num in", values, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumNotIn(List<Short> values) {
            addCriterion("max_deal_num not in", values, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumBetween(Short value1, Short value2) {
            addCriterion("max_deal_num between", value1, value2, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMaxDealNumNotBetween(Short value1, Short value2) {
            addCriterion("max_deal_num not between", value1, value2, "maxDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumIsNull() {
            addCriterion("min_deal_num is null");
            return (Criteria) this;
        }

        public Criteria andMinDealNumIsNotNull() {
            addCriterion("min_deal_num is not null");
            return (Criteria) this;
        }

        public Criteria andMinDealNumEqualTo(Short value) {
            addCriterion("min_deal_num =", value, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumNotEqualTo(Short value) {
            addCriterion("min_deal_num <>", value, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumGreaterThan(Short value) {
            addCriterion("min_deal_num >", value, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumGreaterThanOrEqualTo(Short value) {
            addCriterion("min_deal_num >=", value, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumLessThan(Short value) {
            addCriterion("min_deal_num <", value, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumLessThanOrEqualTo(Short value) {
            addCriterion("min_deal_num <=", value, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumIn(List<Short> values) {
            addCriterion("min_deal_num in", values, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumNotIn(List<Short> values) {
            addCriterion("min_deal_num not in", values, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumBetween(Short value1, Short value2) {
            addCriterion("min_deal_num between", value1, value2, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andMinDealNumNotBetween(Short value1, Short value2) {
            addCriterion("min_deal_num not between", value1, value2, "minDealNum");
            return (Criteria) this;
        }

        public Criteria andDealUnitIsNull() {
            addCriterion("deal_unit is null");
            return (Criteria) this;
        }

        public Criteria andDealUnitIsNotNull() {
            addCriterion("deal_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDealUnitEqualTo(Short value) {
            addCriterion("deal_unit =", value, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitNotEqualTo(Short value) {
            addCriterion("deal_unit <>", value, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitGreaterThan(Short value) {
            addCriterion("deal_unit >", value, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitGreaterThanOrEqualTo(Short value) {
            addCriterion("deal_unit >=", value, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitLessThan(Short value) {
            addCriterion("deal_unit <", value, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitLessThanOrEqualTo(Short value) {
            addCriterion("deal_unit <=", value, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitIn(List<Short> values) {
            addCriterion("deal_unit in", values, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitNotIn(List<Short> values) {
            addCriterion("deal_unit not in", values, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitBetween(Short value1, Short value2) {
            addCriterion("deal_unit between", value1, value2, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andDealUnitNotBetween(Short value1, Short value2) {
            addCriterion("deal_unit not between", value1, value2, "dealUnit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitIsNull() {
            addCriterion("total_buy_limit is null");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitIsNotNull() {
            addCriterion("total_buy_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitEqualTo(Long value) {
            addCriterion("total_buy_limit =", value, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitNotEqualTo(Long value) {
            addCriterion("total_buy_limit <>", value, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitGreaterThan(Long value) {
            addCriterion("total_buy_limit >", value, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("total_buy_limit >=", value, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitLessThan(Long value) {
            addCriterion("total_buy_limit <", value, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitLessThanOrEqualTo(Long value) {
            addCriterion("total_buy_limit <=", value, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitIn(List<Long> values) {
            addCriterion("total_buy_limit in", values, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitNotIn(List<Long> values) {
            addCriterion("total_buy_limit not in", values, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitBetween(Long value1, Long value2) {
            addCriterion("total_buy_limit between", value1, value2, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andTotalBuyLimitNotBetween(Long value1, Long value2) {
            addCriterion("total_buy_limit not between", value1, value2, "totalBuyLimit");
            return (Criteria) this;
        }

        public Criteria andToPayNumIsNull() {
            addCriterion("to_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andToPayNumIsNotNull() {
            addCriterion("to_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andToPayNumEqualTo(Integer value) {
            addCriterion("to_pay_num =", value, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumNotEqualTo(Integer value) {
            addCriterion("to_pay_num <>", value, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumGreaterThan(Integer value) {
            addCriterion("to_pay_num >", value, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_pay_num >=", value, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumLessThan(Integer value) {
            addCriterion("to_pay_num <", value, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("to_pay_num <=", value, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumIn(List<Integer> values) {
            addCriterion("to_pay_num in", values, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumNotIn(List<Integer> values) {
            addCriterion("to_pay_num not in", values, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumBetween(Integer value1, Integer value2) {
            addCriterion("to_pay_num between", value1, value2, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andToPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("to_pay_num not between", value1, value2, "toPayNum");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNull() {
            addCriterion("carriage is null");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNotNull() {
            addCriterion("carriage is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageEqualTo(BigDecimal value) {
            addCriterion("carriage =", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotEqualTo(BigDecimal value) {
            addCriterion("carriage <>", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThan(BigDecimal value) {
            addCriterion("carriage >", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("carriage >=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThan(BigDecimal value) {
            addCriterion("carriage <", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("carriage <=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageIn(List<BigDecimal> values) {
            addCriterion("carriage in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotIn(List<BigDecimal> values) {
            addCriterion("carriage not in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carriage between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carriage not between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Long value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Long value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Long value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Long value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Long value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Long value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Long> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Long> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Long value1, Long value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Long value1, Long value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockIsNull() {
            addCriterion("frozen_stock is null");
            return (Criteria) this;
        }

        public Criteria andFrozenStockIsNotNull() {
            addCriterion("frozen_stock is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenStockEqualTo(Long value) {
            addCriterion("frozen_stock =", value, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockNotEqualTo(Long value) {
            addCriterion("frozen_stock <>", value, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockGreaterThan(Long value) {
            addCriterion("frozen_stock >", value, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockGreaterThanOrEqualTo(Long value) {
            addCriterion("frozen_stock >=", value, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockLessThan(Long value) {
            addCriterion("frozen_stock <", value, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockLessThanOrEqualTo(Long value) {
            addCriterion("frozen_stock <=", value, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockIn(List<Long> values) {
            addCriterion("frozen_stock in", values, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockNotIn(List<Long> values) {
            addCriterion("frozen_stock not in", values, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockBetween(Long value1, Long value2) {
            addCriterion("frozen_stock between", value1, value2, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andFrozenStockNotBetween(Long value1, Long value2) {
            addCriterion("frozen_stock not between", value1, value2, "frozenStock");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeIsNull() {
            addCriterion("in_storage_time is null");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeIsNotNull() {
            addCriterion("in_storage_time is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeEqualTo(Long value) {
            addCriterion("in_storage_time =", value, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeNotEqualTo(Long value) {
            addCriterion("in_storage_time <>", value, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeGreaterThan(Long value) {
            addCriterion("in_storage_time >", value, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("in_storage_time >=", value, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeLessThan(Long value) {
            addCriterion("in_storage_time <", value, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeLessThanOrEqualTo(Long value) {
            addCriterion("in_storage_time <=", value, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeIn(List<Long> values) {
            addCriterion("in_storage_time in", values, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeNotIn(List<Long> values) {
            addCriterion("in_storage_time not in", values, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeBetween(Long value1, Long value2) {
            addCriterion("in_storage_time between", value1, value2, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andInStorageTimeNotBetween(Long value1, Long value2) {
            addCriterion("in_storage_time not between", value1, value2, "inStorageTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperateUserIsNull() {
            addCriterion("operate_user is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIsNotNull() {
            addCriterion("operate_user is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserEqualTo(Long value) {
            addCriterion("operate_user =", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserNotEqualTo(Long value) {
            addCriterion("operate_user <>", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserGreaterThan(Long value) {
            addCriterion("operate_user >", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("operate_user >=", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserLessThan(Long value) {
            addCriterion("operate_user <", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserLessThanOrEqualTo(Long value) {
            addCriterion("operate_user <=", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserIn(List<Long> values) {
            addCriterion("operate_user in", values, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserNotIn(List<Long> values) {
            addCriterion("operate_user not in", values, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserBetween(Long value1, Long value2) {
            addCriterion("operate_user between", value1, value2, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserNotBetween(Long value1, Long value2) {
            addCriterion("operate_user not between", value1, value2, "operateUser");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceIsNull() {
            addCriterion("point_real_price is null");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceIsNotNull() {
            addCriterion("point_real_price is not null");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceEqualTo(BigDecimal value) {
            addCriterion("point_real_price =", value, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("point_real_price <>", value, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceGreaterThan(BigDecimal value) {
            addCriterion("point_real_price >", value, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("point_real_price >=", value, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceLessThan(BigDecimal value) {
            addCriterion("point_real_price <", value, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("point_real_price <=", value, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceIn(List<BigDecimal> values) {
            addCriterion("point_real_price in", values, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("point_real_price not in", values, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_real_price between", value1, value2, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andPointRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_real_price not between", value1, value2, "pointRealPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeIsNull() {
            addCriterion("commodity_price_type is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeIsNotNull() {
            addCriterion("commodity_price_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeEqualTo(String value) {
            addCriterion("commodity_price_type =", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeNotEqualTo(String value) {
            addCriterion("commodity_price_type <>", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeGreaterThan(String value) {
            addCriterion("commodity_price_type >", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_price_type >=", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeLessThan(String value) {
            addCriterion("commodity_price_type <", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeLessThanOrEqualTo(String value) {
            addCriterion("commodity_price_type <=", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeLike(String value) {
            addCriterion("commodity_price_type like", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeNotLike(String value) {
            addCriterion("commodity_price_type not like", value, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeIn(List<String> values) {
            addCriterion("commodity_price_type in", values, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeNotIn(List<String> values) {
            addCriterion("commodity_price_type not in", values, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeBetween(String value1, String value2) {
            addCriterion("commodity_price_type between", value1, value2, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTypeNotBetween(String value1, String value2) {
            addCriterion("commodity_price_type not between", value1, value2, "commodityPriceType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIsNull() {
            addCriterion("active_type is null");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIsNotNull() {
            addCriterion("active_type is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTypeEqualTo(Short value) {
            addCriterion("active_type =", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotEqualTo(Short value) {
            addCriterion("active_type <>", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeGreaterThan(Short value) {
            addCriterion("active_type >", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("active_type >=", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeLessThan(Short value) {
            addCriterion("active_type <", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeLessThanOrEqualTo(Short value) {
            addCriterion("active_type <=", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIn(List<Short> values) {
            addCriterion("active_type in", values, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotIn(List<Short> values) {
            addCriterion("active_type not in", values, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeBetween(Short value1, Short value2) {
            addCriterion("active_type between", value1, value2, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotBetween(Short value1, Short value2) {
            addCriterion("active_type not between", value1, value2, "activeType");
            return (Criteria) this;
        }

        public Criteria andCallServiceIsNull() {
            addCriterion("call_service is null");
            return (Criteria) this;
        }

        public Criteria andCallServiceIsNotNull() {
            addCriterion("call_service is not null");
            return (Criteria) this;
        }

        public Criteria andCallServiceEqualTo(String value) {
            addCriterion("call_service =", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceNotEqualTo(String value) {
            addCriterion("call_service <>", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceGreaterThan(String value) {
            addCriterion("call_service >", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceGreaterThanOrEqualTo(String value) {
            addCriterion("call_service >=", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceLessThan(String value) {
            addCriterion("call_service <", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceLessThanOrEqualTo(String value) {
            addCriterion("call_service <=", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceLike(String value) {
            addCriterion("call_service like", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceNotLike(String value) {
            addCriterion("call_service not like", value, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceIn(List<String> values) {
            addCriterion("call_service in", values, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceNotIn(List<String> values) {
            addCriterion("call_service not in", values, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceBetween(String value1, String value2) {
            addCriterion("call_service between", value1, value2, "callService");
            return (Criteria) this;
        }

        public Criteria andCallServiceNotBetween(String value1, String value2) {
            addCriterion("call_service not between", value1, value2, "callService");
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