package easylearnenglish.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String word;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean isLearn = false;

    private String sentence;

    private String image;

    @Column(columnDefinition = "varchar(255) default ''")
    private String example = "";

    @Column(columnDefinition = "varchar(255) default ''")
    private String ipa = "";

    @Column(columnDefinition = "varchar(255) default ''")
    private String translateWord = "";

    @Column(columnDefinition = "varchar(255) default ''")
    private String translateSentence = "";

    @Column(columnDefinition = "varchar(255) default ''")
    private String imageSelected = "";

    @Column(columnDefinition = "timestamp default current_timestamp")
    private Date createdAt = new Date();

    @Column(columnDefinition = "timestamp default current_timestamp")
    private Date updatedAt = new Date(System.currentTimeMillis() - 86400000);

    @Column(columnDefinition = "integer default 1")
    private int saveCount = 1;

}
