package com.ebartmedia.ejobss.controller;


import com.ebartmedia.ejobss.dto.CatSubCatDto;
import com.ebartmedia.ejobss.entity.Categories;
import com.ebartmedia.ejobss.repository.CategoriesRepository;
import com.ebartmedia.ejobss.repository.SubCategoriesRepository;
import com.ebartmedia.ejobss.service.JoinQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EJobsController {


    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private SubCategoriesRepository subCategoriesRepository;

    @Autowired
    private JoinQuery joinQuery;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ArrayList<Categories> getSubCategories() {


        List<Categories> categoriesList = new ArrayList<>();

        categoriesList = categoriesRepository.findAll();




        return (ArrayList<Categories>) categoriesList;

    }


    @RequestMapping(value = "/getinfo", method = RequestMethod.GET)
    public List<CatSubCatDto> getSubbCategories() {

        List<CatSubCatDto> catSubCatDtos = new ArrayList<>();

         catSubCatDtos = joinQuery.getBothh();

          return catSubCatDtos;
    }





//    @GetMapping("/getinfo")
//    public ResponseEntity<List<CatSubCatDto>> getInformation() {
//
//
//
//        return new ResponseEntity<CatSubCatDto>(joinQuery.getBothh(), HttpStatus.ACCEPTED);
//    }
}
