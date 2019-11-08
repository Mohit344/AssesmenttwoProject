package com.atmecs.qa.dataprovider;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.qa.configuration.FileConstant;
import com.atmecs.qa.helper.CommonUtility;

public class ValidatingData {
	 CommonUtility common = new CommonUtility();
	 Properties Property;
	
	/**
	 * In this constructor, reading of property file is being done
	 */
	public ValidatingData() {
		try {
			
			Property=common.propertyFileLoad(FileConstant.validationFile);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	/**
	 * In this method, validation data from the property file is taken
	 * 
	 * @param key
	 */
	public  String getValidatingData(String key) {
		String value = Property.getProperty(key);
		return value;
	}

}
