package org.neo4j.sdnlegacy.person;


import org.neo4j.sdnlegacy.movie.MovieEntity;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * @author Gerrit Meier
 */
@RelationshipProperties
public class ReviewRelationship {

	private String summary;

	private Integer rating;

	@TargetNode
	private MovieEntity movie;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public MovieEntity getMovie() {
		return movie;
	}

	public void setMovie(MovieEntity movie) {
		this.movie = movie;
	}
}