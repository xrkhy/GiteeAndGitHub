package com.hsh.bootsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsh.bootcommon.pojo.Provider;
import com.hsh.bootcommon.utils.ResultJSON;
import com.hsh.bootsystem.mapper.ProviderMapper;
import com.hsh.bootsystem.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author xrkhy
 * @date 2025/9/2 21:45
 * @description
 */
@Service
public class ProviderServiceImpl extends ServiceImpl<ProviderMapper, Provider> implements ProviderService {
    @Autowired
    @Qualifier("providerMapper")
    private ProviderMapper providerMapper;
    @Override
    // 分页查询
    public ResultJSON queryAllProvider(String providerName,
                                       String startDate,
                                       String endDate,
                                       Integer currentPage,
                                       Integer pageSize) {
        System.out.println("providerName:"+providerName);
        System.out.println("startDate:"+startDate);
        System.out.println("endDate:"+endDate);

        //mybatisplus分页
            Page<Provider> page = new Page<>(currentPage,pageSize);

        // 创建查询条件
        QueryWrapper<Provider> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(providerName != null && !providerName.isEmpty() , "proName", providerName);
        queryWrapper.ge(startDate != null && !startDate.isEmpty(), "creationDate", startDate);
        queryWrapper.le(endDate != null && !endDate.isEmpty(), "creationDate", endDate);

        // 调用
        Page<Provider> providerPage = providerMapper.selectPage(page, queryWrapper);
        return ResultJSON.success(providerPage);
    }


    @Override
    public ResultJSON addProvider(Provider provider) {
        System.out.println(provider);
        return ResultJSON.successORerror(providerMapper.insert(provider));
    }

    @Override
    public ResultJSON updateProvider(Provider provider) {
        System.out.println(provider);
        return ResultJSON.successORerror(providerMapper.updateById(provider));
    }

    @Override
    public ResultJSON delProvider(Long id) {

        return ResultJSON.successORerror(providerMapper.deleteById(id));
    }
}
