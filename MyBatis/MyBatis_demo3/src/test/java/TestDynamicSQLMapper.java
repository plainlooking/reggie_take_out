import com.luo.mybatis.mapper.DynamicSQLMapper;
import com.luo.mybatis.pojo.Emp;
import com.luo.mybatis.utils.SqlSessionUtils1;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestDynamicSQLMapper {
    @Test
    public void testInsertMoreList(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"余斌",20,"男","123@163.com");
        Emp emp1 = new Emp(null,"余一帆",21,"男","123@qq.com");
        Emp emp2 = new Emp(null,"余黑皮",21,"男","123@qq.com");
        List<Emp> emps = Arrays.asList(emp,emp1,emp2);
        int i = mapper.insertMoreList(emps);
        System.out.println(i);
    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.deleteMoreByArray(new Integer[]{6, 7, 8});
        System.out.println(i);
    }

    @Test
    public void testChoose(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> choose = mapper.Choose(new Emp(null, null, null, null, null));
        System.out.println(choose);
    }

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByCondition(new Emp(null, "王五", 20, "", null));
        empByCondition.forEach(emp -> System.out.println(emp));
    }
}
