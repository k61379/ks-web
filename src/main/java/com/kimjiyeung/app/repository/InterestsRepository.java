package com.kimjiyeung.app.repository;

import com.kimjiyeung.app.entity.Interests;
import com.kimjiyeung.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestsRepository extends JpaRepository<Interests, String> {
}
