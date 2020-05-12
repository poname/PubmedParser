package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = Elements.JournalIssue)
@XmlAccessorType(XmlAccessType.FIELD)
public class JournalIssue {

    @XmlElement(name = Elements.Volume)
    String volume;
    @XmlElement(name = Elements.Issue)
    String issue;
    @XmlElement(name = Elements.PubDate)
    PubDate pubDate;

    public String getVolume() {
        return volume;
    }

    public JournalIssue setVolume(String volume) {
        this.volume = volume;
        return this;
    }

    public String getIssue() {
        return issue;
    }

    public JournalIssue setIssue(String issue) {
        this.issue = issue;
        return this;
    }

    public PubDate getPubDate() {
        return pubDate;
    }

    public JournalIssue setPubDate(PubDate pubDate) {
        this.pubDate = pubDate;
        return this;
    }
}