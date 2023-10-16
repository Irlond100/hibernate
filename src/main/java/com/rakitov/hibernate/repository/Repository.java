package com.rakitov.hibernate.repository;

import com.rakitov.hibernate.entity.Person;
import com.rakitov.hibernate.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, PersonId> {
    @Query("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
    List<Person> findByCityOfLiving(@Param("city") String city);

    @Query("SELECT p FROM Person p WHERE p.age < :age ORDER BY p.age")
    List<Person> findByAgeLessThanOrderByAge(@Param("age") int age);

    @Query("SELECT p FROM Person p WHERE p.name = :name AND p.surname = :surname")
    Optional<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}
