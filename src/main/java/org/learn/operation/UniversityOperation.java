package org.learn.operation;

import org.learn.entitiy.University;
import org.learn.service.UniversityService;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class UniversityOperation implements UniversityService {
    private static final Set<University> universities = new HashSet<>();

    @Override
    public void createUniversity(University university) {
        universities.add(university);
    }

    @Override
    public University getUniversity(Integer id) {
        return universities.stream().filter(university -> university.getId().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public void deleteUniversity(Integer id) {
        universities.removeIf(university -> university.getId().equals(id));
    }
}
