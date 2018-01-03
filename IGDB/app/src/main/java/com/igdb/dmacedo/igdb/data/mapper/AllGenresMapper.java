package com.igdb.dmacedo.igdb.data.mapper;

import com.igdb.dmacedo.igdb.data.datasource.response.AllGenresResponse;
import com.igdb.dmacedo.igdb.entity.AllGenresEntity;

import java.util.ArrayList;
import java.util.List;

public class AllGenresMapper {

    public static List<AllGenresEntity> transform (List<AllGenresResponse> genres){
        List<AllGenresEntity> genresEntity = new ArrayList<>();

        for (AllGenresResponse genre : genres){
            AllGenresEntity allGenresEntity = new AllGenresEntity(genre.getId());
            genresEntity.add(allGenresEntity);
        }
        return genresEntity;
    }
}
