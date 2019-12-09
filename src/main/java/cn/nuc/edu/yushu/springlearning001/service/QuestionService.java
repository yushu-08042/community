package cn.nuc.edu.yushu.springlearning001.service;

import cn.nuc.edu.yushu.springlearning001.dto.QuestionDTO;
import cn.nuc.edu.yushu.springlearning001.mapper.QuestionMapper;
import cn.nuc.edu.yushu.springlearning001.mapper.UserMapper;
import cn.nuc.edu.yushu.springlearning001.model.Question;
import cn.nuc.edu.yushu.springlearning001.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yushu
 * 2019/12/9 17:18
 * @description:
 */
@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;
    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOS = new ArrayList<>();
        for(Question question:questions){
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOS.add(questionDTO);
        }
        return questionDTOS;
    }
}
