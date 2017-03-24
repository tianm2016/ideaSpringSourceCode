package org.sptest.service.Impl;
import org.springframework.stereotype.Service;
import org.sptest.po.User;
import org.sptest.service.IUserService;

/**
 * Created by Administrator on 2017/3/23 0023.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {


     public User getUser() {


        User user=new User();
        user.setUserId(10000);
        user.setUserName("系统管理员");
        return user ;
    }

}
