package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.hs.study.dao.daoInterface;
import kr.hs.study.dto.DataBean;

public class dataInterfaceImpl implements dataInterface {

	@Autowired
	private daoInterface dao;
	
	public void insert(DataBean bean) {
		dao.insert(bean);

	}

	public List<DataBean> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}

	@Override
	public void update(DataBean bean) {
		dao.update(bean);
	}

	@Override
	public void delete(String data1) {
		dao.delete(data1);
	}

}
