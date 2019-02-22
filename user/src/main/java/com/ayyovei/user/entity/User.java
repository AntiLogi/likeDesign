package com.ayyovei.user.entity;

import lombok.*;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/22
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class User {

    private int id;

    private String userName;

    private String nickName;

    private String mobile;

    private String password;

    private String email;


}
