package com.example.king.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.example.king.model.dto.CsBoardDTO;

public interface CsBoardDAO {

   @Select("SELECT * FROM CS_BOARD ORDER BY 1 DESC, 2 DESC")
   public List<CsBoardDTO> list();
   
   @Select(" SELECT * "
   		    +" FROM CS_BOARD "
		    +" WHERE ENROLL_DT  = #{enroll_dt}"
		    +"  AND CS_BOARD_NO = #{cs_board_no}")
   public CsBoardDTO detail(String enroll_dt, int cs_board_no);
   
   @Insert("INSERT INTO CS_BOARD " 
   		+ " ( ENROLL_DT, CS_BOARD_NO, USER_ID, USER_NAME, EMAIL, SUBJECT, CONTENT, PSEQ, REPLY, HIT, ENROLLDATE) " 
   		+ " VALUES ("
   		+ "   TO_CHAR(SYSDATE, 'YYYYMMDD')" // enroll_dt 
   		+ " , (SELECT NVL(MAX(CS_BOARD_NO), 0) + 1 FROM CS_BOARD WHERE  ENROLL_DT = TO_CHAR(SYSDATE, 'YYYYMMDD'))"
   		+ " , #{user_id}"
   		+ " , #{user_name}"
   		+ " , #{email}"
   		+ " , #{subject}"
   		+ " , #{content}"
   		+ " , #{pseq}"
   		+ " , #{reply}"
   		+ " , #{hit}"
   		+ " , SYSDATE)")
   public void insert(CsBoardDTO dto);
   
   @Update("UPDATE CS_BOARD "
   		+ "    SET SUBJECT     = #{subject}"
   		+ "      , CONTENT     = #{content}"
   		+ "      , ENROLLDATE  = SYSDATE"
   		+ "  WHERE ENROLL_DT   = #{enroll_dt}" 
   		+ "	   AND CS_BOARD_NO = #{cs_board_no}"
   		)
   public void update(CsBoardDTO dto);
   
   @Delete("DELETE FROM CS_BOARD"
   		  + "     WHERE ENROLL_DT   = #{enroll_dt} "
   		  + "       AND CS_BOARD_NO = #{cs_board_no}")
   public void delete(String enroll_dt, int cs_board_no);
}
