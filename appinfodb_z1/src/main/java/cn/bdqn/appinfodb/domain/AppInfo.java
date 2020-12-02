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
 * @since 2020-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AppInfo对象", description="")
public class AppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "软件名称")
    @TableField("softwareName")
    private String softwareName;

    @ApiModelProperty(value = "APK名称（唯一）")
    @TableField("APKName")
    private String APKName;

    @ApiModelProperty(value = "支持ROM")
    @TableField("supportROM")
    private String supportROM;

    @ApiModelProperty(value = "界面语言")
    @TableField("interfaceLanguage")
    private String interfaceLanguage;

    @ApiModelProperty(value = "软件大小（单位：M）")
    @TableField("softwareSize")
    private BigDecimal softwareSize;

    @ApiModelProperty(value = "更新日期")
    @TableField("updateDate")
    private Date updateDate;

    @ApiModelProperty(value = "开发者id（来源于：dev_user表的开发者id）")
    @TableField("devId")
    private Long devId;

    @ApiModelProperty(value = "应用简介")
    @TableField("appInfo")
    private String appInfo;

    @ApiModelProperty(value = "状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）")
    private Long status;

    @ApiModelProperty(value = "上架时间")
    @TableField("onSaleDate")
    private Date onSaleDate;

    @ApiModelProperty(value = "下架时间")
    @TableField("offSaleDate")
    private Date offSaleDate;

    @ApiModelProperty(value = "所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）")
    @TableField("flatformId")
    private Long flatformId;

    @ApiModelProperty(value = "所属三级分类（来源于：data_dictionary）")
    @TableField("categoryLevel3")
    private Long categoryLevel3;

    @ApiModelProperty(value = "下载量（单位：次）")
    private Long downloads;

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

    @ApiModelProperty(value = "所属一级分类（来源于：data_dictionary）")
    @TableField("categoryLevel1")
    private Long categoryLevel1;

    @ApiModelProperty(value = "所属二级分类（来源于：data_dictionary）")
    @TableField("categoryLevel2")
    private Long categoryLevel2;

    @ApiModelProperty(value = "LOGO图片url路径")
    @TableField("logoPicPath")
    private String logoPicPath;

    @ApiModelProperty(value = "LOGO图片的服务器存储路径")
    @TableField("logoLocPath")
    private String logoLocPath;

    @ApiModelProperty(value = "最新的版本id")
    @TableField("versionId")
    private Long versionId;


}
