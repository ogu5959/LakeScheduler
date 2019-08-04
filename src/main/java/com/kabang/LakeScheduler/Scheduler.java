package com.kabang.LakeScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import java.util.Date;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class Scheduler {

    // 애플리케이션 시작 후 5초 후에 첫 실행, 1초마다 주기적으로 실행
    @Scheduled(initialDelay = 5000, fixedDelay = 1000)
    public void cronJob() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Java Cron : " + strDate);
    }
}
