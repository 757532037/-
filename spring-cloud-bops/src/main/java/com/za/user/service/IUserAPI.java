package com.za.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.za.common.result.HLResult;
import com.za.user.dto.UserDTO;

/**
 * 这里提供rest风格请求<br>
 * 类IUserAPI.java的实现描述：TODO 类实现描述
 * 
 * @author huxuefeng 2018年5月15日 下午8:19:28
 */
@FeignClient("spring-userService")
@RequestMapping("/api/user")
public interface IUserAPI {
    @RequestMapping(value = "/findUserById/{id}", method = RequestMethod.GET)
    public HLResult<UserDTO> findUserById(@PathVariable("id") Long id);
}
