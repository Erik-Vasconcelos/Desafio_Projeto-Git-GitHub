package one.digitalinnovation.pss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import one.digitalinnovation.pss.model.User;
public interface UserRepository extends JpaRepository<User, Integer> {
	
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param ("username") String username);
}
