package top.xqf.springboot.study2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
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

    @ApiOperation(value ="部门增加",notes = "部门增加功能接口,json格式提交演示")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptName",value = "部门名称",dataTypeClass = String.class ,required = true),
            @ApiImplicitParam(name = "deptInfo",value = "部门描述",dataTypeClass = String.class ,required = true)
    })
    @PostMapping("/add")
    public BaseResult<TbDept> add(@RequestBody TbDept dept) throws Exception{
        return deptService.add(dept);
    }


    @ApiOperation(value ="部门删除",notes = "部门删除功能接口，路径传播参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptId",value = "需要删除的部门编号",dataTypeClass = Integer.class ,required = true),
    })
    @DeleteMapping("/delete/{id}")
    public BaseResult<Integer> delete(@PathVariable(name="id") Integer id) throws Exception{
        TbDept dept=new TbDept();
        dept.setDeptId(id);
        return deptService.delete(dept);
    }
}
