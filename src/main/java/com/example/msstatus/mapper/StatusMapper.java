package com.example.msstatus.mapper;

import com.example.msstatus.dto.StatusConsumerDto;
import com.example.msstatus.entity.Status;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StatusMapper {

    @Mapping(source = "clientUserId", target = "clientUserId")
    @Mapping(source = "doctorId", target = "doctorId")
    @Mapping(source = "dateCreateSchedule", target = "dateCreateSchedule")
    @Mapping(source = "dateOperation", target = "dateOperation")
    @Mapping(source = "status", target = "status")
    Status fromDto(StatusConsumerDto dto);

}
