package com.example.demo.controller;

import com.example.demo.service.SiswaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/siswa")
public class SiswaController {
    Logger logger = LoggerFactory.getLogger(SiswaController.class);

    @Autowired
    private SiswaService siswaService;

    @GetMapping("/list")
    public ResponseEntity<?> listSiswa(){
        // tampilkan semua data siswa
        return ResponseEntity.ok(siswaService.listMurid());
    }


}
