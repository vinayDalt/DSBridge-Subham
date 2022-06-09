package com.subham.dataScienceBridge.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "authorId")
    private int authorId;
    @Column(name = "parentPostId")
    private int parentPostId;
    @Column(name = "title")
    private String title;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "metaTitle")
    private String metaTitle;
    @Column(name = "content")
    private String content;
    @Column(name = "summary")
    private String summary;
    @Column(name = "published")
    private int published;
    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "updatedAt")
    private Date updatedAt;
    @Column(name = "publishedAt")
    private Date publishedAt;


}
