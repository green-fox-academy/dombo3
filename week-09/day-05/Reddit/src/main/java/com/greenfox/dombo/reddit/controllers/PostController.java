package com.greenfox.dombo.reddit.controllers;

import com.greenfox.dombo.reddit.model.Post;
import com.greenfox.dombo.reddit.model.Posts;
import com.greenfox.dombo.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  PostRepository postRepository;
  Posts posts;

  public PostController(PostRepository postRepository) {
    this.postRepository = postRepository;
    this.posts = new Posts();
  }

  @GetMapping("/posts")
  public Posts getPosts() {
    Iterable<Post> postsFromRepo = postRepository.findAll();
    posts.setPosts(postsFromRepo);
    return posts;
  }

  @PostMapping("/posts")
  public Post addPost(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }

  @PutMapping("/posts/{id}/upvote")
  public Post upvotePost(@PathVariable("id") long Id) {
    Post post = postRepository.findOne(Id);
    post.upvote();
    postRepository.save(post);
    return post;
  }

  @PutMapping("/posts/{id}/downvote")
  public Post downvotePost(@PathVariable("id") long Id) {
    Post post = postRepository.findOne(Id);
    post.downvote();
    postRepository.save(post);
    return post;
  }
}
