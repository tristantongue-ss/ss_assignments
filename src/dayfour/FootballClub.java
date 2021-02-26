package dayfour;

public class FootballClub {
	
	private String name;
	private Float rating;
	private Integer trophies;
	
	public FootballClub(String name, Float rating, Integer trophies) {
		this.setName(name);
		this.setRating(rating);
		this.setTrophies(trophies);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Integer getTrophies() {
		return trophies;
	}

	public void setTrophies(Integer trophies) {
		this.trophies = trophies;
	}
	

}
