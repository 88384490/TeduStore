package cn.tedu.store.bean;

import java.io.Serializable;

public class Address implements Serializable {
    private static final long serialVersionUID = -333189379867875772L;

    private int id;
    private int uId;
    private String recvName;
    private String recvProvince;
    private String recvCity;
    private String recvArea;
    private String recvDistrict;
    private String recvAddress;
    private String recvPhone;
    private String recvTel;
    private String recvZip;
    private String recvTag;
    private int isDefault;
    private String createdUser;
    private String createdTime;
    private String modifiedUser;
    private String modifiedTime;

    public int getId() {
        return id;
    }

    public int getuId() {
        return uId;
    }

    public String getRecvName() {
        return recvName;
    }

    public String getRecvProvince() {
        return recvProvince;
    }

    public String getRecvCity() {
        return recvCity;
    }

    public String getRecvArea() {
        return recvArea;
    }

    public String getRecvDistrict() {
        return recvDistrict;
    }

    public String getRecvAddress() {
        return recvAddress;
    }

    public String getRecvPhone() {
        return recvPhone;
    }

    public String getRecvTel() {
        return recvTel;
    }

    public String getRecvZip() {
        return recvZip;
    }

    public String getRecvTag() {
        return recvTag;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public void setRecvName(String recvName) {
        this.recvName = recvName;
    }

    public void setRecvProvince(String recvProvince) {
        this.recvProvince = recvProvince;
    }

    public void setRecvCity(String recvCity) {
        this.recvCity = recvCity;
    }

    public void setRecvArea(String recvArea) {
        this.recvArea = recvArea;
    }

    public void setRecvDistrict(String recvDistrict) {
        this.recvDistrict = recvDistrict;
    }

    public void setRecvAddress(String recvAddress) {
        this.recvAddress = recvAddress;
    }

    public void setRecvPhone(String recvPhone) {
        this.recvPhone = recvPhone;
    }

    public void setRecvTel(String recvTel) {
        this.recvTel = recvTel;
    }

    public void setRecvZip(String recvZip) {
        this.recvZip = recvZip;
    }

    public void setRecvTag(String recvTag) {
        this.recvTag = recvTag;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", uId=" + uId + ", recvName="
                + recvName + ", recvProvince=" + recvProvince
                + ", recvCity=" + recvCity + ", recvArea=" + recvArea
                + ", recvDistrict=" + recvDistrict + ", recvAddress="
                + recvAddress + ", recvPhone=" + recvPhone
                + ", recvTel=" + recvTel + ", recvZip=" + recvZip
                + ", recvTag=" + recvTag + ", isDefault=" + isDefault
                + ", createdUser=" + createdUser + ", createdTime="
                + createdTime + ", modifiedUser=" + modifiedUser
                + ", modifiedTime=" + modifiedTime + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((createdTime == null) ? 0
                : createdTime.hashCode());
        result = prime * result + ((createdUser == null) ? 0
                : createdUser.hashCode());
        result = prime * result + id;
        result = prime * result + isDefault;
        result = prime * result + ((modifiedTime == null) ? 0
                : modifiedTime.hashCode());
        result = prime * result + ((modifiedUser == null) ? 0
                : modifiedUser.hashCode());
        result = prime * result + ((recvAddress == null) ? 0
                : recvAddress.hashCode());
        result = prime * result
                + ((recvArea == null) ? 0 : recvArea.hashCode());
        result = prime * result
                + ((recvCity == null) ? 0 : recvCity.hashCode());
        result = prime * result + ((recvDistrict == null) ? 0
                : recvDistrict.hashCode());
        result = prime * result
                + ((recvName == null) ? 0 : recvName.hashCode());
        result = prime * result
                + ((recvPhone == null) ? 0 : recvPhone.hashCode());
        result = prime * result + ((recvProvince == null) ? 0
                : recvProvince.hashCode());
        result = prime * result
                + ((recvTag == null) ? 0 : recvTag.hashCode());
        result = prime * result
                + ((recvTel == null) ? 0 : recvTel.hashCode());
        result = prime * result
                + ((recvZip == null) ? 0 : recvZip.hashCode());
        result = prime * result + uId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (createdTime == null) {
            if (other.createdTime != null)
                return false;
        } else if (!createdTime.equals(other.createdTime))
            return false;
        if (createdUser == null) {
            if (other.createdUser != null)
                return false;
        } else if (!createdUser.equals(other.createdUser))
            return false;
        if (id != other.id)
            return false;
        if (isDefault != other.isDefault)
            return false;
        if (modifiedTime == null) {
            if (other.modifiedTime != null)
                return false;
        } else if (!modifiedTime.equals(other.modifiedTime))
            return false;
        if (modifiedUser == null) {
            if (other.modifiedUser != null)
                return false;
        } else if (!modifiedUser.equals(other.modifiedUser))
            return false;
        if (recvAddress == null) {
            if (other.recvAddress != null)
                return false;
        } else if (!recvAddress.equals(other.recvAddress))
            return false;
        if (recvArea == null) {
            if (other.recvArea != null)
                return false;
        } else if (!recvArea.equals(other.recvArea))
            return false;
        if (recvCity == null) {
            if (other.recvCity != null)
                return false;
        } else if (!recvCity.equals(other.recvCity))
            return false;
        if (recvDistrict == null) {
            if (other.recvDistrict != null)
                return false;
        } else if (!recvDistrict.equals(other.recvDistrict))
            return false;
        if (recvName == null) {
            if (other.recvName != null)
                return false;
        } else if (!recvName.equals(other.recvName))
            return false;
        if (recvPhone == null) {
            if (other.recvPhone != null)
                return false;
        } else if (!recvPhone.equals(other.recvPhone))
            return false;
        if (recvProvince == null) {
            if (other.recvProvince != null)
                return false;
        } else if (!recvProvince.equals(other.recvProvince))
            return false;
        if (recvTag == null) {
            if (other.recvTag != null)
                return false;
        } else if (!recvTag.equals(other.recvTag))
            return false;
        if (recvTel == null) {
            if (other.recvTel != null)
                return false;
        } else if (!recvTel.equals(other.recvTel))
            return false;
        if (recvZip == null) {
            if (other.recvZip != null)
                return false;
        } else if (!recvZip.equals(other.recvZip))
            return false;
        if (uId != other.uId)
            return false;
        return true;
    }

}
