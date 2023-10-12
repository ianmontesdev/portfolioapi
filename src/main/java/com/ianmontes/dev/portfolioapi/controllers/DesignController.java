package com.ianmontes.dev.portfolioapi.controllers;

import com.ianmontes.dev.portfolioapi.models.Design;
import com.ianmontes.dev.portfolioapi.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/design")
public class DesignController {

    @Autowired
    private DesignService designService;

    @GetMapping
    public ResponseEntity<Design> getInfoDesign() {
        return new ResponseEntity<Design>(designService.infoDesign().get(0), HttpStatus.OK);
    }
}
