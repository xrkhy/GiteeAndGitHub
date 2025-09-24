package com.hsh.bootadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 由于com.hsh.bootsystem.service中的@Service注解，
// 无法扫到所以使用scanBasePackages属性扫包,并且之前的扫包会失效
// 还需添加"com.hsh.bootadmin.controller"
@SpringBootApplication(scanBasePackages = {"com.hsh.bootsystem.service"
        ,"com.hsh.bootadmin.controller"})
// 扫描mapper包 如果有多个mapper则使用@MapperScan("com.hsh.**.mapper")
@MapperScan("com.hsh.bootsystem.mapper")
public class BootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class, args);
    }

}
