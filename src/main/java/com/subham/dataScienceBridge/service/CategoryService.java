package com.subham.dataScienceBridge.service;

import com.subham.dataScienceBridge.domain.Category;
import com.subham.dataScienceBridge.exception.CategoryAlreadyExists;
import com.subham.dataScienceBridge.exception.CategoryDoesNotExists;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    public Category saveCategory(Category category) throws CategoryAlreadyExists;

    public Category deleteCategory(int id) throws CategoryDoesNotExists;

    public List<Category> getAllCategoryList();
}
