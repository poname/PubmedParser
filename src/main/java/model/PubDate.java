package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PubDate")
@XmlAccessorType(XmlAccessType.FIELD)
public class PubDate {

    @XmlElement(name = "Year")
    Integer year;

    public Integer getYear() {
        return year;
    }

    public PubDate setYear(Integer year) {
        this.year = year;
        return this;
    }

}
