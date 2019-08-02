package com.ebartmedia.ejobs.repository;

import com.ebartmedia.ejobs.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {


    @Query("SELECT c FROM Categories c")
    public ArrayList getCategories();

}
