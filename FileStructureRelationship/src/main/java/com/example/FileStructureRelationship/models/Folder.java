package com.example.FileStructureRelationship.models;


import javax.persistence.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder  {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;


    @ManyToOne(mappedBy = "folder")
    private User user;

    @OneToMany(mappedBy = "folder")
    private List<Files> Collection;

    public Folder(){

    }

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
