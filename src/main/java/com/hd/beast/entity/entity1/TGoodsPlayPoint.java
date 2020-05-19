package com.hd.beast.entity.entity1;

import java.io.Serializable;
import java.math.BigDecimal;

public class TGoodsPlayPoint implements Serializable {
    private Long goodsNo;

    /**
     * 商品名称
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     * 商品图片
     *
     * @mbg.generated
     */
    private String goodsLogo;

    /**
     * 商品所属类型id
     *
     * @mbg.generated
     */
    private Long goodsTypeId;

    /**
     * 商品所属类型名称
     *
     * @mbg.generated
     */
    private String goodsTypeName;

    /**
     * 商品原价
     *
     * @mbg.generated
     */
    private String goodsOriginalPrice;

    /**
     * 商品售价
     *
     * @mbg.generated
     */
    private String goodsSellPrice;

    /**
     * 路由指向（指向哪一项目）
     *
     * @mbg.generated
     */
    private Short routingDirection;

    /**
     * 对应到具体项目中商品id
     *
     * @mbg.generated
     */
    private Long mappingGoodsId;

    /**
     * 是否为新手商品（1-是；0-不是）
     *
     * @mbg.generated
     */
    private Short isSpecials;

    /**
     * 是否展示（1-展示；0-隐藏）
     *
     * @mbg.generated
     */
    private Short showOn;

    /**
     * 商品排序
     *
     * @mbg.generated
     */
    private Short sortFlag;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Long createTime;

    /**
     * 募集开始时间
     *
     * @mbg.generated
     */
    private Long raiseStartTime;

    /**
     * 募集结束时间
     *
     * @mbg.generated
     */
    private Long raiseEndTime;

    /**
     * 开奖时间
     *
     * @mbg.generated
     */
    private Long lotteryStartTime;

    /**
     * 商品状态 1：未开始募集。2：开始募集 3:募集成功。4：募集失败。5：已开奖
     *
     * @mbg.generated
     */
    private Short status;

    /**
     * 总的积分数量
     *
     * @mbg.generated
     */
    private BigDecimal totalPoint;

    /**
     * 积分的id
     *
     * @mbg.generated
     */
    private Long pointId;

    /**
     * 积分的名称
     *
     * @mbg.generated
     */
    private String pointName;

    /**
     * 积分的数量
     *
     * @mbg.generated
     */
    private BigDecimal pointValue;

    /**
     * 期号
     *
     * @mbg.generated
     */
    private String issue;

    /**
     * 本质id
     *
     * @mbg.generated
     */
    private Integer spkNatureId;

    /**
     * 售卖数量
     *
     * @mbg.generated
     */
    private BigDecimal sellAmount;

    /**
     * 总的数量
     *
     * @mbg.generated
     */
    private BigDecimal totalAmount;

    /**
     * 最大购买数量
     *
     * @mbg.generated
     */
    private BigDecimal buyMax;

    /**
     * 最小购买数量
     *
     * @mbg.generated
     */
    private BigDecimal buyMin;

    /**
     * 积分cv
     *
     * @mbg.generated
     */
    private String pointCv;

    /**
     * 2:虚拟  1：实体
     *
     * @mbg.generated
     */
    private Short virtual;

    /**
     * 假的售卖数量
     *
     * @mbg.generated
     */
    private BigDecimal sellAmountFake;

    private static final long serialVersionUID = 1L;

