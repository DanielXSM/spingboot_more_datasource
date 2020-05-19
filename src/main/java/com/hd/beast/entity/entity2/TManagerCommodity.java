package com.hd.beast.entity.entity2;

import java.io.Serializable;
import java.math.BigDecimal;

public class TManagerCommodity implements Serializable {
    /**
     * 商品编号
     *
     * @mbg.generated
     */
    private Long commodityId;

    /**
     * 供应商商品ID，对应的商品库id
     *
     * @mbg.generated
     */
    private Long supplierComId;

    /**
     * 实际支付的价格
     *
     * @mbg.generated
     */
    private BigDecimal realPrice;

    /**
     * 商品名称
     *
     * @mbg.generated
     */
    private String commodityName;

    /**
     * 商品相关描述/备注
     *
     * @mbg.generated
     */
    private String commodityDesc;

    /**
     * 商品logo
     *
     * @mbg.generated
     */
    private String commodityLogo;

    /**
     * 市场参考价格
     *
     * @mbg.generated
     */
    private String referencePrice;

    /**
     * 价值描述
     *
     * @mbg.generated
     */
    private String priceDesc;

    /**
     * 1 短期。2长期
     *
     * @mbg.generated
     */
    private Short validityType;

    /**
     * 有效期开始时间
     *
     * @mbg.generated
     */
    private Long startTime;

    /**
     * 有效期结束时间
     *
     * @mbg.generated
     */
    private Long endTime;

    /**
     * 商品状态1有效，2无效
     *
     * @mbg.generated
     */
    private Short usingFlag;

    /**
     * 排序
     *
     * @mbg.generated
     */
    private Short sortFlag;

    /**
     * 商品类型，对应t_commodity_type中childId
     *
     * @mbg.generated
     */
    private Long commodityType;

    /**
     * 供应商ID,101代表的是金中石
     *
     * @mbg.generated
     */
    private Long supplierId;

    /**
     * 单笔最大交易数量
     *
     * @mbg.generated
     */
    private Short maxDealNum;

    /**
     * 单笔最小交易数量
     *
     * @mbg.generated
     */
    private Short minDealNum;

    /**
     * 交易单位
     *
     * @mbg.generated
     */
    private Short dealUnit;

    /**
     * 允许购买的数量-1代表不限制数量
     *
     * @mbg.generated
     */
    private Long totalBuyLimit;

    /**
     * 允许的待支付的数量
     *
     * @mbg.generated
     */
    private Integer toPayNum;

    /**
     * 运费的价值
     *
     * @mbg.generated
     */
    private BigDecimal carriage;

    /**
     * 商品剩余库存（包含支付中）
     *
     * @mbg.generated
     */
    private Long stock;

    /**
     * 支付中库存
     *
     * @mbg.generated
     */
    private Long frozenStock;

    /**
     * 商品入库的时间
     *
     * @mbg.generated
     */
    private Long inStorageTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Long updateTime;

    /**
     * 操作人
     *
     * @mbg.generated
     */
    private Long operateUser;

    /**
     * 使用积分后的支付价格
     *
     * @mbg.generated
     */
    private BigDecimal pointRealPrice;

    /**
     * 定价方式：1：固定价格和积分随意组合，2：只支持固定价格，3：固定价格+固定积分数量，4：固定积分数量
     *
     * @mbg.generated
     */
    private String commodityPriceType;

    /**
     * 参加的活动的类型
     *
     * @mbg.generated
     */
    private Short activeType;

    /**
     * 客服电话
     *
     * @mbg.generated
     */
    private String callService;

    private static final long serialVersionUID = 1L;

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Long getSupplierComId() {
        return supplierComId;
    }

    public void setSupplierComId(Long supplierComId) {
        this.supplierComId = supplierComId;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    public String getCommodityLogo() {
        return commodityLogo;
    }

    public void setCommodityLogo(String commodityLogo) {
        this.commodityLogo = commodityLogo;
    }

    public String getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice;
    }

    public String getPriceDesc() {
        return priceDesc;
    }

