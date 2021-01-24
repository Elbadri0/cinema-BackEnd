package org.sid.cinema.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor  @NoArgsConstructor 
public class Ticket {

	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomClient;
	private double prix;
	@Column(unique=false,nullable=true)
	private Integer codePayement;
	private boolean reservee;
	@ManyToOne 
    private Place place;
	@ManyToOne
	@JsonProperty(access=Access.WRITE_ONLY)
    private Projection projection;
}
