package cn.bdqn.appinfodb.domain;

import java.math.BigDecimal;
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
 * @since 2020-12-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AppVersion对象", description="")
public class AppVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "appId（来源于：app_info表的主键id）")
    @TableField("appId")
    private Long appId;

    @ApiModelProperty(value = "版本号")
    @TableField("versionNo")
    private String versionNo;

    @ApiModelProperty(value = "版本介绍")
    @TableField("versionInfo")
    private String versionInfo;

    @ApiModelProperty(value = "发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）")
    @TableField("publishStatus")
    private Long publishStatus;

    @ApiModelProperty(value = "下载链接")
    @TableField("downloadLink")
    private String downloadLink;

    @ApiModelProperty(value = "版本大小（单位：M）")
    @TableField("versionSize")
    private BigDecimal versionSize;

    @ApiModelProperty(value = "创建者（来源于dev_user开发者信息表的用户id）")
    @TableField("createdBy")
    private Long createdBy;

    @ApiModelProperty(value = "创建时间")
    @TableField("creationDate")
    private Date creationDate;

    @ApiModelProperty(value = "更新者（来源于dev_user开发者信息表的用户id）")
    @TableField("modifyBy")
    private Long modifyBy;

    @ApiModelProperty(value = "最新更新时间")
    @TableField("modifyDate")
    private Date modifyDate;

    @ApiModelProperty(value = "apk文件的服务器存储路径")
    @TableField("apkLocPath")
    private String apkLocPath;

    @ApiModelProperty(value = "上传的apk文件名称")
    @TableField("apkFileName")
    private String apkFileName;


}
