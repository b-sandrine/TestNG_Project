package backend.meme.memeGenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.meme.memeGenerator.model.Meme;
import backend.meme.memeGenerator.repository.MemeItemRepository;

@Service
public class MemeService {
	@Autowired
	MemeItemRepository memeRepository;
	
	public Meme save(Meme item) {
		return memeRepository.save(item);
	}
	
	public List<Meme> findAll() {
		return memeRepository.findAll();
	}
	
	public Optional<Meme> findById(int id) {
		return memeRepository.findById(id);
	}
	
	public void deleteById(int id) {
		memeRepository.deleteById(id);
	}
	
}
