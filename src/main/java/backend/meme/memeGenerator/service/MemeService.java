package backend.meme.memeGenerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import backend.meme.memeGenerator.model.Meme;
import backend.meme.memeGenerator.repository.MemeItemRepository;

public class MemeService {
	@Autowired
	MemeItemRepository memeRepository;
	
	public Meme saveItem(Meme item) {
		return memeRepository.save(item);
	}
	
	public List<Meme> findMemes() {
		return memeRepository.findAll();
	}
	
	public void deleteMemeById(int id) {
		memeRepository.deleteById(id);
	}
}
