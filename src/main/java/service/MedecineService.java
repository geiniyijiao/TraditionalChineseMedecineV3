package main.java.service;

import main.java.bean.Medecine;

import java.util.List;

public interface MedecineService {
    List<Medecine> findAll();

    Medecine findById(int mId);

    List<Medecine> findByName(String mName);

    List<Medecine> findByTypeId(int mTypeId);
}
