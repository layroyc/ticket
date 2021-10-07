package com.xiexin.service;

import com.xiexin.bean.Selectticket;
import com.xiexin.bean.SelectticketExample;
import com.xiexin.dao.SelectticketDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selectticketService")
public class SelectticketServiceImpl implements SelectticketService {
	@Autowired(required = false)
	private SelectticketDAO selectticketDAO;
	public long countByExample(SelectticketExample example){
    	return selectticketDAO.countByExample(example);
    }

	public int deleteByExample(SelectticketExample example){
    	return selectticketDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return selectticketDAO.deleteByPrimaryKey(id);
    }

	public int insert(Selectticket record){
    	return selectticketDAO.insert(record);
    }

	public int insertSelective(Selectticket record){
    	return selectticketDAO.insertSelective(record);
    }

	public List<Selectticket> selectByExample(SelectticketExample example){
    	return selectticketDAO.selectByExample(example);
    }

	public Selectticket selectByPrimaryKey(Integer id){
    	return selectticketDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Selectticket record, SelectticketExample example){
    	return selectticketDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Selectticket record, SelectticketExample example){
    	return selectticketDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Selectticket record){
    	return selectticketDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Selectticket record){
    	return selectticketDAO.updateByPrimaryKey(record);
    }


}
