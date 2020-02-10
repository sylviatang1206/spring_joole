package com.example.springjoole.service;


import com.example.springjoole.domain.Fan;
import com.example.springjoole.repo.FanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FanService {

    @Autowired
    private FanRepository fanRepository;

    public List<Fan> getFan() {
        return (List<Fan>) fanRepository.findAll();
    }
}
