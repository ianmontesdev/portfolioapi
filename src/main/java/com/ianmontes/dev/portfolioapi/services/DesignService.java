package com.ianmontes.dev.portfolioapi.services;

import com.ianmontes.dev.portfolioapi.models.Design;
import com.ianmontes.dev.portfolioapi.repositories.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignService {
    @Autowired
    private DesignRepository designRepository;

    public List<Design> infoDesign() {return designRepository.findAll();}
}
