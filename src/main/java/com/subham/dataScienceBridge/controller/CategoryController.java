package com.subham.dataScienceBridge.controller;


import com.subham.dataScienceBridge.domain.Category;
import com.subham.dataScienceBridge.exception.CategoryAlreadyExists;
import com.subham.dataScienceBridge.exception.CategoryDoesNotExists;
import com.subham.dataScienceBridge.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value ="/api/category")
public class CategoryController {

    ResponseEntity<?> responseEntity;

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;

    }

    @PostMapping("/new")
    public ResponseEntity<?> saveForm(@RequestBody Category category) throws CategoryAlreadyExists {

        try {
            categoryService.saveCategory(category);
            responseEntity = new ResponseEntity<Category>(category, HttpStatus.CREATED);
        }
        catch (CategoryAlreadyExists e){
            responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);

        }
        return responseEntity;

    }

    @GetMapping("/view")
    public ResponseEntity<?> getAllFeedback(){

        return new ResponseEntity<List<Category>>(categoryService.getAllCategoryList(),HttpStatus.OK);

    }


    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> deleteFeedback(@PathVariable("id") int id) throws CategoryDoesNotExists {
        try {
            categoryService.deleteCategory(id);

            responseEntity = new ResponseEntity<>("deleted", HttpStatus.OK);

        }
        catch (CategoryDoesNotExists e){

            responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }

        return responseEntity;
    }


}
