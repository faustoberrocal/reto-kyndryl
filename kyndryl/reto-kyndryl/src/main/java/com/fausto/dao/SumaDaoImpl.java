package com.fausto.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.fausto.entity.Suma;
@Repository
public class SumaDaoImpl implements SumaDao{
	
	public SumaDaoImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
	NamedParameterJdbcTemplate template;  
        
	@Override
	public int insertSuma(Suma suma) {
		 final String sql = "insert into suma(sumando01, sumando02 , resultado) values(:sumando01,:sumando02,:resultado)";
	        KeyHolder holder = new GeneratedKeyHolder();
                SqlParameterSource param = new MapSqlParameterSource()
					.addValue("sumando01", suma.getSumando01())
					.addValue("sumando02", suma.getSumando02())
					.addValue("resultado", suma.getResultado());
	        return template.update(sql,param, holder);
	 
	}
	
		
}
