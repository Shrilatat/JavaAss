package com.examples;

import java.util.Comparator;

public class Series implements Comparable<Series>{

	
	private String series_name;
	private String character;

	public Series(String series_name, String character) {
		this.series_name = series_name;
		this.character = character;
	}
	
	// Comparator 1
	public static Comparator<Series> compareByName = new Comparator<Series>() {

		@Override
		public int compare(Series s1, Series s2) {
			// TODO Auto-generated method stub
			return s2.getSeries_name().compareTo(s1.getSeries_name());
		}
		
	};
	
	
	// Comparator 2
	
	public static Comparator<Series> compareByChar = new Comparator<Series>() {

		@Override
		public int compare(Series s1, Series s2) {
			// TODO Auto-generated method stub
			return s2.getCharacter().compareTo(s1.getCharacter());
		}

	
	
	};
	
	public String getSeries_name() {
		return series_name;
	}
	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "Series [series_name=" + series_name + ", character=" + character + "]";
	}

	@Override
	public int compareTo(Series series) {
		// TODO Auto-generated method stub
		//return (this.series_name).compareTo(series.getSeries_name());
		return (this.character).compareTo(series.getCharacter());

	}
	

	
}
