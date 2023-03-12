package com.oldlane.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 只需id请求
 *
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}