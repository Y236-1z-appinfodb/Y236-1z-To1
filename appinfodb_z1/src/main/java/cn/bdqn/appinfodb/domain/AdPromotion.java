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
@ApiModel(value="AdPromotion对象", description="")
public class AdPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "appId（来源于：app_info表的主键id）")
    @TableField("appId")
    private Long appId;

    @ApiModelProperty(value = "广告图片存储路径")
    @TableField("adPicPath")
    private String adPicPath;

    @ApiModelProperty(value = "广告点击量")
    @TableField("adPV")
    private Long adPV;

    @ApiModelProperty(value = "轮播位（1-n）")
    @TableField("carouselPosition")
    private Integer carouselPosition;

    @ApiModelProperty(value = "起效时间")
    @TableField("startTime")
    private Date startTime;

    @ApiModelProperty(value = "失效时间")
    @TableField("endTime")
    private Date endTime;

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
