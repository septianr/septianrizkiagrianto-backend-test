package com.example.demo.controller;

import com.example.demo.dto.MuridDTO;
import com.example.demo.service.SiswaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/search")
    public ResponseEntity<?> searchSiswa(@RequestParam String name){
        // tampilkan semua data siswa
        return ResponseEntity.ok(siswaService.searchMurid(name));
    }

    @PostMapping("/create")
    public ResponseEntity<?> CreateSiswa(@RequestBody MuridDTO req ){
        // tampilkan semua data siswa
        return ResponseEntity.ok(siswaService.createMurid(req));
    }

    @PostMapping("/update")
    public ResponseEntity<?> UpdateSiswa(@RequestBody MuridDTO req ){
        // tampilkan semua data siswa
        try {
            return ResponseEntity.ok(siswaService.updateMurid(req));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Data Tidak Ditemukan");
        }
    }




}
