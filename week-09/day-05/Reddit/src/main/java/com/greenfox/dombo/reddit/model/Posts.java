package com.greenfox.dombo.reddit.model;

import java.util.List;

public class Posts {
  private Iterable<Post> posts;

  public Posts() {
  }

  public Posts(List<Post> posts) {
    this.posts = posts;
  }

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
