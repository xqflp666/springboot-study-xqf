package top.xqf.springboot.study2.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import top.xqf.springboot.study2.base.BaseResult;
import top.xqf.springboot.study2.dao.TbClassDAO;
import top.xqf.springboot.study2.entity.TbClass;
import top.xqf.springboot.study2.service.ClassService;

import java.util.List;
import java.util.Optional;

@Service //将该类声明为service类
@Transactional(rollbackFor = Exception.class)
public class ClassServiceImpl implements ClassService {
    private final TbClassDAO tbClassDAO;

    public ClassServiceImpl(TbClassDAO tbClassDAO) {
        this.tbClassDAO = tbClassDAO;
    }

    @Override
    public BaseResult<List<TbClass>> query(TbClass tbClass) throws Exception {
        tbClass = Optional.ofNullable(tbClass).orElse(new TbClass());
        //班级名称的模糊查询
        if (StringUtils.hasText(tbClass.getCname())) {
            tbClass.setCname(String.format("%%%s%%", tbClass.getCname()));
        }
        List<TbClass> list = tbClassDAO.queryAll(tbClass);
        BaseResult<List<TbClass>> result = new BaseResult<>();
        result.setCode(200);
        result.setSuccess(true);
        result.setData(list);
        result.setMessage("");
        return result;
    }


    @Override
    public BaseResult<TbClass> add(TbClass tbClass) throws Exception{
        BaseResult<TbClass> result=new BaseResult<>();
        int n=tbClassDAO.add(tbClass);
        if(n!=1){
            result.setCode(500);
            result.setSuccess(false);
            result.setMessage("添加失败");
            result.setData(null);
            return result;
        }
        result.setCode(200);
        result.setSuccess(true);
        result.setMessage("添加成功");
        result.setData(tbClass);
        return result;
    }

    @Override
    public BaseResult<Integer> delete(TbClass tbClass) throws Exception{
        int count=tbClassDAO.delete(tbClass);
        BaseResult<Integer> result=new BaseResult<>();
        result.setCode(count==1?200:500);
        result.setSuccess(count==1);
        result.setMessage(count==1?"删除成功":"删除失败");
        result.setData(count);
        return result;
    }

}
