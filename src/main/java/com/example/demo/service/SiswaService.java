package com.example.demo.service;

import com.example.demo.Repository.MuridRepository;
import com.example.demo.model.MuridModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiswaService {

    Logger logger = LoggerFactory.getLogger(SiswaService.class);

    @Autowired
    private MuridRepository muridRepository;

    public List listMurid(){
        List response = muridRepository.findAll();

        return response;

    }

}
