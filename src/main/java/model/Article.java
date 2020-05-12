package model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Element: pubmed.Article
 * https://dtd.nlm.nih.gov/ncbi/pubmed/doc/out/180101/el-Article.html
 * Contains the metadata to describe the published article, including the journal issue, article title, author list, funding sources. It has an attribute, @PubModel, to indicate the medium in which the cited article is published.
 * Content Model
 * ( pubmed.Journal, ArticleTitle, ( ( Pagination, ELocationID* ) | ELocationID+ ), Abstract?, AuthorList?, Language+, DataBankList?, GrantList?, PublicationTypeList, VernacularTitle?, ArticleDate* )
 * Contains:
 * <{@link Journal}>
 */
@XmlRootElement(name = "Article")
@XmlAccessorType(XmlAccessType.FIELD)
public class Article {

    @XmlElement(name = "Journal")
    Journal journal;

    @XmlElement(name = "ArticleTitle")
    String articleTitle;

    @XmlElementWrapper(name=Elements.AuthorList)
    @XmlElement(name = Elements.Author)
    List<Author> authors;

    @XmlElement(name = Elements.Language)
    String language;

    public Journal getJournal() {
        return journal;
    }

    public Article setJournal(Journal journal) {
        this.journal = journal;
        return this;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public Article setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
        return this;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Article setAuthors(List<Author> authors) {
        this.authors = authors;
        return this;
    }
}