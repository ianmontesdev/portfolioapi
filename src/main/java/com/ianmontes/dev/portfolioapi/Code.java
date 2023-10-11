package com.ianmontes.dev.portfolioapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "code")
public class Code {
    private String title;
    private String profilePic;
    private List<String> techStack;
    private List<String> education;
    private List<String> experience;
}
