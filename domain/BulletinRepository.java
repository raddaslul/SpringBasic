package com.sparta.bulletin.domain;

import com.sparta.bulletin.domain.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BulletinRepository extends JpaRepository<Bulletin, Long> {
    List<Bulletin> findAllByOrderByModifiedAtDesc();
}