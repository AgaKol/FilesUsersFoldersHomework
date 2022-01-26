package com.codeclan.example.UsersHomework.components;

import com.codeclan.example.UsersHomework.models.File;
import com.codeclan.example.UsersHomework.models.Folder;
import com.codeclan.example.UsersHomework.models.User;
import com.codeclan.example.UsersHomework.repositories.FileRepository;
import com.codeclan.example.UsersHomework.repositories.FolderRepository;
import com.codeclan.example.UsersHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {

        User user1 = new User("Jane");
        userRepository.save(user1);

        User user2 = new User("Mary");
        userRepository.save(user2);

        User user3 = new User("James");
        userRepository.save(user3);

        Folder folder1 = new Folder("folder one", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("folder two", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("folder three", user2);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("folder four", user2);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("folder five", user3);
        folderRepository.save(folder5);

        Folder folder6 = new Folder("folder six", user3);
        folderRepository.save(folder6);

        File file1 = new File("file one", "txt", 20, folder1);
        fileRepository.save(file1);

        File file2 = new File("file two", "java", 50, folder1);
        fileRepository.save(file2);

        File file3 = new File("file three", "txt", 20, folder2);
        fileRepository.save(file3);

        File file4 = new File("file four", "java", 50, folder2);
        fileRepository.save(file4);

        File file5 = new File("file five", "txt", 20, folder3);
        fileRepository.save(file5);

        File file6 = new File("file six", "java", 50, folder3);
        fileRepository.save(file6);

        File file7 = new File("file seven", "txt", 20, folder4);
        fileRepository.save(file7);

        File file8 = new File("file eight", "java", 50, folder4);
        fileRepository.save(file8);

        File file9 = new File("file nine", "txt", 20, folder5);
        fileRepository.save(file9);

        File file10 = new File("file ten", "java", 50, folder5);
        fileRepository.save(file10);

        File file11 = new File("file eleven", "txt", 20, folder6);
        fileRepository.save(file11);

        File file12 = new File("file twelve", "java", 50, folder6);
        fileRepository.save(file12);


    }
}
