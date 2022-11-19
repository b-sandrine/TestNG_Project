package backend.meme.memeGenerator.service;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.testng.annotations.Test;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import backend.meme.memeGenerator.model.Meme;
import backend.meme.memeGenerator.repository.MemeItemRepository;

@RunWith(MockitoJUnitRunner.class)
public class MemeServiceTest {
	
	@Mock
	MemeItemRepository repository;
	
	@InjectMocks
	MemeService service;
	
	@Test
	public void saveItem_success() {
		Meme meme_one = new Meme(1,"Look Up!", "The sky is bright", "https://learnsky-image1.png");
		when(repository.save(meme_one)).thenReturn(meme_one);
		assertEquals(1,service.save(meme_one).getId());
	}
}
