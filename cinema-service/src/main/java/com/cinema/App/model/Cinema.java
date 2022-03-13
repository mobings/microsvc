package com.cinema.App.model;

import javax.persistence.*;

@Entity
@Table(name = "Cinema")
public class Cinema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "C_name")
	private String C_name;

	@Column(name = "C_city")
	private String C_city;

	@Column(name = "C_start_dat")
	private String C_start_dat;
	
	
	@Column(name = "Movie_ID")
	private long Movie_ID;

	@Column(name = "C_boxoffice")
	private long C_boxoffice;
	
	
	
	

	public String getC_name() {
		return C_name;
	}







	public void setC_name(String c_name) {
		C_name = c_name;
	}







	public String getC_city() {
		return C_city;
	}







	public void setC_city(String c_city) {
		C_city = c_city;
	}







	public String getC_start_dat() {
		return C_start_dat;
	}







	public void setC_start_dat(String c_start_dat) {
		C_start_dat = c_start_dat;
	}







	public long getMovie_ID() {
		return Movie_ID;
	}







	public void setMovie_ID(long movie_ID) {
		Movie_ID = movie_ID;
	}







	public long getC_boxoffice() {
		return C_boxoffice;
	}







	public void setC_boxoffice(long c_boxoffice) {
		C_boxoffice = c_boxoffice;
	}



public Cinema() {};





	public Cinema(String c_name, String c_city, String c_start_dat, long movie_ID, long c_boxoffice) {
		super();
	
		C_name = c_name;
		C_city = c_city;
		C_start_dat = c_start_dat;
		Movie_ID = movie_ID;
		C_boxoffice = c_boxoffice;
	}







	@Override
	public String toString() {
		return "Cinema [id=" + id + ", Cinema_Name=" + C_name + ", CinemaCity=" + C_city + ", Movie_StartDate=" + C_start_dat + 
				", Movie_ID=" + Movie_ID + ", Business=" + C_boxoffice +
				
				
				"]";
	}

}
