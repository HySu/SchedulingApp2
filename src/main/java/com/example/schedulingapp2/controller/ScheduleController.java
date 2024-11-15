package com.example.schedulingapp2.controller;

import com.example.schedulingapp2.dto.ScheduleRequestDto;
import com.example.schedulingapp2.dto.ScheduleResponseDto;
import com.example.schedulingapp2.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/task")
    public ResponseEntity<ScheduleResponseDto> task(@RequestBody ScheduleRequestDto requestDto){
        ScheduleResponseDto scheduleResponseDto = scheduleService.save(
                requestDto.getUsername(), requestDto.getTitle(), requestDto.getContents()
        );

        return new ResponseEntity<>(scheduleResponseDto, HttpStatus.CREATED);
    }
}
