package ma.tiwtiw.menu.repository;

import ma.tiwtiw.menu.model.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends MongoRepository<Menu, String> {

}
