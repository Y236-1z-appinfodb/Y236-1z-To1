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
@ApiModel(value="DataDictionary对象", description="")
public class DataDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "类型编码")
    @TableField("typeCode")
    private String typeCode;

    @ApiModelProperty(value = "类型名称")
    @TableField("typeName")
    private String typeName;

    @ApiModelProperty(value = "类型值ID")
    @TableField("valueId")
    private Long valueId;

    @ApiModelProperty(value = "类型值Name")
    @TableField("valueName")
    private String valueName;

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
