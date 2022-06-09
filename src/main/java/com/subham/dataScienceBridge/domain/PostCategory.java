package com.subham.dataScienceBridge.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post-category")
public class PostCategory {

    @Column(name = "postId")
    private int postId;

    @Column(name = "categoryId")
    private int categoryId;
}
