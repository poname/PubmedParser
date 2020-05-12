package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public @XmlRootElement(name = "MedlineCitation")
@XmlAccessorType(XmlAccessType.FIELD)
class MedlineCitation {

    @XmlElement(name = "DateCompleted")
    DateCompleted dateCompleted;

    @XmlElement(name = "Article")
    Article article;

    @XmlElement(name = "MedlineJournalInfo")
    MedlineJournalInfo medlineJournalInfo;

    public DateCompleted getDateCompleted() {
        return dateCompleted;
    }

    public MedlineCitation setDateCompleted(DateCompleted dateCompleted) {
        this.dateCompleted = dateCompleted;
        return this;
    }

    public Article getArticle() {
        return article;
    }

    public MedlineCitation setArticle(Article article) {
        this.article = article;
        return this;
    }

    public MedlineJournalInfo getMedlineJournalInfo() {
        return medlineJournalInfo;
    }

    public MedlineCitation setMedlineJournalInfo(MedlineJournalInfo medlineJournalInfo) {
        this.medlineJournalInfo = medlineJournalInfo;
        return this;
    }
}