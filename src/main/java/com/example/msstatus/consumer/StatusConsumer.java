package com.example.msstatus.consumer;

import com.example.msstatus.dto.StatusConsumerDto;
import com.example.msstatus.service.StatusService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static com.example.msstatus.Text.LoggingText.ACCEPT_REQUEST_FROM_STATUS_CONSUMER;

@Component
@Slf4j
@RequiredArgsConstructor
public class StatusConsumer {
    private final StatusService statusService;
    private final ObjectMapper objectMapper;


    @KafkaListener(topics = {"#{'${app.kafka.consumer.topic}'.split(',')}"})
    public void receive(@Payload String message) throws Exception {
        log.info(ACCEPT_REQUEST_FROM_STATUS_CONSUMER, message);
        StatusConsumerDto statusConsumerDto = objectMapper.readValue(message, StatusConsumerDto.class);
        statusService.saveStatus(statusConsumerDto);
    }
}
