package com.xiexin.bean;

import java.io.Serializable;

/**
 * orders
 * @author 
 */
public class Orders implements Serializable {
    private Integer id;

    private String orderid;

    private String checi;

    private String yudingtime;

    private String zuowei;

    private Double price;

    private String chengperson;

    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getCheci() {
        return checi;
    }

    public void setCheci(String checi) {
        this.checi = checi;
    }

    public String getYudingtime() {
        return yudingtime;
    }

    public void setYudingtime(String yudingtime) {
        this.yudingtime = yudingtime;
    }

    public String getZuowei() {
        return zuowei;
    }

    public void setZuowei(String zuowei) {
        this.zuowei = zuowei;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getChengperson() {
        return chengperson;
    }

    public void setChengperson(String chengperson) {
        this.chengperson = chengperson;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCheci() == null ? other.getCheci() == null : this.getCheci().equals(other.getCheci()))
            && (this.getYudingtime() == null ? other.getYudingtime() == null : this.getYudingtime().equals(other.getYudingtime()))
            && (this.getZuowei() == null ? other.getZuowei() == null : this.getZuowei().equals(other.getZuowei()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getChengperson() == null ? other.getChengperson() == null : this.getChengperson().equals(other.getChengperson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCheci() == null) ? 0 : getCheci().hashCode());
        result = prime * result + ((getYudingtime() == null) ? 0 : getYudingtime().hashCode());
        result = prime * result + ((getZuowei() == null) ? 0 : getZuowei().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getChengperson() == null) ? 0 : getChengperson().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", checi=").append(checi);
        sb.append(", yudingtime=").append(yudingtime);
        sb.append(", zuowei=").append(zuowei);
        sb.append(", price=").append(price);
        sb.append(", chengperson=").append(chengperson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}