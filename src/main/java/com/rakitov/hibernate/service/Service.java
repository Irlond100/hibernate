package com.rakitov.hibernate.service;

import com.rakitov.hibernate.entity.Person;
import com.rakitov.hibernate.repository.Repository;


import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
