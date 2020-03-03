package com.slokam.vc.course.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Chaptor implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  title;
  private String  description;
  private String  picUrl;
   @ManyToOne() 
@JoinColumn(name="fkid58") 
   private Course  course;

 @ManyToMany 
   @JoinTable(name="fkTable59",
   joinColumns = {@JoinColumn(name="fkColumn60")},
   inverseJoinColumns = {@JoinColumn(name="fkColumn61")})  private List<Video>  videos;

 @ManyToMany 
   @JoinTable(name="fkTable62",
   joinColumns = {@JoinColumn(name="fkColumn63")},
   inverseJoinColumns = {@JoinColumn(name="fkColumn64")})  private List<Document>  documents;
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
public String getPicUrl() {
		return picUrl;
	}
public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
public Course getCourse() {
		return course;
	}
public void setCourse(Course course) {
		this.course = course;
	}
public List<Video> getVideos() {
		return videos;
	}
public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
public List<Document> getDocuments() {
		return documents;
	}
public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
}