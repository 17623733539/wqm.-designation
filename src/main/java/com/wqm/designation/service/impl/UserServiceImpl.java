package com.wqm.designation.service.impl;

import com.wqm.designation.dao.UserMapper;
import com.wqm.designation.entity.User;
import com.wqm.designation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: WangQiMing <br>
 * @createDate 2019/11/09 11:28 <br>
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getList() {
        return userMapper.selectList(null);

    }
}
