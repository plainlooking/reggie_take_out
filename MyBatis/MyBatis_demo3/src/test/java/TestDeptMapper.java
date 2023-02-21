import com.luo.mybatis.mapper.DeptMapper;
import com.luo.mybatis.pojo.Dept;
import com.luo.mybatis.utils.SqlSessionUtils1;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestDeptMapper {
    @Test
     public void testGetDeptAndEmpByStepTow(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepTow = mapper.getDeptAndEmpByStepTow(1  );
        System.out.println(deptAndEmpByStepTow.getDeptName());
    }

    /**
     * 获取部门所以员工信息
     */
    @Test
    public void testGetDeptAndEmpByStepOne(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept empAndDeptByStepOne = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(empAndDeptByStepOne);
    }
}
