package com.za.user.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.za.common.result.HLResult;
import com.za.user.dto.UserDTO;
import com.za.user.service.IUserAPI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/bops/user")
public class UserController {

    @Resource
    private IUserAPI iUserAPI;

    @ResponseBody
    @RequestMapping(value = "/findUserById/{id}")
    public HLResult<UserDTO> findUserById(@PathVariable(value = "id") Long id) {

        log.info("request{}", id);
        try {
            HLResult<UserDTO> hlResult = iUserAPI.findUserById(id);
            log.info("return{}", hlResult.getResult());
            return hlResult;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("findUserById{},args{}", e, id);
            return HLResult.fail("-1", e.getMessage());
        }

    }
}
