package it.polimi.dima.roarify.server.model;

import java.io.Serializable;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Message implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long messageId;

	private String text;
	private Double lat;
	private Double lon;
	private String userId;
	private String userName;
	private String time;
	private String isParent;
	private String parentId;
	
	public Message(String text, String userId, String userName,Double lat, Double lon, String time, String isParent, String parentId){
		
		this.text = text;
		this.lat = lat;
		this.lon = lon;
		this.userId = userId;
		this.userName = userName;
		this.time = time;
		this.isParent = isParent;
		this.parentId = parentId;
		
	}
	
	public Long getId(){
		return messageId;
	}
	public String getText(){
		return text;		
	}
	public Double getLon(){
		return lon;
	}
	public Double getLat(){
		return lat;
	}
	public String getUserName(){
		return userName;
	}
	public void setText(String text){
		this.text= text;
	}
	public void setLat(Double lat){
		this.lat = lat;
	}
	public void setLon(Double lon){
		this.lon = lon;
	}
	public String getUserId(){
		return userId;		
	}
	public void setUserId(String userId){
		this.userId= userId;
	}
	public void setUserName(String userName){
		this.userName= userName;
	}
	public void setTime(String time){
		this.time=time;
	}
	public String getTime(){
		return time;
	}
	public void setIsParent(String isParent){
		this.isParent=isParent;
	}
	public String getIsParent(){
		return isParent;
	}
	public void setParentId(String parentId){
		this.parentId=parentId;
	}
	public String getParentId(){
		return parentId;
	}
}
