package com.example;

import com.example.bean.User;
import com.example.mapper.UserMapper;
import com.example.sqlSession.MySqlsession;

public class TestMybatis {
	
    public static void main(String[] args) {  
        MySqlsession sqlsession=new MySqlsession();  
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);  
        User user = mapper.getUserById("2");  
        System.out.println(user);
    } 

}
