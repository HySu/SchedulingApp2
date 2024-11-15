package com.example.schedulingapp2.service;

import com.example.schedulingapp2.dto.ScheduleResponseDto;
import com.example.schedulingapp2.entity.Schedule;
import com.example.schedulingapp2.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleResponseDto save(String username, String title, String contents) {

        Schedule schedule = new Schedule(username, title, contents);

        Schedule savedSchedule = scheduleRepository.save(schedule);

        return new ScheduleResponseDto(savedSchedule.getId(), savedSchedule.getUsername(), savedSchedule.getTitle(), savedSchedule.getContents());
    }
}
