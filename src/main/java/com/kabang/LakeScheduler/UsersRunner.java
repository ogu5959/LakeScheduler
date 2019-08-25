package com.kabang.LakeScheduler;

import com.kabang.LakeScheduler.domain.Users;
import com.kabang.LakeScheduler.entity.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsersRunner implements ApplicationRunner {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("__LAKE__ run() Start!!");

        // 객체를 생성
        Users users = new Users();
        users.setEmpno("vita");
        users.setCnt(3l);

        // INSERT
        usersRepository.save( users );

        // SELECT
        Optional<Users> byId = usersRepository.findById("vita");

        // 로그 출력
        System.out.println( "__LAKE__ byId : " + byId.toString() );

        Users byCnt = usersRepository.findByCnt(1);

        System.out.println( "__LAKE__ byCnt : " + byCnt);

    }
}
