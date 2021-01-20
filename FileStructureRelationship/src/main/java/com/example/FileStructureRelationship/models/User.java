package com.example.FileStructureRelationship.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;

    public User(){

    }

    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
