package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = Elements.PubmedArticleSet)
@XmlAccessorType(XmlAccessType.FIELD)
public class PubmedArticleSet {

    @XmlElement(name = Elements.PubmedArticle)
    List<PubmedArticle> articles;

    public List<PubmedArticle> getArticles() {
        return articles;
    }

    public PubmedArticleSet setArticles(List<PubmedArticle> articles) {
        this.articles = articles;
        return this;
    }

}