package com.example.msstatus.service;

import com.example.msstatus.dto.StatusConsumerDto;
import com.example.msstatus.mapper.StatusMapper;
import com.example.msstatus.repository.StatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StatusService {
    private final StatusRepository statusRepository;
    private final StatusMapper statusMapper;

    public void saveStatus(StatusConsumerDto statusConsumerDto) {
        statusRepository.save(statusMapper.fromDto(statusConsumerDto));
    }
}
