package com.testbase;

import com.excel.utilities.Xls_Reader;

public class DataDriven {

	public static void main(String[] args) {
		Xls_Reader excelReader=new Xls_Reader("C:\\Users\\shreya\\Desktop\\MyNewProject\\dataDriven_FrameWork\\src\\com\\testdata\\Book1.xlsx");
		excelReader.getCellData("regData", "firstName", 2);
	}

}
