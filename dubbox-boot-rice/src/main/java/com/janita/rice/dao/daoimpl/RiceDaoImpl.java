package com.janita.rice.dao.daoimpl;

import org.springframework.stereotype.Repository;

import com.janita.api.entity.RiceBean;
import com.janita.rice.dao.RiceDao;

@Repository
public class RiceDaoImpl implements RiceDao {

	@Override
	public RiceBean getRice(String money) {

		RiceBean rice = new RiceBean();
		rice.setRemark("rice remark");
		rice.setRiceMoney(money);
		rice.setRiceName("rice name");
		return rice;
	}

}