    public Long getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(Long goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsLogo() {
        return goodsLogo;
    }

    public void setGoodsLogo(String goodsLogo) {
        this.goodsLogo = goodsLogo;
    }

    public Long getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Long goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getGoodsOriginalPrice() {
        return goodsOriginalPrice;
    }

    public void setGoodsOriginalPrice(String goodsOriginalPrice) {
        this.goodsOriginalPrice = goodsOriginalPrice;
    }

    public String getGoodsSellPrice() {
        return goodsSellPrice;
    }

    public void setGoodsSellPrice(String goodsSellPrice) {
        this.goodsSellPrice = goodsSellPrice;
    }

    public Short getRoutingDirection() {
        return routingDirection;
    }

    public void setRoutingDirection(Short routingDirection) {
        this.routingDirection = routingDirection;
    }

    public Long getMappingGoodsId() {
        return mappingGoodsId;
    }

    public void setMappingGoodsId(Long mappingGoodsId) {
        this.mappingGoodsId = mappingGoodsId;
    }

    public Short getIsSpecials() {
        return isSpecials;
    }

    public void setIsSpecials(Short isSpecials) {
        this.isSpecials = isSpecials;
    }

    public Short getShowOn() {
        return showOn;
    }

    public void setShowOn(Short showOn) {
        this.showOn = showOn;
    }

    public Short getSortFlag() {
        return sortFlag;
    }

    public void setSortFlag(Short sortFlag) {
        this.sortFlag = sortFlag;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getRaiseStartTime() {
        return raiseStartTime;
    }

    public void setRaiseStartTime(Long raiseStartTime) {
        this.raiseStartTime = raiseStartTime;
    }

    public Long getRaiseEndTime() {
        return raiseEndTime;
    }

    public void setRaiseEndTime(Long raiseEndTime) {
        this.raiseEndTime = raiseEndTime;
    }

    public Long getLotteryStartTime() {
        return lotteryStartTime;
    }

    public void setLotteryStartTime(Long lotteryStartTime) {
        this.lotteryStartTime = lotteryStartTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public BigDecimal getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(BigDecimal totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Long getPointId() {
        return pointId;
    }

    public void setPointId(Long pointId) {
        this.pointId = pointId;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public BigDecimal getPointValue() {
        return pointValue;
    }

    public void setPointValue(BigDecimal pointValue) {
        this.pointValue = pointValue;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Integer getSpkNatureId() {
        return spkNatureId;
    }

    public void setSpkNatureId(Integer spkNatureId) {
        this.spkNatureId = spkNatureId;
    }

    public BigDecimal getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(BigDecimal sellAmount) {
        this.sellAmount = sellAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getBuyMax() {
        return buyMax;
    }

    public void setBuyMax(BigDecimal buyMax) {
        this.buyMax = buyMax;
    }

    public BigDecimal getBuyMin() {
        return buyMin;
    }

    public void setBuyMin(BigDecimal buyMin) {
        this.buyMin = buyMin;
    }

    public String getPointCv() {
        return pointCv;
    }

    public void setPointCv(String pointCv) {
        this.pointCv = pointCv;
    }

    public Short getVirtual() {
        return virtual;
    }

    public void setVirtual(Short virtual) {
        this.virtual = virtual;
    }

    public BigDecimal getSellAmountFake() {
        return sellAmountFake;
    }

    public void setSellAmountFake(BigDecimal sellAmountFake) {
        this.sellAmountFake = sellAmountFake;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsLogo=").append(goodsLogo);
        sb.append(", goodsTypeId=").append(goodsTypeId);
        sb.append(", goodsTypeName=").append(goodsTypeName);
        sb.append(", goodsOriginalPrice=").append(goodsOriginalPrice);
        sb.append(", goodsSellPrice=").append(goodsSellPrice);
        sb.append(", routingDirection=").append(routingDirection);
        sb.append(", mappingGoodsId=").append(mappingGoodsId);
        sb.append(", isSpecials=").append(isSpecials);
        sb.append(", showOn=").append(showOn);
        sb.append(", sortFlag=").append(sortFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", raiseStartTime=").append(raiseStartTime);
        sb.append(", raiseEndTime=").append(raiseEndTime);
        sb.append(", lotteryStartTime=").append(lotteryStartTime);
        sb.append(", status=").append(status);
        sb.append(", totalPoint=").append(totalPoint);
        sb.append(", pointId=").append(pointId);
        sb.append(", pointName=").append(pointName);
        sb.append(", pointValue=").append(pointValue);
        sb.append(", issue=").append(issue);
        sb.append(", spkNatureId=").append(spkNatureId);
        sb.append(", sellAmount=").append(sellAmount);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", buyMax=").append(buyMax);
        sb.append(", buyMin=").append(buyMin);
        sb.append(", pointCv=").append(pointCv);
        sb.append(", virtual=").append(virtual);
        sb.append(", sellAmountFake=").append(sellAmountFake);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}