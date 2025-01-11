package com.teltech.quiz_service1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionWrapper {

    private Integer id;
    private String question_title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

}
