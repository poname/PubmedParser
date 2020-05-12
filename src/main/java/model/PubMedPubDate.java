package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PubMedPubDate")
@XmlAccessorType(XmlAccessType.FIELD)
public class PubMedPubDate {

    @XmlElement(name = "Year")
    Integer year;
    @XmlElement(name = "Month")
    Integer month;
    @XmlElement(name = "Day")
    Integer day;
    @XmlElement(name = "Hour")
    Integer hour;
    @XmlElement(name = "Minute")
    Integer minute;
    @XmlElement(name = "Second")
    Integer second;

    public Integer getYear() {
        return year;
    }

    public PubMedPubDate setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Integer getMonth() {
        return month;
    }

    public PubMedPubDate setMonth(Integer month) {
        this.month = month;
        return this;
    }

    public Integer getDay() {
        return day;
    }

    public PubMedPubDate setDay(Integer day) {
        this.day = day;
        return this;
    }

    public Integer getHour() {
        return hour;
    }

    public PubMedPubDate setHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    public Integer getMinute() {
        return minute;
    }

    public PubMedPubDate setMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    public Integer getSecond() {
        return second;
    }

    public PubMedPubDate setSecond(Integer second) {
        this.second = second;
        return this;
    }
}
