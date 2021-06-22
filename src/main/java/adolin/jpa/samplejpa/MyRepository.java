package adolin.jpa.samplejpa;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Adolin Negash 22.06.2021
 */
public interface MyRepository extends CrudRepository<MyEntity, Long> {

}
