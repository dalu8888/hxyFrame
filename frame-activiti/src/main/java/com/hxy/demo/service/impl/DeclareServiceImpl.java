package com.hxy.demo.service.impl;

import com.hxy.base.common.Constant;
import com.hxy.base.exception.MyException;
import com.hxy.base.page.Page;
import com.hxy.base.page.PageHelper;
import com.hxy.base.utils.StringUtils;
import com.hxy.base.utils.Utils;
import com.hxy.demo.dao.DeclareDao;
import com.hxy.demo.entity.DeclareEntity;
import com.hxy.demo.service.DeclareService;
import com.hxy.sys.entity.UserEntity;
import com.hxy.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service("declareService")
public class DeclareServiceImpl implements DeclareService {
	@Autowired
	private DeclareDao declareDao;
	
	@Override
	public DeclareEntity queryObject(String id){
		if(StringUtils.isEmpty(id)){
			new MyException("id不为空!");
		}
		return declareDao.queryObject(id);
	}
	
	@Override
	public List<DeclareEntity> queryList(Map<String, Object> map){
		return declareDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return declareDao.queryTotal(map);
	}
	
	@Override
	public void save(DeclareEntity leave){
		UserEntity currentUser = UserUtils.getCurrentUser();
		leave.setCode(Utils.getCode("D"));
		leave.setStatus(Constant.ActStauts.DRAFT.getValue());
		leave.setCreateId(currentUser.getId());
		leave.setCreateTime(new Date());
		leave.setId(Utils.uuid());
		leave.setStatus(Constant.ActStauts.DRAFT.getValue());
		leave.setUserId(UserUtils.getCurrentUserId());
		leave.setBapid(currentUser.getBapid());
		leave.setBaid(currentUser.getBaid());

		declareDao.save(leave);
	}
	
	@Override
	public void update(DeclareEntity leave){
		if(StringUtils.isEmpty(leave.getId())){
			throw new MyException("申请项目id不能为空");
		}
		leave.setUpdateId(UserUtils.getCurrentUserId());
		leave.setUpdateTime(new Date());
		declareDao.update(leave);
	}
	
	@Override
	public int delete(String id){
	    if(StringUtils.isEmpty(id)){
	        throw  new MyException("请假id不能为空");
        }
		return declareDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		declareDao.deleteBatch(ids);
	}

	@Override
	public Page<DeclareEntity> findPage(DeclareEntity declareEntity, int pageNum) {
		PageHelper.startPage(pageNum, Constant.pageSize);
		declareDao.queryList(declareEntity);
		return PageHelper.endPage();
	}

}
