package org.ramin.jba.repository;

import java.util.List;

import org.ramin.jba.entity.Blog;
import org.ramin.jba.entity.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	List<Item> findByBlog(Blog blog,Pageable pageable);
}
