package top.xqf.springboot.study2.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import top.xqf.springboot.study2.base.BaseResult;
import top.xqf.springboot.study2.dao.TbDeptDAO;
import top.xqf.springboot.study2.entity.TbDept;
import top.xqf.springboot.study2.service.DeptService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DeptServicelmpl implements DeptService {

    private final TbDeptDAO tbDeptDAO;

    public DeptServicelmpl(TbDeptDAO tbDeptDAO) {
        this.tbDeptDAO = tbDeptDAO;
    }

    @Override
    public BaseResult<List<TbDept>> query(TbDept dept) throws Exception{
        dept = Optional.ofNullable(dept).orElse(new TbDept());
        //部门名称的模糊查询
        if(StringUtils.hasText(dept.getDeptName())){
            dept.setDeptName(String.format("%%%s%%",dept.getDeptName()));
        }
        List<TbDept> list=tbDeptDAO.querAll(dept);
        BaseResult<List<TbDept>> result=new BaseResult<>();
        result.setCode(200);
        result.setSuccess(true);
        result.setData(list);
        result.setMessage("");
        return result;

    }

}
