package top.xqf.springboot.study2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
