package com.example.moviecatalogservice.resourses;

import com.example.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieCatalogResourse {

    @GetMapping
    public List<CatalogItem> getCatalog(String userId){
        return null;
    }



}
