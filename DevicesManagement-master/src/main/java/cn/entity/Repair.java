package cn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Repair {
    private Integer id;
    private String repairRecord;
    @JsonFormat(pattern = "yyyy年MM月")
    private Date repairTime;
    private Integer deviceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepairRecord() {
        return repairRecord;
    }

    public void setRepairRecord(String repairRecord) {
        this.repairRecord = repairRecord;
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}
