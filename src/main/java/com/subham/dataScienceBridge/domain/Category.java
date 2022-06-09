package com.subham.dataScienceBridge.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parentCategoryId")
    private int parentCategoryId;
    @Column(name = "title")
    private String title;
    @Column(name = "metaTitle")
    private String metaTitle;
    @Column(name = "slug")
    private String slug;
    @Column(name = "content")
    private String content;



}
