package com.shc.blog.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * 文章
 * @author shc
 */
@Entity
@Table(name="article")
@org.hibernate.annotations.Table(appliesTo = "article")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
public class Article implements Serializable{
	private static final long serialVersionUID = -2088303018634326471L;
	@Id
	@Column(name="article_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer articleId;
	
	//标题
	@Column(name = "title", length = 50)
	private String title;
	
	//简介-注释
	@Column(name = "note", length = 100)
	private String note;
	
	@Column(name = "fa_user", length = 20)
	private String faUser;
	
	@Column(name = "fa_time", length = 20)
	private Date faTime;
	
	//浏览过的人
	@Column(name = "fa_eye", length = 10)
	private Integer faEye;
	
	@Column(name = "fa_comments", length = 10)
	private Integer faComments;
	
	@Column(name = "addlike_count", length = 10)
	private Integer addlikeCount;
	
	@Column(name = "fa_content")
	private String faContent;

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getFaUser() {
		return faUser;
	}

	public void setFaUser(String faUser) {
		this.faUser = faUser;
	}

	public Date getFaTime() {
		return faTime;
	}

	public void setFaTime(Date faTime) {
		this.faTime = faTime;
	}

	public Integer getFaEye() {
		return faEye;
	}

	public void setFaEye(Integer faEye) {
		this.faEye = faEye;
	}

	public Integer getFaComments() {
		return faComments;
	}

	public void setFaComments(Integer faComments) {
		this.faComments = faComments;
	}

	public Integer getAddlikeCount() {
		return addlikeCount;
	}

	public void setAddlikeCount(Integer addlikeCount) {
		this.addlikeCount = addlikeCount;
	}

	public String getFaContent() {
		return faContent;
	}

	public void setFaContent(String faContent) {
		this.faContent = faContent;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title
				+ ", note=" + note + ", faUser=" + faUser + ", faTime="
				+ faTime + ", faEye=" + faEye + ", faComments=" + faComments
				+ ", addlikeCount=" + addlikeCount + ", faContent=" + faContent
				+ "]";
	}
	
	
}
