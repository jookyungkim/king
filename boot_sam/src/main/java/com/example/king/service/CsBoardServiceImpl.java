package com.example.king.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.king.model.dao.CsBoardDAO;
import com.example.king.model.dto.CsBoardDTO;

@Service
public class CsBoardServiceImpl implements CsBoardService {

	
	@Resource
	CsBoardDAO csboardDao;
	
	@Override
	public List<CsBoardDTO> list() {
		// TODO Auto-generated method stub
		return csboardDao.list();
	}

	@Override
	public void insert(CsBoardDTO dto) {
		// TODO Auto-generated method stub
		csboardDao.insert(dto);

	}

	@Override
	public CsBoardDTO detail(String dt, int no) {
		// TODO Auto-generated method stub
		return csboardDao.detail(dt, no);
	}

	@Override
	public void update(CsBoardDTO dto) {
		// TODO Auto-generated method stub
		csboardDao.update(dto);
	}

	@Override
	public void delete(String dt, int no) {
		// TODO Auto-generated method stub
		csboardDao.delete(dt, no);
	}

}
