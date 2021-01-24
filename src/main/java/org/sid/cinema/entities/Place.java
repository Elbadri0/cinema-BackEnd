package org.sid.cinema.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor  @NoArgsConstructor 
public class Place {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private int numero;
	private double longitude,latitude,altitude;
	@ManyToOne
	private Salle salle;
	@OneToMany(mappedBy="place")
	@JsonProperty(access=Access.WRITE_ONLY)
	private Collection<Ticket> tickets;
	
	

}
