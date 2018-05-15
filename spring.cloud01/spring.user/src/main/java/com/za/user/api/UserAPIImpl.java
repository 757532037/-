package com.za.user.api;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.za.common.result.HLResult;
import com.za.user.dto.UserDTO;
import com.za.user.service.iface.IUserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserAPIImpl implements IUserAPI {

    @Resource
    private IUserService userService;

    public HLResult<UserDTO> findUserById(@PathVariable("id") Long id) {
        try {
            log.info("request{}", id);
            HLResult<UserDTO> hlResult = userService.findById(id);
            log.info("return{}", hlResult.getResult());
            return hlResult;
        } catch (Exception e) {
            log.error("findById{},args{}", e, id);
            return HLResult.fail("-1", e.getMessage());
        }
    }

}
