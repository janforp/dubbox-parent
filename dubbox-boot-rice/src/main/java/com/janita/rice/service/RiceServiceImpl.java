package com.janita.rice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janita.api.entity.RiceBean;
import com.janita.api.service.IRiceService;
import com.janita.rice.dao.RiceDao;
@Service("riceService")
public class RiceServiceImpl implements IRiceService {

	@Autowired
	private RiceDao riceDao;
	
	@Override
	public RiceBean getRiceToEat(String money) {
		return riceDao.getRice(money);
	}

}
