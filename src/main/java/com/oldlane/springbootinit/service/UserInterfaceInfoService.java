package com.oldlane.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oldlane.springbootinit.model.entity.UserInterfaceInfo;

/**
* @author lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-03-12 23:23:21
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 统计调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invoke(long interfaceInfoId, long userId);
}
