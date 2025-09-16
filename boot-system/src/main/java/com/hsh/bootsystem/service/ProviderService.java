package com.hsh.bootsystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsh.bootcommon.pojo.Provider;
import com.hsh.bootcommon.utils.ResultJSON;

/**
 * @author xrkhy
 * @date 2025/9/2 21:44
 * @description
 */
public interface ProviderService extends IService<Provider> {
    /**
     * 条件查询所有供应商
     * @param providerName  供应商名称
     * @param startDate 起始时间
     * @param endDate 结束时间
     * @return
     */
    ResultJSON queryAllProvider(String providerName, String startDate, String endDate,
                                Integer currentPage, Integer pageSize);

    /**
     * 添加供应商
     * @param provider
     * @return json字符串
     */
    ResultJSON addProvider(Provider provider);

    /**
     * 修改供应商
     * @param provider
     * @return json字符串
     */
    ResultJSON updateProvider(Provider provider);

    /**
     *  删除供应商
     * @param id
     * @return json字符串
     */
    ResultJSON delProvider(Long id);
}
