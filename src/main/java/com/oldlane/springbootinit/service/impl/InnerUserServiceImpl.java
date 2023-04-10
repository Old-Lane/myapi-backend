package com.oldlane.springbootinit.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.oldlane.myapicommon.model.entity.User;
import com.oldlane.myapicommon.service.InnerUserService;
import com.oldlane.springbootinit.common.ErrorCode;
import com.oldlane.springbootinit.exception.BusinessException;
import com.oldlane.springbootinit.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author oldlane
 * @date 2023/3/14 21:44
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return  userMapper.selectOne(queryWrapper);

    }
}
