package chapter13.mvc.dao;

import chapter13.mvc.pojo.User;

/**
 * Created by qingyuan on 6/7/17.
 */
public interface UserMapper {
    int deleteByPrimaryKey(String operId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String operId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
