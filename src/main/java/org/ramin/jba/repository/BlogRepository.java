package org.ramin.jba.repository;

import java.util.List;

import org.ramin.jba.entity.Blog;
import org.ramin.jba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
