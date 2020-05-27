package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.maskmanage.entity.supervisor;
import com.maskmanage.entity.supervisorExample;

public interface supervisorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int countByExample(supervisorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByExample(supervisorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByPrimaryKey(Integer supid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insert(supervisor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insertSelective(supervisor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    List<supervisor> selectByExample(supervisorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    supervisor selectByPrimaryKey(Integer supid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") supervisor record, @Param("example") supervisorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExample(@Param("record") supervisor record, @Param("example") supervisorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKeySelective(supervisor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervisor
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKey(supervisor record);
}