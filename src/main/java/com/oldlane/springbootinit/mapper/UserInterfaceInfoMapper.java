package com.oldlane.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oldlane.myapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-03-12 23:23:21
* @Entity generator.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




