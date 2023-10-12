package com.ianmontes.dev.portfolioapi.services;

import com.ianmontes.dev.portfolioapi.repositories.CodeRepository;
import com.ianmontes.dev.portfolioapi.models.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService {
    @Autowired
    private CodeRepository codeRepository;
    public List<Code> infoCode() {
        return codeRepository.findAll();
    }
}
