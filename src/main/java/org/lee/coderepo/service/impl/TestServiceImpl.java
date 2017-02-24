package org.lee.coderepo.service.impl;

import org.lee.coderepo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by lee on 2017/2/25.
 */
@Service
public class TestServiceImpl implements TestService {

	@Override
	public int add(int a, int b){
		return a + b;
	}
}
