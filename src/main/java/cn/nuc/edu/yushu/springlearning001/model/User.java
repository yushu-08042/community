package cn.nuc.edu.yushu.springlearning001.model;

import lombok.Data;

/**
 * @author: yushu
 * 2019/12/4 22:14
 * @description:
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private long getCreate;
    private long getModified;
    private String bio;
    private String avatarUrl;
}
