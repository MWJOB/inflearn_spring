package com.example.springbasic.web;

import com.example.springbasic.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id){
//        MyLogger myLogger = myLoggerObjectProvider.getObject();
        myLogger.log("service id = " + id);

    }

}
