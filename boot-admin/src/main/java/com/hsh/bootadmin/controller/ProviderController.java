package com.hsh.bootadmin.controller;

import com.hsh.bootcommon.pojo.Provider;
import com.hsh.bootcommon.utils.ResultJSON;
import com.hsh.bootsystem.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xrkhy
 * @date 2025/9/2 21:50
 * @description
 */
@RestController
@RequestMapping("/pro")
@CrossOrigin(origins = "http://localhost:8081")
public class ProviderController {
    @Resource
    ProviderService providerService;
    @RequestMapping("/providerList")
    public ResultJSON providerList(@RequestParam("proName") String proName,
                                   @RequestParam("startDate") String startDate,
                                   @RequestParam("endDate") String endDate,
                                   @RequestParam("currentPage") Integer currentPage,
                                   @RequestParam("pageSize") Integer pageSize) {
        return providerService.queryAllProvider(proName,startDate,endDate,currentPage,pageSize);
    }
    @PostMapping("/addProvider")
    public ResultJSON addProvider(@RequestBody Provider provider) {
        return providerService.addProvider(provider);
    }
    @PostMapping("/updateProvider")
    public ResultJSON updateProvider(@RequestBody Provider provider) {
        return providerService.updateProvider(provider);
    }
    @DeleteMapping("/delProvider/{id}")
    public ResultJSON delProvider(@PathVariable Long id) {
        return providerService.delProvider(id);
    }
}
