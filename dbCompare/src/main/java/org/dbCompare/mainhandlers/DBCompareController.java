package org.dbCompare.mainhandlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBCompareController {

	@Autowired
	DBCompareService dbcService = new DBCompareService();
}