    public void setPriceDesc(String priceDesc) {
        this.priceDesc = priceDesc;
    }

    public Short getValidityType() {
        return validityType;
    }

    public void setValidityType(Short validityType) {
        this.validityType = validityType;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Short getUsingFlag() {
        return usingFlag;
    }

    public void setUsingFlag(Short usingFlag) {
        this.usingFlag = usingFlag;
    }

    public Short getSortFlag() {
        return sortFlag;
    }

    public void setSortFlag(Short sortFlag) {
        this.sortFlag = sortFlag;
    }

    public Long getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(Long commodityType) {
        this.commodityType = commodityType;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Short getMaxDealNum() {
        return maxDealNum;
    }

    public void setMaxDealNum(Short maxDealNum) {
        this.maxDealNum = maxDealNum;
    }

    public Short getMinDealNum() {
        return minDealNum;
    }

    public void setMinDealNum(Short minDealNum) {
        this.minDealNum = minDealNum;
    }

    public Short getDealUnit() {
        return dealUnit;
    }

    public void setDealUnit(Short dealUnit) {
        this.dealUnit = dealUnit;
    }

    public Long getTotalBuyLimit() {
        return totalBuyLimit;
    }

    public void setTotalBuyLimit(Long totalBuyLimit) {
        this.totalBuyLimit = totalBuyLimit;
    }

    public Integer getToPayNum() {
        return toPayNum;
    }

    public void setToPayNum(Integer toPayNum) {
        this.toPayNum = toPayNum;
    }

    public BigDecimal getCarriage() {
        return carriage;
    }

    public void setCarriage(BigDecimal carriage) {
        this.carriage = carriage;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getFrozenStock() {
        return frozenStock;
    }

    public void setFrozenStock(Long frozenStock) {
        this.frozenStock = frozenStock;
    }

    public Long getInStorageTime() {
        return inStorageTime;
    }

    public void setInStorageTime(Long inStorageTime) {
        this.inStorageTime = inStorageTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(Long operateUser) {
        this.operateUser = operateUser;
    }

    public BigDecimal getPointRealPrice() {
        return pointRealPrice;
    }

    public void setPointRealPrice(BigDecimal pointRealPrice) {
        this.pointRealPrice = pointRealPrice;
    }

    public String getCommodityPriceType() {
        return commodityPriceType;
    }

    public void setCommodityPriceType(String commodityPriceType) {
        this.commodityPriceType = commodityPriceType;
    }

    public Short getActiveType() {
        return activeType;
    }

    public void setActiveType(Short activeType) {
        this.activeType = activeType;
    }

    public String getCallService() {
        return callService;
    }

    public void setCallService(String callService) {
        this.callService = callService;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commodityId=").append(commodityId);
        sb.append(", supplierComId=").append(supplierComId);
        sb.append(", realPrice=").append(realPrice);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", commodityDesc=").append(commodityDesc);
        sb.append(", commodityLogo=").append(commodityLogo);
        sb.append(", referencePrice=").append(referencePrice);
        sb.append(", priceDesc=").append(priceDesc);
        sb.append(", validityType=").append(validityType);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", usingFlag=").append(usingFlag);
        sb.append(", sortFlag=").append(sortFlag);
        sb.append(", commodityType=").append(commodityType);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", maxDealNum=").append(maxDealNum);
        sb.append(", minDealNum=").append(minDealNum);
        sb.append(", dealUnit=").append(dealUnit);
        sb.append(", totalBuyLimit=").append(totalBuyLimit);
        sb.append(", toPayNum=").append(toPayNum);
        sb.append(", carriage=").append(carriage);
        sb.append(", stock=").append(stock);
        sb.append(", frozenStock=").append(frozenStock);
        sb.append(", inStorageTime=").append(inStorageTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", operateUser=").append(operateUser);
        sb.append(", pointRealPrice=").append(pointRealPrice);
        sb.append(", commodityPriceType=").append(commodityPriceType);
        sb.append(", activeType=").append(activeType);
        sb.append(", callService=").append(callService);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}