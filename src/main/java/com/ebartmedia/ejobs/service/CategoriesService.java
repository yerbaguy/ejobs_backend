package com.ebartmedia.ejobs.service;


import com.ebartmedia.ejobs.model.Categories;
import com.ebartmedia.ejobs.repository.CategoriesRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriesService {


    @Autowired
    public CategoriesRepository categoriesRepository;



    public ArrayList<Categories> getCategories() {

        List<Categories> categories_list = new ArrayList<Categories>();


        return (ArrayList<Categories>) (categories_list = categoriesRepository.getCategories());

    }

}
