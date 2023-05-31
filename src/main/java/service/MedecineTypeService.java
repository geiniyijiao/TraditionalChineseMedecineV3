package main.java.service;

import main.java.bean.MeType;

import java.util.List;

public interface MedecineTypeService {

    List<MeType> findAll();

    MeType findById(int mTypeId);
}
