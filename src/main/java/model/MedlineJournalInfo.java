package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Element: MedlineJournalInfo
 *
 * Contains additional journal metadata, supplmental to the metadata in the Journal wrapper element. Some elements are particular to NLM records, as developed for MEDLINE journals, e.g. NLM ID and MEDLINE TA.
 * Content Model
 *
 * ( Country?, MedlineTA, NlmUniqueID?, ISSNLinking? )
 *
 * https://dtd.nlm.nih.gov/ncbi/pubmed/doc/out/180101/el-MedlineJournalInfo.html
 */

@XmlRootElement(name = Elements.MedlineJournalInfo)
@XmlAccessorType(XmlAccessType.FIELD)
public class MedlineJournalInfo {

    /**
     * States the country wherein the funding agency is located.
     */
    @XmlElement(name = "Country")
    String country;

    /**
     * States the title abbreviation for the journal in which the artcile article appeared. These title abbreviations are designated by NLM. See <Title> for the full journal title, or <ISOAbbreviation> for the standard ISO abbreviation.
     */
    @XmlElement(name = "MedlineTA")
    String medlineTA;

    public String getCountry() {
        return country;
    }

    public MedlineJournalInfo setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getMedlineTA() {
        return medlineTA;
    }

    public MedlineJournalInfo setMedlineTA(String medlineTA) {
        this.medlineTA = medlineTA;
        return this;
    }
}
