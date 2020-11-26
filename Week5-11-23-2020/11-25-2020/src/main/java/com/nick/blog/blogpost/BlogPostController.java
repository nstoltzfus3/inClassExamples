package com.nick.blog.blogpost;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogPostController {
	
    @Autowired
    private BlogPostRepository blogPostRepository;
    
    
    
//    @GetMapping(value = "/")
//    public String index(BlogPost blogPost, Model model) {
//    	model.addAttribute("posts", posts); 
//    	return "blogpost/index";
//    }
    
    @GetMapping(value = "/blogposts/new")
    public String newBlog(BlogPost blogPost) {
        return "blogpost/new";
    }
    
    @GetMapping(value = "/")
    public String index(BlogPost blogPost, Model model) {
    	List<BlogPost> posts = new ArrayList<>();
        posts.removeAll(posts);
        for (BlogPost post : blogPostRepository.findAll()) {
        	posts.add(post);
        }
        model.addAttribute("posts", posts);
        return "blogpost/index";
    }
    
    @PostMapping(value = "/blogposts")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
		blogPostRepository.save(new BlogPost(blogPost.getTitle(), 
				blogPost.getAuthor(), blogPost.getBlogEntry()));
		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author", blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		model.addAttribute("id", blogPost.getId());
		return "blogpost/result";
    }
    
    @RequestMapping(value = "/blogposts/delete/{id}", method = RequestMethod.GET)
    public String deletePostWithId(@PathVariable Long id, BlogPost blogPost) {
    	if (blogPostRepository.existsById(id)) {
    		blogPostRepository.deleteById(id);
    	}
        return "redirect:/";
    }

    @RequestMapping(value = "/blogposts/{id}", method = RequestMethod.GET)
    public String editPostWithId(@PathVariable Long id, BlogPost blogPost, Model model) {
        Optional<BlogPost> post = blogPostRepository.findById(id);
        if (post.isPresent()) {
            BlogPost actualPost = post.get();
            model.addAttribute("blogPost", actualPost);
        }
        return "blogpost/edit";
    }
    
    @RequestMapping(value = "/blogposts/update/{id}")
    public String updateExistingPost(@PathVariable Long id, BlogPost blogPost, Model model) {
        Optional<BlogPost> post = blogPostRepository.findById(id);
        if (post.isPresent()) {
            BlogPost actualPost = post.get();
            actualPost.setTitle(blogPost.getTitle());
            actualPost.setAuthor(blogPost.getAuthor());
            actualPost.setBlogEntry(blogPost.getBlogEntry());
            blogPostRepository.save(actualPost);
            model.addAttribute("blogPost", actualPost);
        }
 
        return "blogpost/result";
    }
    
}
