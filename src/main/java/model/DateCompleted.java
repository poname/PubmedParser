package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public @XmlRootElement(name = "DateCompleted")
@XmlAccessorType(XmlAccessType.FIELD)
class DateCompleted {

    @XmlElement(name = Elements.Year)
    Integer year;

    @XmlElement(name = Elements.Month)
    Integer month;

    @XmlElement(name = Elements.Day)
    Integer day;

    public Integer getYear() {
        return year;
    }

    public DateCompleted setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Integer getMonth() {
        return month;
    }

    public DateCompleted setMonth(Integer month) {
        this.month = month;
        return this;
    }

    public Integer getDay() {
        return day;
    }

    public DateCompleted setDay(Integer day) {
        this.day = day;
        return this;
    }
}