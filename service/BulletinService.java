package com.sparta.bulletin.service;

import com.sparta.bulletin.domain.Bulletin;
import com.sparta.bulletin.domain.BulletinRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BulletinService {
    private final BulletinRepository bulletinRepository;
}
