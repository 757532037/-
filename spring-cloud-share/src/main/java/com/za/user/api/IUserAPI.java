package com.za.user.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.za.common.result.HLResult;
import com.za.user.dto.UserDTO;

/**
 * 对外 <br>
 * 类IUserAPI.java的实现描述：TODO 类实现描述<br>
 * <STRONG>提供接口<STRONG>
 * 
 * @author huxuefeng 2018年5月11日 下午2:59:27
 */
@RequestMapping("/api/user")
public interface IUserAPI {

    /**
     * 根据ID查询
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/findUserById/{id}", method = RequestMethod.GET)
    public HLResult<UserDTO> findUserById(@PathVariable("id") Long id);

    //    /**
    //     * 根据订单查询ID
    //     * 
    //     * @param id
    //     * @return
    //     */
    //    @RequestMapping(value = "/findOrderId/{id}", method = RequestMethod.GET)
    //    public HLResult<OrderDTO> findOrderId(@PathVariable(value = "id") Long id);
}
