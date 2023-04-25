package com.utkarshgoswami.moviebizz;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="movies")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Movie {
	
	@Id
    private ObjectId id;

    private String imdbId;
	
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference
    private List<Review> reviewIds;
	
	public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrops, List<String> genres) {
		this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }
	
	public ObjectId getId() {
		return id;
	}
	
	public void serId() {
		this.id=id;
	}
	
	public String getImdbId() {
		return imdbId;
	}
	
	public void setImdbId() {
		this.imdbId = imdbId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle() {
		this.title = title;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate() {
		this.releaseDate = releaseDate;
	}
	
	public String getTrailerLink() {
		return trailerLink;
	}
	
	public void setTrailerLink() {
		this.trailerLink = trailerLink;
	}
	
	public String getPoster() {
		return poster;
	}
	
	public void setPoster() {
		this.poster = poster;
	}
	
	public List<String> getBackdrops() {
		return backdrops;
	}
	
	public void setBackdrops() {
		this.backdrops = backdrops;
	}
	
	public List<String> getGenres(){
		return genres;
	}
	
	public void setGenres() {
		this.genres = genres;
	}
	
	public List<Review> getReviewIds(){
		return reviewIds;
	}
	
	public void setReviewIds() {
		this.reviewIds = reviewIds;
	}
}
