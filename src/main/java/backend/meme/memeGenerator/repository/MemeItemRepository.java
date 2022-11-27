package backend.meme.memeGenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.meme.memeGenerator.model.Meme;

@Repository 
public interface MemeItemRepository extends JpaRepository<Meme, Integer> {
	
}
