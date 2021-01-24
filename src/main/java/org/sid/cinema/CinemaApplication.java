package org.sid.cinema;

import org.sid.cinema.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class CinemaApplication implements CommandLineRunner  {
	@Autowired 
private ICinemaInitService cinemaInitServer;
	public static void main (String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cinemaInitServer.initVilles();
		cinemaInitServer.initCinemas();
		cinemaInitServer.initSalles();
		cinemaInitServer.initPlaces();
		cinemaInitServer.initSeance();
		cinemaInitServer.initCategories();
		cinemaInitServer.initFilms();
		cinemaInitServer.initProjections();
		cinemaInitServer.initTickets();
		
		
		// TODO Auto-generated method stub
		
	}

}
