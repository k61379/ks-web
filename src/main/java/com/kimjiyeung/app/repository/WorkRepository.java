package com.kimjiyeung.app.repository;

import com.kimjiyeung.app.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Long> {
}
