package com.greenfox.dombo.reddit.services;

import com.greenfox.dombo.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
