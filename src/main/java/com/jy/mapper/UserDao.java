package com.jy.mapper;

import com.jy.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("UserDao")
public interface UserDao {
     public User login(@Param("username") String username, @Param("password") String password);
//     int create (User user);
//     int delete (Map<String, Object> paramMap);
//     int update (Map<String, Object> paramMap);
//     List<User> query(Map<String, Object> paramMap);
//     User detail(Map<String, Object> paramMap);
//     int count(Map<String, Object> paramMap);

}
