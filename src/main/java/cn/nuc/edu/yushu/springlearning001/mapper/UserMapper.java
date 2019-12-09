package cn.nuc.edu.yushu.springlearning001.mapper;

import cn.nuc.edu.yushu.springlearning001.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author: yushu
 * 2019/12/4 22:12
 * @description:
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(name, account_id, token, gmt_create, gmt_modified,bio,avatar_url) values (#{name},#{accountId},#{token}, #{getCreate}, #{getModified},#{bio},#{avatarUrl})")
    void insert(User user);
    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
    @Select("select * from user where id=#{id}")
    User findById(@Param("id") Integer creator);
}
