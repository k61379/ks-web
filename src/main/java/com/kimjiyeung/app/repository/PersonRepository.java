package com.kimjiyeung.app.repository;


import com.kimjiyeung.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
