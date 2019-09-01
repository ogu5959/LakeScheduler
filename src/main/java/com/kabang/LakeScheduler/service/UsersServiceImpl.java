package com.kabang.LakeScheduler.service;

import com.kabang.LakeScheduler.domain.Users;
import com.kabang.LakeScheduler.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    public void getUsers() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);

        // SELECT
        Optional<Users> byId = usersRepository.findById("lake");

        // 로그 출력
        System.out.println("[" + strDate + "] " + byId.toString() );

    }
}
