package com.post_hub.iam_service.model.enteties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String content;

    @Column(nullable = false, updatable = false)
    private LocalDateTime created = LocalDateTime.now();

    @Column(nullable = false, columnDefinition = "Integer default 0")
    private Integer likes = 0;
}
