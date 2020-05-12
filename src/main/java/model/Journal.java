package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = Elements.Journal)
@XmlAccessorType(XmlAccessType.FIELD)
public class Journal {

    @XmlElement(name = Elements.ISSN)
    String issn;

    @XmlElement(name = Elements.JournalIssue)
    JournalIssue journalIssue;

    public String getIssn() {
        return issn;
    }

    public Journal setIssn(String issn) {
        this.issn = issn;
        return this;
    }

    public JournalIssue getJournalIssue() {
        return journalIssue;
    }

    public Journal setJournalIssue(JournalIssue journalIssue) {
        this.journalIssue = journalIssue;
        return this;
    }
}