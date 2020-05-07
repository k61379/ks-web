package com.kimjiyeung.app.repository;

import com.kimjiyeung.app.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, String> {
}
