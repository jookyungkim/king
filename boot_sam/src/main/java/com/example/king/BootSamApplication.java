package com.example.king;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@MapperScan("com.example.king.model")
@SpringBootApplication
public class BootSamApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSamApplication.class, args);
	}
	
	// <bean>태그에 대응되는 코드 설정
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception
	{
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();		
		bean.setDataSource( (javax.sql.DataSource) dataSource);
		return bean.getObject();
	}
		
		
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory factory)
	{
		return new SqlSessionTemplate(factory);
	}
	/*
	@Bean
    public SpringSecurityDialect springSecurityDialect(){
        return new SpringSecurityDialect();
    }
    */

}
