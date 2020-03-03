package com.slokam.vc.course.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Course implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  title;
  private String  description;
  private String  pictureUrl;

 @ManyToMany 
   @JoinTable(name="fkTable68",
   joinColumns = {@JoinColumn(name="fkColumn69")},
   inverseJoinColumns = {@JoinColumn(name="fkColumn70")})  private List<Tag>  tags;
  private Float  duration;
  private Float  fee;

 @ManyToMany 
   @JoinTable(name="fkTable71",
   joinColumns = {@JoinColumn(name="fkColumn72")},
   inverseJoinColumns = {@JoinColumn(name="fkColumn73")})  private List<TechnologyLevel>  technologyLevel;
   @ManyToOne() 
@JoinColumn(name="fkid74") 
   private Cat  cat;
   @ManyToOne() 
@JoinColumn(name="fkid75") 
   private Status  status;
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
public List<Tag> getTags() {
		return tags;
	}
public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
public Float getDuration() {
		return duration;
	}
public void setDuration(Float duration) {
		this.duration = duration;
	}
public Float getFee() {
		return fee;
	}
public void setFee(Float fee) {
		this.fee = fee;
	}
public List<TechnologyLevel> getTechnologyLevel() {
		return technologyLevel;
	}
public void setTechnologyLevel(List<TechnologyLevel> technologyLevel) {
		this.technologyLevel = technologyLevel;
	}
public Cat getCat() {
		return cat;
	}
public void setCat(Cat cat) {
		this.cat = cat;
	}
public Status getStatus() {
		return status;
	}
public void setStatus(Status status) {
		this.status = status;
	}
}