package cn.tedu.store.bean;

import java.io.Serializable;

public class GoodsCategory implements Serializable {
    private static final long serialVersionUID = -262132305094790135L;

    private int id;
    private int parentId;
    private String name;
    private int status;
    private int sortOrder;
    private int isParent;
    private String createdUser;
    private String createdTime;
    private String modifiedUser;
    private String modifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getIsParent() {
        return isParent;
    }

    public void setIsParent(int isParent) {
        this.isParent = isParent;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoodsCategory)) return false;

        GoodsCategory that = (GoodsCategory) o;

        if (id != that.id) return false;
        if (parentId != that.parentId) return false;
        if (status != that.status) return false;
        if (sortOrder != that.sortOrder) return false;
        if (isParent != that.isParent) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null)
            return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null)
            return false;
        if (modifiedUser != null ? !modifiedUser.equals(that.modifiedUser) : that.modifiedUser != null)
            return false;
        return modifiedTime != null ? modifiedTime.equals(that.modifiedTime) : that.modifiedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + parentId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + sortOrder;
        result = 31 * result + isParent;
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (modifiedUser != null ? modifiedUser.hashCode() : 0);
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GoodsCategory{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", sortOrder=" + sortOrder +
                ", isParent=" + isParent +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                '}';
    }
}
