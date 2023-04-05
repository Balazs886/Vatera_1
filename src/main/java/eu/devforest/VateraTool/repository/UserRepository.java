package eu.devforest.VateraTool.repository;

import eu.devforest.VateraTool.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
