package com.kabang.LakeScheduler;

import com.kabang.LakeScheduler.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private UsersService usersService;

    // 애플리케이션 시작 후 5초 후에 첫 실행, 1초마다 주기적으로 실행
    @Scheduled(initialDelay = 5000, fixedDelay = 5000)
    public void cronJob() {
        // 서비스 호출
        usersService.getUsers();
    }
}
