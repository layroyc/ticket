package com.xiexin.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * selectticket
 * @author 
 */
public class Selectticket implements Serializable {
    private Integer id;

    private String placestart;

    private String placeend;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startdate;

    private String checi;

    private String starttime;

    private String endtime;

    private String tedeng;

    private String onezuo;

    private String twozuo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlacestart() {
        return placestart;
    }

    public void setPlacestart(String placestart) {
        this.placestart = placestart;
    }

    public String getPlaceend() {
        return placeend;
    }

    public void setPlaceend(String placeend) {
        this.placeend = placeend;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getCheci() {
        return checi;
    }

    public void setCheci(String checi) {
        this.checi = checi;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getTedeng() {
        return tedeng;
    }

    public void setTedeng(String tedeng) {
        this.tedeng = tedeng;
    }

    public String getOnezuo() {
        return onezuo;
    }

    public void setOnezuo(String onezuo) {
        this.onezuo = onezuo;
    }

    public String getTwozuo() {
        return twozuo;
    }

    public void setTwozuo(String twozuo) {
        this.twozuo = twozuo;
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
        Selectticket other = (Selectticket) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlacestart() == null ? other.getPlacestart() == null : this.getPlacestart().equals(other.getPlacestart()))
            && (this.getPlaceend() == null ? other.getPlaceend() == null : this.getPlaceend().equals(other.getPlaceend()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getCheci() == null ? other.getCheci() == null : this.getCheci().equals(other.getCheci()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getTedeng() == null ? other.getTedeng() == null : this.getTedeng().equals(other.getTedeng()))
            && (this.getOnezuo() == null ? other.getOnezuo() == null : this.getOnezuo().equals(other.getOnezuo()))
            && (this.getTwozuo() == null ? other.getTwozuo() == null : this.getTwozuo().equals(other.getTwozuo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlacestart() == null) ? 0 : getPlacestart().hashCode());
        result = prime * result + ((getPlaceend() == null) ? 0 : getPlaceend().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getCheci() == null) ? 0 : getCheci().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getTedeng() == null) ? 0 : getTedeng().hashCode());
        result = prime * result + ((getOnezuo() == null) ? 0 : getOnezuo().hashCode());
        result = prime * result + ((getTwozuo() == null) ? 0 : getTwozuo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", placestart=").append(placestart);
        sb.append(", placeend=").append(placeend);
        sb.append(", startdate=").append(startdate);
        sb.append(", checi=").append(checi);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", tedeng=").append(tedeng);
        sb.append(", onezuo=").append(onezuo);
        sb.append(", twozuo=").append(twozuo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}