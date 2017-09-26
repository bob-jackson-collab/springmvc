package com.ys.mvc.pojo;

public class DriverRecord {
    private Long id;

    private Long bdId;

    private String driverIdNumber;

    private String ncIdNumber;

    private String driverName;

    private String mobile;

    private String email;

    private Boolean manual;

    private Boolean status;

    private Long cityId;

    private Boolean recordType;

    private String recordReasons;

    private Integer cT;

    private Integer uT;

    private Long updateUser;

    private String updateUserName;

    private Boolean operateStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBdId() {
        return bdId;
    }

    public void setBdId(Long bdId) {
        this.bdId = bdId;
    }

    public String getDriverIdNumber() {
        return driverIdNumber;
    }

    public void setDriverIdNumber(String driverIdNumber) {
        this.driverIdNumber = driverIdNumber == null ? null : driverIdNumber.trim();
    }

    public String getNcIdNumber() {
        return ncIdNumber;
    }

    public void setNcIdNumber(String ncIdNumber) {
        this.ncIdNumber = ncIdNumber == null ? null : ncIdNumber.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Boolean getRecordType() {
        return recordType;
    }

    public void setRecordType(Boolean recordType) {
        this.recordType = recordType;
    }

    public String getRecordReasons() {
        return recordReasons;
    }

    public void setRecordReasons(String recordReasons) {
        this.recordReasons = recordReasons == null ? null : recordReasons.trim();
    }

    public Integer getcT() {
        return cT;
    }

    public void setcT(Integer cT) {
        this.cT = cT;
    }

    public Integer getuT() {
        return uT;
    }

    public void setuT(Integer uT) {
        this.uT = uT;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    public Boolean getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(Boolean operateStatus) {
        this.operateStatus = operateStatus;
    }
}