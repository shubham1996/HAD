package com.had.handlers;

import com.google.gson.Gson;
import com.had.dao.HouseholdDAO;

/**
 * @author Akshat Shukla
 * @since February 2, 2016
 */
public class HouseholdHandler {
	public String getHouseholdData(Integer urtid) {
		HouseholdDAO houseHoldDAO = new HouseholdDAO(urtid);
		return new Gson().toJson(houseHoldDAO.getList());
    }

}
