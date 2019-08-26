package com.example.king.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.king.model.dto.CsBoardDTO;
import com.example.king.service.CsBoardService;

@Controller
public class CsBoardController {

	private static final Logger logger = LoggerFactory.getLogger(CsBoardController.class);
	
	//private static final String path = "";
	
	@Resource
	CsBoardService csboardService;
	
	@RequestMapping("csList")
	public ModelAndView main(ModelAndView mav)
	{
		mav.setViewName("csBoard/csList");
		List<CsBoardDTO> list = csboardService.list();
		
		logger.info("cs상담 list : "+list);
		mav.addObject("list", list);
		//mav.addObject("message", list);
		
		return mav;
	}
	@RequestMapping("csWrite")
	public String csWrite() {
		logger.info("cs상담 등록 확인");
		return "csBoard/csWrit";
		
	}
	
	@RequestMapping("csInsert")
	public ModelAndView csInsert(ModelAndView mav, CsBoardDTO csDto)
	{
		
		csDto.setEmail("king@naver.com");
		csDto.setUser_id("kimsu");
		csDto.setUser_name("김수");
		csDto.setHit(0);
		csDto.setPseq(1);
		csDto.setReply(0);
	    
		logger.info("cs상담 등록 : "+csDto);
		
		csboardService.insert(csDto);
		
		mav.setViewName("csBoard/csList");
		List<CsBoardDTO> list = csboardService.list();
		
		logger.info("cs상담 등록 list : "+list);
		mav.addObject("list", list);
		//mav.addObject("message", list);
		
		return mav;
	}
	
	@RequestMapping("csDetail")
	public ModelAndView csDetail(ModelAndView mav, String enroll_dt, int cs_board_no)
	{
		logger.info("등록일자 : "+enroll_dt);
		logger.info("등록일련번호 : "+cs_board_no);
		
		CsBoardDTO csDto = csboardService.detail(enroll_dt, cs_board_no);
		
		logger.info("cs상담 상세 : "+csDto);
		
		mav.setViewName("csBoard/csDetail");
		mav.addObject("csDto", csDto);
		//mav.addObject("message", list);
		
		return mav;
	}
	
	@RequestMapping("csUpdate")
	public ModelAndView csUpdate(ModelAndView mav, CsBoardDTO csDto)
	{
	    
		logger.info("cs상담 등록 : "+csDto);
		
		csboardService.update(csDto);
		
		;
		List<CsBoardDTO> list = csboardService.list();
		
		logger.info("cs상담 등록 list : "+list);
		mav.setViewName("csBoard/csList");
		mav.addObject("list", list);
		//mav.addObject("message", list);
		
		return mav;
	}
	@RequestMapping("csDeleteView")
	public ModelAndView csDeleteView(ModelAndView mav, String enroll_dt, int cs_board_no)
	{
		logger.info("등록일자 : "+enroll_dt);
		logger.info("등록일련번호 : "+cs_board_no);
		
		CsBoardDTO csDto = csboardService.detail(enroll_dt, cs_board_no);
		
		logger.info("cs상담 삭제 : "+csDto);
		
		mav.setViewName("csBoard/csDeleteView");
		mav.addObject("csDto", csDto);
		//mav.addObject("message", list);
		
		return mav;
	}
	@RequestMapping("csDelete")
	public ModelAndView csDelete(ModelAndView mav, CsBoardDTO csDto)
	{
	    
		logger.info("cs상담 등록 : "+csDto);
		
		csboardService.delete(csDto.getEnroll_dt(), csDto.getCs_board_no());
		
		List<CsBoardDTO> list = csboardService.list();
		
		logger.info("cs상담 등록 list : "+list);
		mav.setViewName("csBoard/csList");
		mav.addObject("list", list);
		//mav.addObject("message", list);
		
		return mav;
	}	
}
