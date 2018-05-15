package com.za.order.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.za.common.result.HLResult;
import com.za.order.dto.OrderDTO;

/**
 * 前置使用接口<br>
 * 类IOrderApi.java的实现描述：TODO 类实现描述
 * 
 * @author huxuefeng 2018年5月11日 下午2:48:55
 */
@RequestMapping("/api/order")
public interface IOrderAPI {

    /**
     * 根据ID查询
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public HLResult<OrderDTO> findById(@PathVariable("id") Long id);

    /**
     * 根据实体查询
     * 
     * @param orderDTO
     * @return
     */
    @RequestMapping(value = "/findByDTO", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
    public HLResult<OrderDTO> findByDTO(@RequestBody OrderDTO orderDTO);
}
