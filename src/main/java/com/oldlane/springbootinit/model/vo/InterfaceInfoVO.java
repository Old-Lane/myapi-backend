package com.oldlane.springbootinit.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oldlane.myapicommon.model.entity.InterfaceInfo;
import com.oldlane.springbootinit.model.entity.Post;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 帖子视图
 *
 */
@Data
public class InterfaceInfoVO extends InterfaceInfo implements Serializable {

    private final static Gson GSON = new Gson();

    /**
     * 调用次数
     */
    private Integer totalNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
