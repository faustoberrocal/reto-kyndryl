package com.fausto.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.fausto.dao.SumaDao;
import com.fausto.entity.Suma;
@Component
public class SumaServiceImpl implements SumaService{
	@Resource 
	SumaDao sumaDao;
        
	@Override
	public int insertSuma(Suma suma) {
		return sumaDao.insertSuma(suma);
	}
}
