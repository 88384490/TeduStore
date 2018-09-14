package cn.tedu.store.bean;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private static final long serialVersionUID = 5981167434415718827L;

    private String id;
    private int categoryId;
    private String itemType;
    private String title;
    private String sellPoint;
    private int price;
    private int num;
    private String barcode;
    private String image;
    private int status;
    private int priority;
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;

        Goods goods = (Goods) o;

        if (categoryId != goods.categoryId) return false;
        if (price != goods.price) return false;
        if (num != goods.num) return false;
        if (status != goods.status) return false;
        if (priority != goods.priority) return false;
        if (id != null ? !id.equals(goods.id) : goods.id != null) return false;
        if (itemType != null ? !itemType.equals(goods.itemType) : goods.itemType != null)
            return false;
        if (title != null ? !title.equals(goods.title) : goods.title != null) return false;
        if (sellPoint != null ? !sellPoint.equals(goods.sellPoint) : goods.sellPoint != null)
            return false;
        if (barcode != null ? !barcode.equals(goods.barcode) : goods.barcode != null) return false;
        if (image != null ? !image.equals(goods.image) : goods.image != null) return false;
        if (createdUser != null ? !createdUser.equals(goods.createdUser) : goods.createdUser != null)
            return false;
        if (createdTime != null ? !createdTime.equals(goods.createdTime) : goods.createdTime != null)
            return false;
        if (modifiedUser != null ? !modifiedUser.equals(goods.modifiedUser) : goods.modifiedUser != null)
            return false;
        return modifiedTime != null ? modifiedTime.equals(goods.modifiedTime) : goods.modifiedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + categoryId;
        result = 31 * result + (itemType != null ? itemType.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (sellPoint != null ? sellPoint.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + num;
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + priority;
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (modifiedUser != null ? modifiedUser.hashCode() : 0);
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", categoryId=" + categoryId +
                ", itemType='" + itemType + '\'' +
                ", title='" + title + '\'' +
                ", sellPoint='" + sellPoint + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", barcode='" + barcode + '\'' +
                ", image='" + image + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
