package org.example.study;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
