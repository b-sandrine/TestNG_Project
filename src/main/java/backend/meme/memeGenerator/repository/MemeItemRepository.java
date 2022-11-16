package backend.meme.memeGenerator.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.meme.memeGenerator.model.Meme;

@Repository 
public interface MemeItemRepository extends JpaRepository<Meme, Integer> {
	long countItems();
	Optional<Meme> findById(int id);
	List<Meme> findAll();
}
