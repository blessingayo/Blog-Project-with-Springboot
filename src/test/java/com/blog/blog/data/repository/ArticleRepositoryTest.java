package com.blog.blog.data.repository;

import com.blog.blog.data.model.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleRepositoryTest {
    @Autowired
    ArticleRepository articleRepositoryImpl;
    @BeforeEach
    void setUp() {
    }

    @Test
    void saveArticle(){
        Article article = new Article();
        article.setName("Love for java");
        article.setBody("My love for java no be small");
        Article savedArticle = articleRepositoryImpl.save(article);
        assertThat(savedArticle).isEqualTo(article);
    }
}