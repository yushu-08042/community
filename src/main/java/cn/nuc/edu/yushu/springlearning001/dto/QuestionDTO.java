package cn.nuc.edu.yushu.springlearning001.dto;

import cn.nuc.edu.yushu.springlearning001.model.User;
import lombok.Data;

/**
 * @author: yushu
 * 2019/12/9 17:15
 * @description:
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tags;
    private long gmtCreate;
    private long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
