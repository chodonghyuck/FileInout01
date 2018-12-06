package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSe02 {

	List<String> strList;
	String strFileName;

	public UserSe02(String strFileName) {
		strList = new ArrayList();
		this.strFileName = strFileName;
	}

	public void readFile() {
		strFileName = "src/com/biz/files/우리말이름.txt";

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;
				strList.add(strRead);
			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end

	}

}
