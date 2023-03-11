package com.oldlane.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oldlane.springbootinit.model.entity.InterfaceInfo;

/**
* @author lenovo
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-11 17:57:17
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
