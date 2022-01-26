package com.sparta.bulletin.controller;


import com.sparta.bulletin.domain.Bulletin;
import com.sparta.bulletin.domain.BulletinRepository;
import com.sparta.bulletin.domain.BulletinRequestDto;
import com.sparta.bulletin.service.BulletinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BulletinController {
    private final BulletinRepository bulletinRepository;
    private final BulletinService bulletinService;

    @PostMapping("/api/bulletins")
    public Bulletin createBulletin(@RequestBody BulletinRequestDto requestDto) {
        Bulletin bulletin = new Bulletin(requestDto);
        return bulletinRepository.save(bulletin);
    }

    @GetMapping("/api/bulletins")
    public List<Bulletin> getBulletins() {
        return bulletinRepository.findAllByOrderByModifiedAtDesc();
    }

    @DeleteMapping("/api/bulletins/{id}")
    public Long deleteBulletin(@PathVariable Long id) {
        bulletinRepository.deleteById(id);
        return id;
    }
}

