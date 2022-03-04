package my.project.blogprj.modules.users.repository;

import my.project.blogprj.modules.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by rasoolzadeh
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    @Query("select u from User u where u.email= :inputEmail")
    User QueryByEmail(@Param("inputEmail") String emailAddr);
}
