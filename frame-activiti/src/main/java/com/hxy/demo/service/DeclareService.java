package com.hxy.demo.service;


import com.hxy.base.page.Page;
import com.hxy.demo.entity.DeclareEntity;

import java.util.List;
import java.util.Map;

/**
 * 请假流程测试
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2017-07-31 13:33:23
 */
public interface DeclareService {

	DeclareEntity queryObject(String id);
	
	List<DeclareEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(DeclareEntity leave);
	
	void update(DeclareEntity leave);
	
	int delete(String id);
	
	void deleteBatch(String[] ids);

	Page<DeclareEntity> findPage(DeclareEntity leaveEntity, int pageNum);
}
