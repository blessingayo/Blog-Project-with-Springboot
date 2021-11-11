package com.blog.blog.data.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

import java.util.List;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull  @NotBlank
    @Column(nullable = false)
    private String name;

    @CreationTimestamp
    private LocalDate datePublished;
    @UpdateTimestamp
    private LocalDate dateUpdated;

    @NotBlank  @NotNull
    @Column(nullable=false)
    private String body;

    private String imageUrl;

    @OneToMany
    List<Comment> comments;
}
