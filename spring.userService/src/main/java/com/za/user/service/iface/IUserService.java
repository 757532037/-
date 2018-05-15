package com.za.user.service.iface;

import com.za.common.result.HLResult;
import com.za.user.dto.UserDTO;

public interface IUserService {

    public HLResult<UserDTO> findById(Long id);

}
