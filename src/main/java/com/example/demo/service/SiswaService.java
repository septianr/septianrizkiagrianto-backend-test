package com.example.demo.service;

import com.example.demo.Repository.MuridRepository;
import com.example.demo.dto.MuridDTO;
import com.example.demo.model.MuridModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SiswaService {

    Logger logger = LoggerFactory.getLogger(SiswaService.class);

    @Autowired
    private MuridRepository muridRepository;

    public List listMurid(){
        List response = muridRepository.findAll();

        return response;

    }

    public List<MuridModel> searchMurid(String req){
        List<MuridModel> response = muridRepository.findByNameContaining(req);

        return response;
    }

    public MuridModel createMurid(MuridDTO req){

        MuridModel murid = new MuridModel();
        murid.setDate(LocalDateTime.now());
        murid.setName(req.getName());
        muridRepository.save(murid);
        return murid;
    }

    public MuridModel updateMurid(MuridDTO req) throws Exception {

        Optional<MuridModel> cekData = muridRepository.findById((long)req.getId());
        if(cekData.isEmpty()){
            throw new Exception("Data Tidak Ditemukan");
        }
        cekData.get().setDate(LocalDateTime.now());
        cekData.get().setName(req.getName());
        muridRepository.save(cekData.get());
        return cekData.get();
    }

}
