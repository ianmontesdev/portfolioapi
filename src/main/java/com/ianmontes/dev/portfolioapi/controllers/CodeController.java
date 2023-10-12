package com.ianmontes.dev.portfolioapi.controllers;

import com.ianmontes.dev.portfolioapi.services.CodeService;
import com.ianmontes.dev.portfolioapi.models.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/code")
public class CodeController {
    @Autowired
    private CodeService codeService;
    @GetMapping
    public ResponseEntity<Code> getInfoCode() {
        return new ResponseEntity<Code>(codeService.infoCode().get(0), HttpStatus.OK);
    }
}
