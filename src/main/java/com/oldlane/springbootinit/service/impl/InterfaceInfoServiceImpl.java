package com.oldlane.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oldlane.myapicommon.model.entity.InterfaceInfo;
import com.oldlane.springbootinit.common.ErrorCode;
import com.oldlane.springbootinit.exception.BusinessException;
import com.oldlane.springbootinit.exception.ThrowUtils;
import com.oldlane.springbootinit.mapper.InterfaceInfoMapper;
import com.oldlane.springbootinit.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @description 针对表【interface_info(接口信息)】的数据库操作Service实现
 * @createDate 2023-03-11 17:57:17
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }

}




