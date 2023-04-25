package com.utkarshgoswami.moviebizz;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
//@Data
//@AllArgsConstructor 
//@NoArgsConstructor
public class Review {
	
	@Id
	private ObjectId id;	
	
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }
    
    public ObjectId getId() {
    	return id;
    }
    
    public void setId() {
    	this.id = id;
    }
    
    public String getBody() {
    	return body;
    }
    
    public void setBody() {
    	this.body = body;
    }
    
    public LocalDateTime getCreated() {
    	return created;
    }
    
    public void setCreated() {
    	this.created = created;
    }
    
    public LocalDateTime getUpdated() {
    	return updated;
    }
    
    public void setUpdated() {
    	this.updated = updated;
    }

}
