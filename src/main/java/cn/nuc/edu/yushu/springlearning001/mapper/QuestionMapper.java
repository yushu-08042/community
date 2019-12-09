package cn.nuc.edu.yushu.springlearning001.mapper;

import cn.nuc.edu.yushu.springlearning001.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: yushu
 * 2019/12/8 19:06
 * @description:
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description ,gmt_create, gmt_modified, creator, tags) values(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tags})")
    public void create(Question question);
    @Select("select * from question")
    List<Question> list();
}
