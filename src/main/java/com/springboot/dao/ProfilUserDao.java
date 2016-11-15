package com.springboot.dao;

import java.util.List;

import com.springboot.model.ProfilUser;

public interface ProfilUserDao {

    List< ProfilUser > findAll();

    ProfilUser findByType( final String type );

    ProfilUser findById( final int id );
}
