package top.xqf.springboot.study2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import top.xqf.springboot.study2.base.BaseResult;
import top.xqf.springboot.study2.entity.TbClass;
import top.xqf.springboot.study2.entity.TbDept;
import top.xqf.springboot.study2.service.ClassService;

import java.util.List;

@Api(tags = "班级管理")
@RestController
@RequestMapping("/class")

public class ClassController {
    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @ApiOperation(value ="班级查询",notes = "班级查询功能接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cname",value = "班级名称模糊查询",dataTypeClass = String.class ,required = false)
    })
    @GetMapping("/queryAll")
    public BaseResult<List<TbClass>> query(TbClass tbClass) throws Exception{
        return classService.query(tbClass);
    }

    @ApiOperation(value ="班级增加",notes = "班级增加功能接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cname",value = "班级名称",dataTypeClass = String.class ,required = false),
            @ApiImplicitParam(name = "cinfo",value = "班级描述",dataTypeClass = String.class ,required = false)
    })
    @GetMapping("/add")
    public BaseResult<TbClass> add(TbClass tbClass) throws Exception{
        return classService.add(tbClass);
    }

    @ApiOperation(value ="班级删除",notes = "班级删除功能接口，路径传播参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cId",value = "需要删除的班级编号",dataTypeClass = Integer.class ,required = true),
    })
    @DeleteMapping("/delete/{id}")
    public BaseResult<Integer> delete(@PathVariable(name="id") Integer id) throws Exception{
        TbClass tbClass=new TbClass();
        tbClass.setCid(id);
        return classService.delete(tbClass);
    }
}
