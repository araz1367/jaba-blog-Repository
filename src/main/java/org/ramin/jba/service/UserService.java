package org.ramin.jba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.ramin.jba.entity.Blog;
import org.ramin.jba.entity.Item;
import org.ramin.jba.entity.User;
import org.ramin.jba.repository.BlogRepository;
import org.ramin.jba.repository.ItemRepository;
import org.ramin.jba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	public User findOneWithBlogs(int id) {
		User user=findOne(id);
		List<Blog> blogs=blogRepository.findByUser(user);
		for (Blog blog : blogs) {
			List<Item> items=itemRepository.findByBlog(blog,new PageRequest(0, 10, Direction.DESC, "publishedDate"));
			blog.setItems(items);
		}
		user.setBlogs(blogs); 
		return user;
	}

	public void save(User user) {
		 userRepository.save(user);
	}
}
