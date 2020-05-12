package model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = Elements.Author)
@XmlAccessorType(XmlAccessType.FIELD)
public class Author {

    @XmlElement(name = Elements.LastName)
    String lastName;

    @XmlElement(name = Elements.ForeName)
    String foreName;

    @XmlElement(name = Elements.Initials)
    String initials;

    @XmlElementWrapper(name=Elements.AffiliationInfo)
    @XmlElement(name = Elements.Affiliation)
    List<String> affiliationInfo;

    public String getLastName() {
        return lastName;
    }

    public Author setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getForeName() {
        return foreName;
    }

    public Author setForeName(String foreName) {
        this.foreName = foreName;
        return this;
    }

    public String getInitials() {
        return initials;
    }

    public Author setInitials(String initials) {
        this.initials = initials;
        return this;
    }

    public List<String> getAffiliationInfo() {
        return affiliationInfo;
    }

    public Author setAffiliationInfo(List<String> affiliationInfo) {
        this.affiliationInfo = affiliationInfo;
        return this;
    }
}
