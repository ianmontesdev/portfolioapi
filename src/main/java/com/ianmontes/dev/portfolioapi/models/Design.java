package com.ianmontes.dev.portfolioapi.models;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "design")
public class Design {
    private String profilePic;
    private List<String> techStack;
    private List<String> gallery;
    @JsonRawValue
    private List<String> education;
    @JsonRawValue
    private List<String> experience;


}
