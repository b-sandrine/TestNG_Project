package backend.meme.memeGenerator.model;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class memeTest {
	Meme memeModel = new Meme(1,"True story","This is it", "https://image/laugh");
	
	public void constructorShouldSetAllValue() {
		assertEquals(memeModel.getId(),1);
		assertEquals(memeModel.getHeadingText(), "True story");
		assertEquals(memeModel.getFooterText(), "This is it");
		assertEquals(memeModel.getImageUrl(), "https://image/laugh");
	}
}
