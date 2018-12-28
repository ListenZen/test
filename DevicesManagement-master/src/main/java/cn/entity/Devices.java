package cn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Devices {
    private Integer id;
    private String deviceName;
    private String deviceModel;
    private String usage;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date purchaseTime;
    private String assetCode;
    private Double devicePrice;
    private Integer period;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public Double getDevicePrice() {
        return devicePrice;
    }

    public void setDevicePrice(Double devicePrice) {
        this.devicePrice = devicePrice;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
}
