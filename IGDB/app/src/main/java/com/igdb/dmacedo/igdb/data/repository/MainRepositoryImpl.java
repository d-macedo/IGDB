package com.igdb.dmacedo.igdb.data.repository;

import com.igdb.dmacedo.igdb.data.datasource.remote.IGDBWebService;
import com.igdb.dmacedo.igdb.data.datasource.remote.WebServiceFactory;
import com.igdb.dmacedo.igdb.data.mapper.AllGenresMapper;
import com.igdb.dmacedo.igdb.entity.AllGenresEntity;

import java.util.List;

import io.reactivex.Observable;

public class MainRepositoryImpl implements MainRepository{

    private IGDBWebService service;

    public MainRepositoryImpl() {
        this.service = WebServiceFactory.create();
    }

    @Override
    public Observable<List<AllGenresEntity>> genres() {
        return null;
    }
}
