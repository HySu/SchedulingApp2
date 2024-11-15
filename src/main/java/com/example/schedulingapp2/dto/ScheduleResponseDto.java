package com.example.schedulingapp2.dto;

import lombok.Getter;

@Getter
public class ScheduleResponseDto {

    private final String username;

    private final String task;

    private final String contents;

    public ScheduleResponseDto(Long id, String username, String task, String contents) {
        this.username = username;
        this.task = task;
        this.contents = contents;
    }
}
