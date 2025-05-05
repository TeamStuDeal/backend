package com.studeal.team.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "teacher")
public class Teacher extends User {

    @Lob
    @Column
    private String bio;

    @Column(nullable = false)
    private float rating = 0f;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Course> coursees = new HashSet<>();

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Negotiation> negotiations = new HashSet<>();
}