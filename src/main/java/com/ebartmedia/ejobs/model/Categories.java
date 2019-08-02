package com.ebartmedia.ejobs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categories {

    private @Id
    @GeneratedValue
//	Long id;
	int category_id;
    //	private String engword;
    private String category_name;
//	private int idplword;


    public void setCategoryId(int category_id) {
        this.category_id = category_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategoryName() {
        return this.category_name;
    }
}
