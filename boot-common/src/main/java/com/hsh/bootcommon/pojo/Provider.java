package com.hsh.bootcommon.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * (Provider)实体类
 *
 * @author makejava
 * @since 2025-08-12 14:49:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("smbms_provider")
public class Provider {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id; // 主键ID
    private String proCode; // 供应商编码
    private String proName; // 供应商名称
    private String proDesc; // 供应商详细描述
    private String proContact; // 供应商联系人
    private String proPhone; // 联系电话
    private String proAddress; // 地址
    private String proFax; // 传真
    private Long createdBy; // 创建者（userId）
    // @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")// 用户对象属性，控制入参时日期类型转换
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")// 返回JSON数据时日期类型处理
    private Date creationDate; // 创建时间
    // @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")// 用户对象属性，控制入参时日期类型转换
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")// 返回JSON数据时日期类型处理
    private Date modifyDate;  // 更新时间
    private Long modifyBy;  // 更新者（userId）
}
