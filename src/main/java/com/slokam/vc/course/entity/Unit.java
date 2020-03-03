package com.slokam.vc.course.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Unit implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  title;
  private String  description;
  private String  pictureUrl;
   @ManyToOne() 
@JoinColumn(name="fkid51") 
   private Chaptor  chaptor;

 @ManyToMany 
   @JoinTable(name="fkTable52",
   joinColumns = {@JoinColumn(name="fkColumn53")},
   inverseJoinColumns = {@JoinColumn(name="fkColumn54")})  private List<Video>  videos;

 @ManyToMany 
   @JoinTable(name="fkTable55",
   joinColumns = {@JoinColumn(name="fkColumn56")},
   inverseJoinColumns = {@JoinColumn(name="fkColumn57")})  private List<Document>  document;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getTitle() {
		return title;
	}
public void setTitle(String title) {
		this.title = title;
	}
public String getDescription() {
		return description;
	}
public void setDescription(String description) {
		this.description = description;
	}
public String getPictureUrl() {
		return pictureUrl;
	}
public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
public Chaptor getChaptor() {
		return chaptor;
	}
public void setChaptor(Chaptor chaptor) {
		this.chaptor = chaptor;
	}
public List<Video> getVideos() {
		return videos;
	}
public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
public List<Document> getDocument() {
		return document;
	}
public void setDocument(List<Document> document) {
		this.document = document;
	}
}