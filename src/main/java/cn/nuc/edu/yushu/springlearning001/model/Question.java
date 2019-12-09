package cn.nuc.edu.yushu.springlearning001.model;

import lombok.Data;

/**
 * @author: yushu
 * 2019/12/8 19:07
 * @description:
 */
@Data
public class Question {
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

}
