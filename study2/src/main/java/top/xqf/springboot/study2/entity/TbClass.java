package top.xqf.springboot.study2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "班级信息" , description = "班级信息应答对象")
public class TbClass implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "班级编号，主键",example = "1")
    @ApiParam(hidden = true)
    private int cid;
    @ApiModelProperty(value = "班级名称",example = "一班")
    @ApiParam(hidden = true)
    private String cname;
    @ApiModelProperty(value = "班级描述",example = "一般")
    @ApiParam(hidden = true)
    private String cinfo;
    @ApiModelProperty(value = "班级建立时间",example = "")
    @ApiParam(hidden = true)
    private Date lastupdate;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCinfo() {
        return cinfo;
    }

    public void setCinfo(String cinfo) {
        this.cinfo = cinfo;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public String toString() {
        return "TbClass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cinfo='" + cinfo + '\'' +
                ", lastupdate=" + lastupdate +
                '}';
    }
}
