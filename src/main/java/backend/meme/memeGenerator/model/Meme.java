package backend.meme.memeGenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Meme {
	
	@Id
	private int id;
	private String headingText;
	private String footerText;
	private String imageUrl;

	public Meme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meme(int id, String headingText, String footerText, String imageUrl) {
		super();
		this.id = id;
		this.headingText = headingText;
		this.footerText = footerText;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getHeadingText() {
		return headingText;
	}
	
	public void setHeadingText(String headingText) {
		this.headingText = headingText;
	}
	
	public String getFooterText() {
		return footerText;
	}
	
	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}	
	
	@Override
	public String toString() {
		return "Meme [id=" + id + ", headingText=" + headingText + ", footerText=" + footerText + ", imageUrl="
				+ imageUrl + "]";
	}
}
