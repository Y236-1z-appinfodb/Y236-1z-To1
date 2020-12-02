package cn.bdqn.appinfodb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 版本作者注释信息(也就是作者名)
 * @since 2020-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="DevUser对象", description="")
public class DevUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "开发者帐号")
    @TableField("devCode")
    private String devCode;

    @ApiModelProperty(value = "开发者名称")
    @TableField("devName")
    private String devName;

    @ApiModelProperty(value = "开发者密码")
    @TableField("devPassword")
    private String devPassword;

    @ApiModelProperty(value = "开发者电子邮箱")
    @TableField("devEmail")
    private String devEmail;

    @ApiModelProperty(value = "开发者简介")
    @TableField("devInfo")
    private String devInfo;

    @ApiModelProperty(value = "创建者（来源于backend_user用户表的用户id）")
    @TableField("createdBy")
    private Long createdBy;

    @ApiModelProperty(value = "创建时间")
    @TableField("creationDate")
    private Date creationDate;

    @ApiModelProperty(value = "更新者（来源于backend_user用户表的用户id）")
    @TableField("modifyBy")
    private Long modifyBy;

    @ApiModelProperty(value = "最新更新时间")
    @TableField("modifyDate")
    private Date modifyDate;


}
