package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Repository
public class daoInterfaceImpl implements dataInterface {

	@Autowired
	private SqlSessionTemplate session;
	
	public void insert(DataBean bean) {
		session.insert("test0712.insert_data", bean);

	}
	
	public List<DataBean> select() {
		return session.selectList("test0712.select_data");
	}

	@Override
	public void update(DataBean bean) {
		session.update("test0712.update_data", bean);
	}
	
	@Override
	public void delete(String data1) {
		session.delete("test.delete_data", data1);
	}

}
