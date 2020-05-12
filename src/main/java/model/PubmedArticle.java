package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = Elements.PubmedArticle)
@XmlAccessorType(XmlAccessType.FIELD)
public class PubmedArticle {

    @XmlElement(name = Elements.MedlineCitation)
    MedlineCitation medlineCitation;

    public MedlineCitation getMedlineCitation() {
        return medlineCitation;
    }

    public PubmedArticle setMedlineCitation(MedlineCitation medlineCitation) {
        this.medlineCitation = medlineCitation;
        return this;
    }
}