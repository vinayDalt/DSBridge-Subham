package com.subham.dataScienceBridge.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post-comment")
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "postId")
    private int postId;
    @Column(name = "postCommentId")
    private int postCommentId;
    @Column(name = "title")
    private String title;
    @Column(name = "published")
    private int published;
    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "publishedAt")
    private Date publishedAt;
    @Column(name = "content")
    private String content;



}
