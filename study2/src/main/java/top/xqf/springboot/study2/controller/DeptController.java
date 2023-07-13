package top.xqf.springboot.study2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xqf.springboot.study2.base.BaseResult;
import top.xqf.springboot.study2.entity.TbDept;
import top.xqf.springboot.study2.service.DeptService;

import java.util.List;

@Api(tags = "部门管理")
@RestController
@RequestMapping("/dept")

public class DeptController {

    private final DeptService deptService;

    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @ApiOperation(value ="部门查询",notes = "部门查询功能接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptName",value = "部门名称模糊查询",dataTypeClass = String.class ,required = false)
    })
    @GetMapping("/queryAll")
    public BaseResult<List<TbDept>> query(TbDept dept) throws Exception{
        return deptService.query(dept);
    }

    @ApiOperation(value ="部门增加",notes = "部门增加功能接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptName",value = "部门名称",dataTypeClass = String.class ,required = false),
            @ApiImplicitParam(name = "deptInfo",value = "部门描述",dataTypeClass = String.class ,required = false)
    })
    @GetMapping("/add")
    public BaseResult<TbDept> add(TbDept dept) throws Exception{
        return deptService.add(dept);
    }

}
