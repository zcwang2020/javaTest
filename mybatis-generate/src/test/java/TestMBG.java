import com.test.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author wzc
 * @Date 2022/9/3
 */
public class TestMBG {
    @Test
    public void testMBG() {
        /*SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("张三");
        List<Emp> emps = mapper.selectByExample(empExample);
        System.out.println("emps = " + emps);*/
    }
}
