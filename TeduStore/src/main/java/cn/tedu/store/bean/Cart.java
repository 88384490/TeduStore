package cn.tedu.store.bean;

import java.io.Serializable;
import java.util.Date;

public class Cart implements Serializable{
    private static final long serialVersionUID = 537289823014130034L;

    private int id;
    private int uId;
    private String goodsId;
    private int num;
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
        if (!(o instanceof Cart)) return false;

        Cart cart = (Cart) o;

        if (id != cart.id) return false;
        if (uId != cart.uId) return false;
        if (num != cart.num) return false;
        if (goodsId != null ? !goodsId.equals(cart.goodsId) : cart.goodsId != null) return false;
        if (createdUser != null ? !createdUser.equals(cart.createdUser) : cart.createdUser != null)
            return false;
        if (createdTime != null ? !createdTime.equals(cart.createdTime) : cart.createdTime != null)
            return false;
        if (modifiedUser != null ? !modifiedUser.equals(cart.modifiedUser) : cart.modifiedUser != null)
            return false;
        return modifiedTime != null ? modifiedTime.equals(cart.modifiedTime) : cart.modifiedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + uId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + num;
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (modifiedUser != null ? modifiedUser.hashCode() : 0);
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", uId=" + uId +
                ", goodsId='" + goodsId + '\'' +
                ", num=" + num +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
