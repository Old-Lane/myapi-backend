package com.oldlane.springbootinit.model.dto.interfaceinfo;

import lombok.Data;

/**
 * @author oldlane
 * @date 2023/3/12 22:08
 */
@Data
public class InterfaceInfoInvokeRequest {
    /**
     * 主键
     */
    private Long id;

    /**
     * 请求参数
     */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;

}
