package com.subham.dataScienceBridge.service;

import com.subham.dataScienceBridge.domain.Category;
import com.subham.dataScienceBridge.exception.CategoryAlreadyExists;
import com.subham.dataScienceBridge.exception.CategoryDoesNotExists;
import com.subham.dataScienceBridge.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    public CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;

    }

    @Override
    public Category saveCategory(Category category) throws CategoryAlreadyExists {
        if(categoryRepository.existsById(category.getId()))
            throw new CategoryAlreadyExists("This Category Already present in DB");
        else
            return categoryRepository.save(category);
    }

    @Override
    public Category deleteCategory(int id) throws CategoryDoesNotExists{
        if(categoryRepository.existsById(id)){
            Category category = categoryRepository.findById(id).get();
            this.categoryRepository.delete(category);
            return category;
        }
        else
            throw new CategoryDoesNotExists("This Category Not present in DB");
    }

    @Override
    public List<Category> getAllCategoryList(){
        return categoryRepository.findAll();
    }
}
