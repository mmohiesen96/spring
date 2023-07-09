package org.learn.service;

import org.learn.entitiy.University;

public interface UniversityService {
    void createUniversity(University university);

    University getUniversity(Integer id);

    void deleteUniversity(Integer id);
}
