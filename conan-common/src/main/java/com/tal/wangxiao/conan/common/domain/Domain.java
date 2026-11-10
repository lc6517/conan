package com.tal.wangxiao.conan.common.domain;


import com.tal.wangxiao.conan.utils.core.ConanBaseEntity;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import io.swagger.annotations.ApiModel;

/**
 * 域名信息对象 bss_domain
 * 
 * @author dengkunan
 * @date 2020-12-21
 */
@ApiModel
public class Domain extends ConanBaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 域名 */
   
    @ApiModelProperty("域名")
    private String name;

    /** 是否已上线(0-否，1-是) */
   
    @ApiModelProperty("是否已上线(0-否，1-是)")
    private Integer online;

    /** 是否需要鉴权(0-否，1-是) */
   
    @ApiModelProperty("是否需要鉴权(0-否，1-是)")
    private Integer isAuth;

    @ApiModelProperty(hidden = true, name = "部门名称")
    private String deptName;


    @ApiModelProperty("部门ID")
    private Integer sysDeptId;

    /** 数据源ID */
    @ApiModelProperty("数据源ID")
    private Long esSourceId;

    /** 线上环境域名 */
    @ApiModelProperty("线上环境域名")
    private String onlineDomain;

    /** 灰度环境域名 */
    @ApiModelProperty("灰度环境域名")
    private String grayDomain;

    /** 测试环境域名 */
    @ApiModelProperty("测试环境域名")
    private String testDomain;

    public Long getEsSourceId() {
        return esSourceId;
    }

    public void setEsSourceId(Long esSourceId) {
        this.esSourceId = esSourceId;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setOnline(Integer online) 
    {
        this.online = online;
    }

    public Integer getOnline() 
    {
        return online;
    }
    public void setIsAuth(Integer isAuth) 
    {
        this.isAuth = isAuth;
    }

    public Integer getIsAuth() 
    {
        return isAuth;
    }


    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setSysDeptId(Integer sysDeptId) {
        this.sysDeptId = sysDeptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public Integer getSysDeptId() {
        return sysDeptId;
    }

    public String getOnlineDomain() {
        return onlineDomain;
    }

    public void setOnlineDomain(String onlineDomain) {
        this.onlineDomain = onlineDomain;
    }

    public String getGrayDomain() {
        return grayDomain;
    }

    public void setGrayDomain(String grayDomain) {
        this.grayDomain = grayDomain;
    }

    public String getTestDomain() {
        return testDomain;
    }

    public void setTestDomain(String testDomain) {
        this.testDomain = testDomain;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("online", getOnline())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("isAuth", getIsAuth())
            .append("onlineDomain", getOnlineDomain())
            .append("grayDomain", getGrayDomain())
            .append("testDomain", getTestDomain())
            .toString();
    }
}