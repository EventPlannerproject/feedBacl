package com.java.feedBack.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="feedBack")
@Getter
@Setter
@ToString
@AllArgsConstructor


public class FeedBack implements Serializable {

    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String commentaire;
    private String rating;

    public FeedBack() {
        super();
    }


}
