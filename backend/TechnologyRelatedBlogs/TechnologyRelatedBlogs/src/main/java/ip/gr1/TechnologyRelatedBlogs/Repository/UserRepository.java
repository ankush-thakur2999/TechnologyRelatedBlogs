package ip.gr1.TechnologyRelatedBlogs.Repository;

import ip.gr1.TechnologyRelatedBlogs.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Long> {
}
