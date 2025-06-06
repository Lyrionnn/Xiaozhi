package com.atiguigu.java.ai.langchain4j.service;

import com.atiguigu.java.ai.langchain4j.entity.Appointment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

public interface AppointmentService extends IService<Appointment> {

    Appointment getOne(Appointment appointment);
}
