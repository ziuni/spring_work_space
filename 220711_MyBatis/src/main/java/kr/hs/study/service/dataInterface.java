package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.DataBean;

public interface dataInterface {
	public void insert(DataBean bean);
	public List<DataBean> select();
	public void update(DataBean bean);
	public void delete(String data1);
}
