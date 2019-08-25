package com.kabang.LakeScheduler;

import com.kabang.LakeScheduler.domain.Users;
import com.kabang.LakeScheduler.entity.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import java.util.Date;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Optional;

@Component
public class Scheduler {

    @Autowired
    UsersRepository usersRepository;

    // 애플리케이션 시작 후 5초 후에 첫 실행, 1초마다 주기적으로 실행
    @Scheduled(initialDelay = 5000, fixedDelay = 5000)
    public void cronJob() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);

        // SELECT
        Optional<Users> byId = usersRepository.findById("lake");

        // 로그 출력
        System.out.println("[" + strDate + "] " + byId.toString() );
    }
}
