package org.ianlee.project1;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {
    
    private PostRepository postRepo;
    
    @Autowired
    public DataLoader(PostRepository postRepo) {
   	 this.postRepo = postRepo;
    }
    
    @PostConstruct
    private void loadData() {
    		Post post1 = new Post("Christmas", "Merry Christmas!", new Date(117,11,25));
    		Post post2 = new Post("Easter", "Happy Easter!", new Date(117,3,10));
    		Post post3 = new Post("Halloween", "Spooky!", new Date(117,9,31));
    		postRepo.save(post1);
    		postRepo.save(post2);
    		postRepo.save(post3);
    }
    public Iterable<Post> postReturn() {
    		return postRepo.findAll();
    }
}
