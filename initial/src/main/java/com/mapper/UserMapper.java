package com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    List<Map> selectUserList(@Param("start") int start, @Param("limit") int limit);


    List<Map> selectUserListMap(Map<String, Object> params);


    int insertUser(Map<String, Object> params);

    int deleteUser(Map<String, Object> params);

    int updateUser(Map<String, Object> params);
}
