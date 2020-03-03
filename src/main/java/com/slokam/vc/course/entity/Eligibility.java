package com.slokam.vc.course.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Eligibility implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  description;
   @ManyToOne() 
@JoinColumn(name="fkid65") 
   private Course  course;
   @ManyToOne() 
@JoinColumn(name="fkid66") 
   private Technology  technology;
   @ManyToOne() 
@JoinColumn(name="fkid67") 
   private TechnologyLevel  technologylevel;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getDescription() {
		return description;
	}
public void setDescription(String description) {
		this.description = description;
	}
public Course getCourse() {
		return course;
	}
public void setCourse(Course course) {
		this.course = course;
	}
public Technology getTechnology() {
		return technology;
	}
public void setTechnology(Technology technology) {
		this.technology = technology;
	}
public TechnologyLevel getTechnologylevel() {
		return technologylevel;
	}
public void setTechnologylevel(TechnologyLevel technologylevel) {
		this.technologylevel = technologylevel;
	}
}