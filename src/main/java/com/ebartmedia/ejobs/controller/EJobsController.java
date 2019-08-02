package com.ebartmedia.ejobs.controller;

import com.ebartmedia.ejobs.model.Categories;
import com.ebartmedia.ejobs.repository.CategoriesRepository;
import com.ebartmedia.ejobs.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.ebartmedia.ejobs.service.CategoriesService;

@RestController
@RequestMapping("/api")
public class EJobsController {

//    @Autowired
//    private CategoriesService categoriesService;

    @Autowired
    private CategoriesRepository categoriesRepository;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getInfo() {

        String label = "lkjasdfk";

        System.out.println("label" + label);


        return label;
    }



    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Categories> getCategories() {

        Categories categories = new Categories();

        List<Categories> categories_list = new ArrayList<Categories>();
        List<Categories> categories_list_ = new ArrayList<Categories>();



         // return (ArrayList<Categories>) (categories_list = categoriesService.getCategories());

                 categories_list_ = categoriesRepository.getCategories();



        System.out.println("categories" + categories_list_);



            categories_list.add(new Categories());

             return categories_list = categoriesRepository.getCategories();


    }


}
