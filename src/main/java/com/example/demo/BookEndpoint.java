package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookEndpoint {

    @GetMapping
    @RequestMapping("/books")
    public List<Book> getBooks(){
        return List.of(new Book("The Lord of The Rings","J.R.R. Tolkien"),
            new Book("The Lord of Flies","William Golding"),
            new Book("1984","George Orwell"));
    }
    
}

record Book (String name, String author){}
