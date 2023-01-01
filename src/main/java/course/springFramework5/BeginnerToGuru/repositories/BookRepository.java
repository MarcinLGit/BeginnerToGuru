package course.springFramework5.BeginnerToGuru.repositories;

import course.springFramework5.BeginnerToGuru.domain.Book;
import org.springframework.data.repository.CrudRepository;



public interface BookRepository extends CrudRepository<Book, Long> {

}
