package com.igdb.dmacedo.igdb.data.repository;

import com.igdb.dmacedo.igdb.entity.AllGenresEntity;

import java.util.List;

import io.reactivex.Observable;

public interface MainRepository {

    Observable<List<AllGenresEntity>> genres();
}
