package com.example.schedulingapp2.repository;

import com.example.schedulingapp2.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
