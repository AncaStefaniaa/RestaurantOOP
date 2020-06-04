package com.company.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.company.modules.Angajat;
import com.company.modules.Meniu;
import com.company.modules.Food;
import com.company.modules.Comanda;

public class MeniuRepository {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/restaurant";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD= "root";

    private static final String GET_ALL_MENUS = "SELECT * FROM meniuri";
    private static final String CREATE_NEW_MENU = "INSERT INTO meniuri(idMeniu,numarPagini,pretMeniu,tipMeniu)" +
            " values (?,?,?,?)";
    private static final String DELETE_MENU = "DELETE FROM meniuri WHERE idMeniu = ?";


    public static Connection getDbConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
    }

    public List<Meniu> getMeniuri() throws SQLException{
        List<Meniu> returnedList = new ArrayList<>();
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(GET_ALL_MENUS);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Meniu p = new Meniu(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getString(4));
            returnedList.add(p);
        }
        return returnedList;
    }

    public boolean addMeniu(Meniu p) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(CREATE_NEW_MENU);
        preparedStatement.setInt(1, p.getIdMeniu());
        preparedStatement.setInt(2, p.getNumarPagini());
        preparedStatement.setDouble(3, p.getPretMeniu());
        preparedStatement.setString(4, p.getTipMeniu());
        return preparedStatement.executeUpdate() > 0;
    }

    public boolean deleteMeniu(int idAngajat) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(DELETE_MENU);
        preparedStatement.setInt(1, idAngajat);
        return preparedStatement.executeUpdate() > 0;
    }
}


