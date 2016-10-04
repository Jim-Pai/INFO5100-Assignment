package assignment4;

public class MusicAlbum {
	
	private String albumTitle;
	private String singer;
	private double price;
	
	public MusicAlbum(String title, String singer, double price){
		this.albumTitle = title;
		this.singer = singer;
		this.price = price;
	}
	
	public String getAlbumTitle(){
		return this.albumTitle;
	}
	
	public String getSinger(){
		return this.singer;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public void changePrice(double price){
		this.price = price;
	}
	
}
