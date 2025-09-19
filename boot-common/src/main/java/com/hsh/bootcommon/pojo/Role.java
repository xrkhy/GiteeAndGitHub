package com.hsh.bootcommon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author xrkhy
 * @date 2025/8/15 19:04
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private Long id;//主键ID
    private String roleCode;//角色编码
    private String roleName;//角色名称
    private Long createdBy;// 创建者
    private LocalDateTime creationDate; //创建时间
    private Long modifyBy;// 修改者
    private LocalDateTime modifyDate; // 修改时间
    List<User> userList;
}
