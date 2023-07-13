package top.xqf.springboot.study2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xqf.springboot.study2.dao.TbClassDAO;
import top.xqf.springboot.study2.dao.TbDeptDAO;
import top.xqf.springboot.study2.entity.TbClass;
import top.xqf.springboot.study2.entity.TbDept;

import java.util.List;
import java.util.Random;

@SpringBootTest
public class DaoTest {
    private static Logger logger= LoggerFactory.getLogger(DaoTest.class);

    //生成随机数
    private static Random random=new Random();
    @Autowired
    private TbDeptDAO tbDeptDAO;
    @Autowired
    private TbClassDAO tbClassDAO;


    @Test
    public void one() throws Exception{
        List<TbDept> list = tbDeptDAO.querAll(new TbDept());
        for (TbDept dept:list) {
            logger.debug("{}",dept);
        }
    }

    @Test
    public void two() throws Exception{
     TbDept dept = new TbDept();
     dept.setDeptName("部门"+random.nextInt(10000));
     dept.setDeptInfo("部门描述");
     int result=tbDeptDAO.add(dept);
     logger.debug("{},{}",result,dept);
    }

    @Test
    public void ClassAll() throws Exception{
        List<TbClass> list = tbClassDAO.queryAll(new TbClass());
        for (TbClass tbClass:list) {
            logger.debug("{}",tbClass);
        }
    }
    @Test
    public void ClassAdd() throws Exception{
        TbClass tbClass = new TbClass();
        tbClass.setCname("班级"+random.nextInt(10000));
        tbClass.setCinfo("班级描述");
        int result=tbClassDAO.add(tbClass);
        logger.debug("{},{}",result,tbClass);
    }
}
