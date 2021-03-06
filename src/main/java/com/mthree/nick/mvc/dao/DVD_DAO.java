package com.mthree.nick.mvc.dao;

import com.mthree.nick.mvc.dto.DVD_DTO;

import java.util.HashMap;

public interface DVD_DAO {
    HashMap<String, DVD_DTO> list();
    DVD_DTO findByTitle(String title);
    void displayInformation(String title);
    void loadFromFile();
    void saveToFile();
    boolean insertDVD(String title);
    boolean updateDVD(String title);
    boolean deleteDVD(String title);
}
