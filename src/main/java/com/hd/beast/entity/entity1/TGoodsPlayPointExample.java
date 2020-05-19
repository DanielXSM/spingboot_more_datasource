package com.hd.beast.entity.entity1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TGoodsPlayPointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGoodsPlayPointExample() {
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

        public Criteria andGoodsNoIsNull() {
            addCriterion("goods_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("goods_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(Long value) {
            addCriterion("goods_no =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(Long value) {
            addCriterion("goods_no <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(Long value) {
            addCriterion("goods_no >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_no >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(Long value) {
            addCriterion("goods_no <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(Long value) {
            addCriterion("goods_no <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<Long> values) {
            addCriterion("goods_no in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<Long> values) {
            addCriterion("goods_no not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(Long value1, Long value2) {
            addCriterion("goods_no between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(Long value1, Long value2) {
            addCriterion("goods_no not between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoIsNull() {
            addCriterion("goods_logo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoIsNotNull() {
            addCriterion("goods_logo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoEqualTo(String value) {
            addCriterion("goods_logo =", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoNotEqualTo(String value) {
            addCriterion("goods_logo <>", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoGreaterThan(String value) {
            addCriterion("goods_logo >", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_logo >=", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoLessThan(String value) {
            addCriterion("goods_logo <", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoLessThanOrEqualTo(String value) {
            addCriterion("goods_logo <=", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoLike(String value) {
            addCriterion("goods_logo like", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoNotLike(String value) {
            addCriterion("goods_logo not like", value, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoIn(List<String> values) {
            addCriterion("goods_logo in", values, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoNotIn(List<String> values) {
            addCriterion("goods_logo not in", values, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoBetween(String value1, String value2) {
            addCriterion("goods_logo between", value1, value2, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsLogoNotBetween(String value1, String value2) {
            addCriterion("goods_logo not between", value1, value2, "goodsLogo");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(Long value) {
            addCriterion("goods_type_id =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(Long value) {
            addCriterion("goods_type_id <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(Long value) {
            addCriterion("goods_type_id >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_type_id >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(Long value) {
            addCriterion("goods_type_id <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_type_id <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<Long> values) {
            addCriterion("goods_type_id in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<Long> values) {
            addCriterion("goods_type_id not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(Long value1, Long value2) {
            addCriterion("goods_type_id between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_type_id not between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIsNull() {
            addCriterion("goods_type_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIsNotNull() {
            addCriterion("goods_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameEqualTo(String value) {
            addCriterion("goods_type_name =", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotEqualTo(String value) {
            addCriterion("goods_type_name <>", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameGreaterThan(String value) {
            addCriterion("goods_type_name >", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type_name >=", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLessThan(String value) {
            addCriterion("goods_type_name <", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("goods_type_name <=", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLike(String value) {
            addCriterion("goods_type_name like", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotLike(String value) {
            addCriterion("goods_type_name not like", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIn(List<String> values) {
            addCriterion("goods_type_name in", values, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotIn(List<String> values) {
            addCriterion("goods_type_name not in", values, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameBetween(String value1, String value2) {
            addCriterion("goods_type_name between", value1, value2, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotBetween(String value1, String value2) {
            addCriterion("goods_type_name not between", value1, value2, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceIsNull() {
            addCriterion("goods_original_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceIsNotNull() {
            addCriterion("goods_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceEqualTo(String value) {
            addCriterion("goods_original_price =", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceNotEqualTo(String value) {
            addCriterion("goods_original_price <>", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceGreaterThan(String value) {
            addCriterion("goods_original_price >", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_original_price >=", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceLessThan(String value) {
            addCriterion("goods_original_price <", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceLessThanOrEqualTo(String value) {
            addCriterion("goods_original_price <=", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceLike(String value) {
            addCriterion("goods_original_price like", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceNotLike(String value) {
            addCriterion("goods_original_price not like", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceIn(List<String> values) {
            addCriterion("goods_original_price in", values, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceNotIn(List<String> values) {
            addCriterion("goods_original_price not in", values, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceBetween(String value1, String value2) {
            addCriterion("goods_original_price between", value1, value2, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceNotBetween(String value1, String value2) {
            addCriterion("goods_original_price not between", value1, value2, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceIsNull() {
            addCriterion("goods_sell_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceIsNotNull() {
            addCriterion("goods_sell_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceEqualTo(String value) {
            addCriterion("goods_sell_price =", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceNotEqualTo(String value) {
            addCriterion("goods_sell_price <>", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceGreaterThan(String value) {
            addCriterion("goods_sell_price >", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sell_price >=", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceLessThan(String value) {
            addCriterion("goods_sell_price <", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceLessThanOrEqualTo(String value) {
            addCriterion("goods_sell_price <=", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceLike(String value) {
            addCriterion("goods_sell_price like", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceNotLike(String value) {
            addCriterion("goods_sell_price not like", value, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceIn(List<String> values) {
            addCriterion("goods_sell_price in", values, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceNotIn(List<String> values) {
            addCriterion("goods_sell_price not in", values, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceBetween(String value1, String value2) {
            addCriterion("goods_sell_price between", value1, value2, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellPriceNotBetween(String value1, String value2) {
            addCriterion("goods_sell_price not between", value1, value2, "goodsSellPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionIsNull() {
            addCriterion("routing_direction is null");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionIsNotNull() {
            addCriterion("routing_direction is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionEqualTo(Short value) {
            addCriterion("routing_direction =", value, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionNotEqualTo(Short value) {
            addCriterion("routing_direction <>", value, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionGreaterThan(Short value) {
            addCriterion("routing_direction >", value, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionGreaterThanOrEqualTo(Short value) {
            addCriterion("routing_direction >=", value, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionLessThan(Short value) {
            addCriterion("routing_direction <", value, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionLessThanOrEqualTo(Short value) {
            addCriterion("routing_direction <=", value, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionIn(List<Short> values) {
            addCriterion("routing_direction in", values, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionNotIn(List<Short> values) {
            addCriterion("routing_direction not in", values, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionBetween(Short value1, Short value2) {
            addCriterion("routing_direction between", value1, value2, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andRoutingDirectionNotBetween(Short value1, Short value2) {
            addCriterion("routing_direction not between", value1, value2, "routingDirection");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdIsNull() {
            addCriterion("mapping_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdIsNotNull() {
            addCriterion("mapping_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdEqualTo(Long value) {
            addCriterion("mapping_goods_id =", value, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdNotEqualTo(Long value) {
            addCriterion("mapping_goods_id <>", value, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdGreaterThan(Long value) {
            addCriterion("mapping_goods_id >", value, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mapping_goods_id >=", value, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdLessThan(Long value) {
            addCriterion("mapping_goods_id <", value, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("mapping_goods_id <=", value, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdIn(List<Long> values) {
            addCriterion("mapping_goods_id in", values, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdNotIn(List<Long> values) {
            addCriterion("mapping_goods_id not in", values, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdBetween(Long value1, Long value2) {
            addCriterion("mapping_goods_id between", value1, value2, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andMappingGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("mapping_goods_id not between", value1, value2, "mappingGoodsId");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsIsNull() {
            addCriterion("is_specials is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsIsNotNull() {
            addCriterion("is_specials is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsEqualTo(Short value) {
            addCriterion("is_specials =", value, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsNotEqualTo(Short value) {
            addCriterion("is_specials <>", value, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsGreaterThan(Short value) {
            addCriterion("is_specials >", value, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsGreaterThanOrEqualTo(Short value) {
            addCriterion("is_specials >=", value, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsLessThan(Short value) {
            addCriterion("is_specials <", value, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsLessThanOrEqualTo(Short value) {
            addCriterion("is_specials <=", value, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsIn(List<Short> values) {
            addCriterion("is_specials in", values, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsNotIn(List<Short> values) {
            addCriterion("is_specials not in", values, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsBetween(Short value1, Short value2) {
            addCriterion("is_specials between", value1, value2, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andIsSpecialsNotBetween(Short value1, Short value2) {
            addCriterion("is_specials not between", value1, value2, "isSpecials");
            return (Criteria) this;
        }

        public Criteria andShowOnIsNull() {
            addCriterion("show_on is null");
            return (Criteria) this;
        }

        public Criteria andShowOnIsNotNull() {
            addCriterion("show_on is not null");
            return (Criteria) this;
        }

        public Criteria andShowOnEqualTo(Short value) {
            addCriterion("show_on =", value, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnNotEqualTo(Short value) {
            addCriterion("show_on <>", value, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnGreaterThan(Short value) {
            addCriterion("show_on >", value, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnGreaterThanOrEqualTo(Short value) {
            addCriterion("show_on >=", value, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnLessThan(Short value) {
            addCriterion("show_on <", value, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnLessThanOrEqualTo(Short value) {
            addCriterion("show_on <=", value, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnIn(List<Short> values) {
            addCriterion("show_on in", values, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnNotIn(List<Short> values) {
            addCriterion("show_on not in", values, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnBetween(Short value1, Short value2) {
            addCriterion("show_on between", value1, value2, "showOn");
            return (Criteria) this;
        }

        public Criteria andShowOnNotBetween(Short value1, Short value2) {
            addCriterion("show_on not between", value1, value2, "showOn");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeIsNull() {
            addCriterion("raise_start_time is null");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeIsNotNull() {
            addCriterion("raise_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeEqualTo(Long value) {
            addCriterion("raise_start_time =", value, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeNotEqualTo(Long value) {
            addCriterion("raise_start_time <>", value, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeGreaterThan(Long value) {
            addCriterion("raise_start_time >", value, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("raise_start_time >=", value, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeLessThan(Long value) {
            addCriterion("raise_start_time <", value, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("raise_start_time <=", value, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeIn(List<Long> values) {
            addCriterion("raise_start_time in", values, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeNotIn(List<Long> values) {
            addCriterion("raise_start_time not in", values, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeBetween(Long value1, Long value2) {
            addCriterion("raise_start_time between", value1, value2, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("raise_start_time not between", value1, value2, "raiseStartTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeIsNull() {
            addCriterion("raise_end_time is null");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeIsNotNull() {
            addCriterion("raise_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeEqualTo(Long value) {
            addCriterion("raise_end_time =", value, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeNotEqualTo(Long value) {
            addCriterion("raise_end_time <>", value, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeGreaterThan(Long value) {
            addCriterion("raise_end_time >", value, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("raise_end_time >=", value, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeLessThan(Long value) {
            addCriterion("raise_end_time <", value, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("raise_end_time <=", value, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeIn(List<Long> values) {
            addCriterion("raise_end_time in", values, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeNotIn(List<Long> values) {
            addCriterion("raise_end_time not in", values, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeBetween(Long value1, Long value2) {
            addCriterion("raise_end_time between", value1, value2, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andRaiseEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("raise_end_time not between", value1, value2, "raiseEndTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeIsNull() {
            addCriterion("lottery_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeIsNotNull() {
            addCriterion("lottery_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeEqualTo(Long value) {
            addCriterion("lottery_start_time =", value, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeNotEqualTo(Long value) {
            addCriterion("lottery_start_time <>", value, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeGreaterThan(Long value) {
            addCriterion("lottery_start_time >", value, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("lottery_start_time >=", value, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeLessThan(Long value) {
            addCriterion("lottery_start_time <", value, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("lottery_start_time <=", value, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeIn(List<Long> values) {
            addCriterion("lottery_start_time in", values, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeNotIn(List<Long> values) {
            addCriterion("lottery_start_time not in", values, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeBetween(Long value1, Long value2) {
            addCriterion("lottery_start_time between", value1, value2, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andLotteryStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("lottery_start_time not between", value1, value2, "lotteryStartTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNull() {
            addCriterion("total_point is null");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNotNull() {
            addCriterion("total_point is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPointEqualTo(BigDecimal value) {
            addCriterion("total_point =", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualTo(BigDecimal value) {
            addCriterion("total_point <>", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThan(BigDecimal value) {
            addCriterion("total_point >", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_point >=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThan(BigDecimal value) {
            addCriterion("total_point <", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_point <=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointIn(List<BigDecimal> values) {
            addCriterion("total_point in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotIn(List<BigDecimal> values) {
            addCriterion("total_point not in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_point between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_point not between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNull() {
            addCriterion("point_id is null");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("point_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointIdEqualTo(Long value) {
            addCriterion("point_id =", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotEqualTo(Long value) {
            addCriterion("point_id <>", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThan(Long value) {
            addCriterion("point_id >", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(Long value) {
            addCriterion("point_id >=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThan(Long value) {
            addCriterion("point_id <", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThanOrEqualTo(Long value) {
            addCriterion("point_id <=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdIn(List<Long> values) {
            addCriterion("point_id in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotIn(List<Long> values) {
            addCriterion("point_id not in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdBetween(Long value1, Long value2) {
            addCriterion("point_id between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotBetween(Long value1, Long value2) {
            addCriterion("point_id not between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointNameIsNull() {
            addCriterion("point_name is null");
            return (Criteria) this;
        }

        public Criteria andPointNameIsNotNull() {
            addCriterion("point_name is not null");
            return (Criteria) this;
        }

        public Criteria andPointNameEqualTo(String value) {
            addCriterion("point_name =", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotEqualTo(String value) {
            addCriterion("point_name <>", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameGreaterThan(String value) {
            addCriterion("point_name >", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("point_name >=", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLessThan(String value) {
            addCriterion("point_name <", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLessThanOrEqualTo(String value) {
            addCriterion("point_name <=", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLike(String value) {
            addCriterion("point_name like", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotLike(String value) {
            addCriterion("point_name not like", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameIn(List<String> values) {
            addCriterion("point_name in", values, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotIn(List<String> values) {
            addCriterion("point_name not in", values, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameBetween(String value1, String value2) {
            addCriterion("point_name between", value1, value2, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotBetween(String value1, String value2) {
            addCriterion("point_name not between", value1, value2, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointValueIsNull() {
            addCriterion("point_value is null");
            return (Criteria) this;
        }

        public Criteria andPointValueIsNotNull() {
            addCriterion("point_value is not null");
            return (Criteria) this;
        }

        public Criteria andPointValueEqualTo(BigDecimal value) {
            addCriterion("point_value =", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotEqualTo(BigDecimal value) {
            addCriterion("point_value <>", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueGreaterThan(BigDecimal value) {
            addCriterion("point_value >", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("point_value >=", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueLessThan(BigDecimal value) {
            addCriterion("point_value <", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("point_value <=", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueIn(List<BigDecimal> values) {
            addCriterion("point_value in", values, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotIn(List<BigDecimal> values) {
            addCriterion("point_value not in", values, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_value between", value1, value2, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_value not between", value1, value2, "pointValue");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdIsNull() {
            addCriterion("spk_nature_id is null");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdIsNotNull() {
            addCriterion("spk_nature_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdEqualTo(Integer value) {
            addCriterion("spk_nature_id =", value, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdNotEqualTo(Integer value) {
            addCriterion("spk_nature_id <>", value, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdGreaterThan(Integer value) {
            addCriterion("spk_nature_id >", value, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spk_nature_id >=", value, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdLessThan(Integer value) {
            addCriterion("spk_nature_id <", value, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdLessThanOrEqualTo(Integer value) {
            addCriterion("spk_nature_id <=", value, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdIn(List<Integer> values) {
            addCriterion("spk_nature_id in", values, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdNotIn(List<Integer> values) {
            addCriterion("spk_nature_id not in", values, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdBetween(Integer value1, Integer value2) {
            addCriterion("spk_nature_id between", value1, value2, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSpkNatureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spk_nature_id not between", value1, value2, "spkNatureId");
            return (Criteria) this;
        }

        public Criteria andSellAmountIsNull() {
            addCriterion("sell_amount is null");
            return (Criteria) this;
        }

        public Criteria andSellAmountIsNotNull() {
            addCriterion("sell_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSellAmountEqualTo(BigDecimal value) {
            addCriterion("sell_amount =", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountNotEqualTo(BigDecimal value) {
            addCriterion("sell_amount <>", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountGreaterThan(BigDecimal value) {
            addCriterion("sell_amount >", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_amount >=", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountLessThan(BigDecimal value) {
            addCriterion("sell_amount <", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_amount <=", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountIn(List<BigDecimal> values) {
            addCriterion("sell_amount in", values, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountNotIn(List<BigDecimal> values) {
            addCriterion("sell_amount not in", values, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_amount between", value1, value2, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_amount not between", value1, value2, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andBuyMaxIsNull() {
            addCriterion("buy_max is null");
            return (Criteria) this;
        }

        public Criteria andBuyMaxIsNotNull() {
            addCriterion("buy_max is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMaxEqualTo(BigDecimal value) {
            addCriterion("buy_max =", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNotEqualTo(BigDecimal value) {
            addCriterion("buy_max <>", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxGreaterThan(BigDecimal value) {
            addCriterion("buy_max >", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_max >=", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxLessThan(BigDecimal value) {
            addCriterion("buy_max <", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_max <=", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxIn(List<BigDecimal> values) {
            addCriterion("buy_max in", values, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNotIn(List<BigDecimal> values) {
            addCriterion("buy_max not in", values, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_max between", value1, value2, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_max not between", value1, value2, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMinIsNull() {
            addCriterion("buy_min is null");
            return (Criteria) this;
        }

        public Criteria andBuyMinIsNotNull() {
            addCriterion("buy_min is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMinEqualTo(BigDecimal value) {
            addCriterion("buy_min =", value, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinNotEqualTo(BigDecimal value) {
            addCriterion("buy_min <>", value, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinGreaterThan(BigDecimal value) {
            addCriterion("buy_min >", value, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_min >=", value, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinLessThan(BigDecimal value) {
            addCriterion("buy_min <", value, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_min <=", value, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinIn(List<BigDecimal> values) {
            addCriterion("buy_min in", values, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinNotIn(List<BigDecimal> values) {
            addCriterion("buy_min not in", values, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_min between", value1, value2, "buyMin");
            return (Criteria) this;
        }

        public Criteria andBuyMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_min not between", value1, value2, "buyMin");
            return (Criteria) this;
        }

        public Criteria andPointCvIsNull() {
            addCriterion("point_cv is null");
            return (Criteria) this;
        }

        public Criteria andPointCvIsNotNull() {
            addCriterion("point_cv is not null");
            return (Criteria) this;
        }

        public Criteria andPointCvEqualTo(String value) {
            addCriterion("point_cv =", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvNotEqualTo(String value) {
            addCriterion("point_cv <>", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvGreaterThan(String value) {
            addCriterion("point_cv >", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvGreaterThanOrEqualTo(String value) {
            addCriterion("point_cv >=", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvLessThan(String value) {
            addCriterion("point_cv <", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvLessThanOrEqualTo(String value) {
            addCriterion("point_cv <=", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvLike(String value) {
            addCriterion("point_cv like", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvNotLike(String value) {
            addCriterion("point_cv not like", value, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvIn(List<String> values) {
            addCriterion("point_cv in", values, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvNotIn(List<String> values) {
            addCriterion("point_cv not in", values, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvBetween(String value1, String value2) {
            addCriterion("point_cv between", value1, value2, "pointCv");
            return (Criteria) this;
        }

        public Criteria andPointCvNotBetween(String value1, String value2) {
            addCriterion("point_cv not between", value1, value2, "pointCv");
            return (Criteria) this;
        }

        public Criteria andVirtualIsNull() {
            addCriterion("virtual is null");
            return (Criteria) this;
        }

        public Criteria andVirtualIsNotNull() {
            addCriterion("virtual is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualEqualTo(Short value) {
            addCriterion("virtual =", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotEqualTo(Short value) {
            addCriterion("virtual <>", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualGreaterThan(Short value) {
            addCriterion("virtual >", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualGreaterThanOrEqualTo(Short value) {
            addCriterion("virtual >=", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualLessThan(Short value) {
            addCriterion("virtual <", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualLessThanOrEqualTo(Short value) {
            addCriterion("virtual <=", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualIn(List<Short> values) {
            addCriterion("virtual in", values, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotIn(List<Short> values) {
            addCriterion("virtual not in", values, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualBetween(Short value1, Short value2) {
            addCriterion("virtual between", value1, value2, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotBetween(Short value1, Short value2) {
            addCriterion("virtual not between", value1, value2, "virtual");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeIsNull() {
            addCriterion("sell_amount_fake is null");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeIsNotNull() {
            addCriterion("sell_amount_fake is not null");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeEqualTo(BigDecimal value) {
            addCriterion("sell_amount_fake =", value, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeNotEqualTo(BigDecimal value) {
            addCriterion("sell_amount_fake <>", value, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeGreaterThan(BigDecimal value) {
            addCriterion("sell_amount_fake >", value, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_amount_fake >=", value, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeLessThan(BigDecimal value) {
            addCriterion("sell_amount_fake <", value, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_amount_fake <=", value, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeIn(List<BigDecimal> values) {
            addCriterion("sell_amount_fake in", values, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeNotIn(List<BigDecimal> values) {
            addCriterion("sell_amount_fake not in", values, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_amount_fake between", value1, value2, "sellAmountFake");
            return (Criteria) this;
        }

        public Criteria andSellAmountFakeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_amount_fake not between", value1, value2, "sellAmountFake");
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