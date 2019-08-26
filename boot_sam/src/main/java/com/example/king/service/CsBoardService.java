package com.example.king.service;

import java.util.List;

import com.example.king.model.dto.CsBoardDTO;

public interface CsBoardService {

    public List<CsBoardDTO> list();
    public void insert(CsBoardDTO dto);
    public CsBoardDTO detail(String dt, int no);
    public void update(CsBoardDTO dto);
    public void delete(String dt, int no);
}
