package com.oldlane.springbootinit.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.oldlane.myapicommon.model.entity.InterfaceInfo;
import com.oldlane.myapicommon.service.InnerInterfaceInfoService;
import com.oldlane.springbootinit.common.ErrorCode;
import com.oldlane.springbootinit.exception.BusinessException;
import com.oldlane.springbootinit.mapper.InterfaceInfoMapper;
import com.oldlane.springbootinit.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author oldlane
 * @date 2023/3/14 21:43
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        if (StringUtils.isBlank(path)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", path).eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
