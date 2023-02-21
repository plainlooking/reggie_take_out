import com.luo.mybatis.mapper.EmpMapper;
import com.luo.mybatis.pojo.Emp;
import com.luo.mybatis.utils.SqlSessionUtils1;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestEmpMapper {
    @Test
    public void testGetEmpAndDeptByStepOne(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByStepOne = mapper.getEmpAndDeptByStepOne(3);
        System.out.println(empAndDeptByStepOne.getEmpName());
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(empAndDeptByStepOne.getDept());
    }
    @Test
    public void testGetEmpAndDept(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDept = mapper.getEmpAndDept(3);
        System.out.println(empAndDept);
    }

    /**
     * 解决字段名和属性名不一致的情况：
     *
     */
    @Test
    public void testGetAllEmp(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
       allEmp.forEach(emp -> System.out.println(emp));
    }
}
