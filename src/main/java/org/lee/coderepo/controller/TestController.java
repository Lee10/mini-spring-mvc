package org.lee.coderepo.controller;

import org.apache.log4j.Logger;
import org.lee.coderepo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lee on 2017/2/25.
 */
@Controller
@RequestMapping("test")
public class TestController {

	@Resource
	private TestService testService;

	private final static Logger logger = Logger.getLogger(TestController.class);

	@ResponseBody
	@RequestMapping("add")
	public Map<String, Object> add(int a, int b){

		logger.info("enter add method");

		int sum = testService.add(a, b);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("sum", sum);
		resultMap.put("date", Calendar.getInstance().getTime());

		return resultMap;
	}

}
