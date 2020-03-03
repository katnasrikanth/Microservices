package com.slokam.vc.course.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class FeedBack implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  comments;
  private Float  rating;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getComments() {
		return comments;
	}
public void setComments(String comments) {
		this.comments = comments;
	}
public Float getRating() {
		return rating;
	}
public void setRating(Float rating) {
		this.rating = rating;
	}
}