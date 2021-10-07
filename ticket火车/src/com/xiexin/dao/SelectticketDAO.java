package com.xiexin.dao;

import com.xiexin.bean.Selectticket;
import com.xiexin.bean.SelectticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectticketDAO {
    long countByExample(SelectticketExample example);

    int deleteByExample(SelectticketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Selectticket record);

    int insertSelective(Selectticket record);

    List<Selectticket> selectByExample(SelectticketExample example);

    Selectticket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Selectticket record, @Param("example") SelectticketExample example);

    int updateByExample(@Param("record") Selectticket record, @Param("example") SelectticketExample example);

    int updateByPrimaryKeySelective(Selectticket record);

    int updateByPrimaryKey(Selectticket record);
}