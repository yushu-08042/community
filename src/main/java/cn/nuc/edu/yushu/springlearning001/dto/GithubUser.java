package cn.nuc.edu.yushu.springlearning001.dto;

import lombok.Data;

/**
 * @author: yushu
 * 2019/12/4 0:14
 * @description:
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;


}
