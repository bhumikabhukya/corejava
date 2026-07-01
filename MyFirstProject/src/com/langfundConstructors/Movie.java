package com.langfundConstructors;

public class Movie {
	String director;
	String producer;
	String hero;
	String heroine;
	double budget; 
	public Movie() {
		System.out.println("no arg constructor");
	}
	Movie(String director){
		this.director = director;
	}
	public Movie(Movie m,String producer) {
	this.director=m.director;
	this.producer=producer;
	}
	
	public Movie(Movie m,String hero,String heroine) {
	this.director=m.director;
	this.producer=m.producer;
	this.hero=hero;
	this.heroine=heroine;
}
	
	
	public Movie(Movie m,double budget) {
	this.director=m.director;
	this.producer=m.producer;
	this.hero=m.hero;
	this.heroine=m.heroine;
	this.budget=budget;
	}

	public static void main(String[] args) {
    System.out.println("main method started");
    Movie m = new Movie() ;
    m.movieInfo();
    Movie m1 = new Movie("anil");
    m1.movieInfo();
    Movie m2 = new Movie(m1,"nani");
    m2.movieInfo();
    Movie m3 = new Movie(m2,"prabesh","anushka");
    m3.movieInfo();
    Movie m4 = new Movie(m3,30000000);
    m4.movieInfo();
    }

	void movieInfo() {
		System.out.println("movie director:"+director);
		System.out.println("movie producer:"+producer);
		System.out.println("movie hero:"+hero);
		System.out.println("movie heroine:"+heroine);
		System.out.println("movie budget:"+budget);
	}

}
