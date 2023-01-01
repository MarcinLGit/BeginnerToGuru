package course.springFramework5.BeginnerToGuru.repositories;

import course.springFramework5.BeginnerToGuru.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
