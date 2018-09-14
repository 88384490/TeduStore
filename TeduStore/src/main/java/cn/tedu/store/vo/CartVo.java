package cn.tedu.store.vo;

import java.util.Date;

public class CartVo {
    private int id;
    private int uId;
    private String goodsId;
    private int num;
    private String image;
    private String title;
    private int price;
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
        if (!(o instanceof CartVo)) return false;

        CartVo cartVo = (CartVo) o;

        if (id != cartVo.id) return false;
        if (uId != cartVo.uId) return false;
        if (num != cartVo.num) return false;
        if (price != cartVo.price) return false;
        if (goodsId != null ? !goodsId.equals(cartVo.goodsId) : cartVo.goodsId != null)
            return false;
        if (image != null ? !image.equals(cartVo.image) : cartVo.image != null) return false;
        if (title != null ? !title.equals(cartVo.title) : cartVo.title != null) return false;
        if (createdUser != null ? !createdUser.equals(cartVo.createdUser) : cartVo.createdUser != null)
            return false;
        if (createdTime != null ? !createdTime.equals(cartVo.createdTime) : cartVo.createdTime != null)
            return false;
        if (modifiedUser != null ? !modifiedUser.equals(cartVo.modifiedUser) : cartVo.modifiedUser != null)
            return false;
        return modifiedTime != null ? modifiedTime.equals(cartVo.modifiedTime) : cartVo.modifiedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + uId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + num;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (modifiedUser != null ? modifiedUser.hashCode() : 0);
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CartVo{" +
                "id=" + id +
                ", uId=" + uId +
                ", goodsId='" + goodsId + '\'' +
                ", num=" + num +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
