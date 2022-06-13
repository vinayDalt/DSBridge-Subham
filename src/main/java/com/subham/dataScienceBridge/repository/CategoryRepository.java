package com.subham.dataScienceBridge.repository;

import com.subham.dataScienceBridge.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    //1. Here We have to write query, we can direct write query here using '@Query' annotation.
    //2. Here all the Abstract methods will be declared like:

    @Query("SELECT c FROM Category c")
    List<Category> findAllCategory();

    @Query("SELECT c FROM Category c where c.id=(:id)")
    List<Category> findCategoryById(@Param("id") int id);

}
