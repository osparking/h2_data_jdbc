package space.bumtiger.db.repository;

import org.springframework.data.repository.ListCrudRepository;

import space.bumtiger.db.model.Users;

public interface UserRepository 
				extends ListCrudRepository<Users, Integer>{

}
