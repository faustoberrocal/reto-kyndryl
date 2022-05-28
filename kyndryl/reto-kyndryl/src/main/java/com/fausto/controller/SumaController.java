package com.fausto.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.fausto.entity.Suma;
import com.fausto.service.SumaService;

@RestController
@RequestMapping
public class SumaController {

	@Autowired
	SumaService sumaService;

    @RequestMapping(value = "/sumar/{sum01}/{sum02}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Map saludar(@PathVariable("sum01") Integer sum01, @PathVariable("sum02") Integer sum02) {
    	sumaService.insertSuma(new Suma(sum01, sum02, (sum01 + sum02)));
        return Collections.singletonMap("resultado", String.valueOf(sum01 + sum02));
    }

}
