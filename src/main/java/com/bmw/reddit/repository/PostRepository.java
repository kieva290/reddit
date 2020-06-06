package com.bmw.reddit.repository;

import com.bmw.reddit.model.Post;
import com.bmw.reddit.model.Subreddit;
import com.bmw.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
