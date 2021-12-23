package ru.pcs.spring_blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.pcs.spring_blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
