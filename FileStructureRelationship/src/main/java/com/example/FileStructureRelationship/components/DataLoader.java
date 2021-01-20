package com.example.FileStructureRelationship.components;

import com.example.FileStructureRelationship.models.Folder;
import com.example.FileStructureRelationship.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

public class DataLoader {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        File artwork = new File("Masterpiece", "png", 8000, folderOne);
        fileRepository.save(artwork);
    }

    public void run(ApplicationArguments args){
        File planner = new File("Weekly Plan", "docx", 1, folderOne);
        fileRepository.save(planner);
    }

    public void run(ApplicationArguments args){
        File photo = new File("Panorama", "jpg", 4500, folderTwo);
        fileRepository.save(photo);
    }

    public void run(ApplicationArguments args) {
        File answerKey = new File("Top Secret", "pdf", 1500, folderTwo);
        fileRepository.save(answerKey);
    }

    public void run(ApplicationArguments args) {
        User one = new User("Bill");
        fileRepository.save(one);
    }

    public void run(ApplicationArguments args) {
        User two = new User("Sue");
        fileRepository.save(two);
    }

    public void run(ApplicationArguments args) {
        Folder folderOne = new Folder("Folder One");
        fileRepository.save(folderOne);
    }

    public void run(ApplicationArguments args) {
        Folder folderTwo = new Folder("Folder Two");
        fileRepository.save(folderTwo);
    }

}
