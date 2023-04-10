package com.oldlane.springbootinit.service.impl;

import com.oldlane.myapicommon.service.InnerUserInterfaceInfoService;
import com.oldlane.springbootinit.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author oldlane
 * @date 2023/3/14 21:44
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invoke(interfaceInfoId, userId);
    }
}
