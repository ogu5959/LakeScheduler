package com.kabang.LakeScheduler.entity;

import com.kabang.LakeScheduler.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {

    Users findByCnt( long cnt);
}

