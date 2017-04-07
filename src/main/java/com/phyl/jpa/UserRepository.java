package com.phyl.jpa;

import com.phyl.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xh on 2017/4/6.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
