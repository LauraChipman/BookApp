	package controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
	@Query("SELECT b FROM Book b WHERE LOWER(b.genre) = LOWER(:genre)")
	List<Book> findByGenre(@Param("genre") String genre);

	@Query("SELECT b FROM Book b WHERE LOWER(b.author) = LOWER(:author)")
	List<Book> findByAuthor(@Param("author") String author);

	@Query("SELECT b FROM Book b WHERE LOWER(b.genre) = LOWER(:genre) AND LOWER(b.author) = LOWER(:author)")
	List<Book> findByGenreAndAuthor(@Param("genre") String genre, @Param("author") String author);
}
