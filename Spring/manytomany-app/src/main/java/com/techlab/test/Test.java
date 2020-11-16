package com.techlab.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Actor;
import com.techlab.entity.Movie;

public class Test {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory fact = config.configure("hibernate.cfg.xml").buildSessionFactory();

		Actor salman = new Actor();
		salman.setId(1);
		salman.setName("Salman Khan");
		Actor shahrukh = new Actor();
		shahrukh.setId(2);
		shahrukh.setName("Shahrukh Khan");
		Actor amir = new Actor();
		amir.setId(3);
		amir.setName("Amir Khan");

		Movie movie1 = new Movie();
		movie1.setId(1);
		movie1.setName("dilwale dulhaniya le jaege");
		Movie movie2 = new Movie();
		movie2.setId(2);
		movie2.setName("andaaz apna apna");
		Movie movie3 = new Movie();
		movie3.setId(3);
		movie3.setName("dhoom 3");

		Set<Actor> movie1Actor = new HashSet<Actor>();
		movie1Actor.add(shahrukh);
		movie1Actor.add(salman);
		movie1.setActors(movie1Actor);
		Set<Actor> movie2Actor = new HashSet<Actor>();
		movie2Actor.add(amir);
		movie2Actor.add(salman);
		movie2.setActors(movie2Actor);
		Set<Actor> movie3Actor = new HashSet<Actor>();
		movie3Actor.add(amir);
		movie3.setActors(movie3Actor);

		Set<Movie> salmanMovie = new HashSet<Movie>();
		salmanMovie.add(movie1);
		salmanMovie.add(movie2);
		salman.setMovies(salmanMovie);
		Set<Movie> shahrukhMovie = new HashSet<Movie>();
		shahrukhMovie.add(movie1);
		shahrukh.setMovies(shahrukhMovie);
		Set<Movie> amirMovie = new HashSet<Movie>();
		amirMovie.add(movie2);
		amirMovie.add(movie3);
		amir.setMovies(amirMovie);

		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		session.persist(movie1);
		session.persist(movie2);
		session.persist(movie3);
		printInfo(session);
		trans.commit();
		session.close();
		System.out.println("end");

	}

	private static void printInfo(Session session) {
		List<Movie> movies = session.createQuery("from Movie").list();
		for (Movie movie : movies) {
			System.out.println("movie:\n\t" + movie.getName() + "\nactor:");
			for (Actor actor : movie.getActors())
				System.out.println("\t" + actor.getName());
		}
	}
}
