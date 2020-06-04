package com.company.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.company.modules.Angajat;
import com.company.modules.Meniu;
import com.company.modules.Food;
import com.company.modules.Comanda;

public class AngajatRepository {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/restaurant";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD= "root";

    private static final String GET_ALL_PEOPLE = "SELECT * FROM angajati";
    private static final String CREATE_NEW_PERSON = "INSERT INTO angajati(idAngajat,numeAngajat,prenumeAngajat,manager,tipAngajat)" +
            " values (?,?,?,?,?)";
    private static final String DELETE_PERSON = "DELETE FROM angajati WHERE idAngajat = ?";


    public static Connection getDbConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
    }

    public List<Angajat> getAngajati() throws SQLException{
        List<Angajat> returnedList = new ArrayList<>();
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(GET_ALL_PEOPLE);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Angajat p = new Angajat(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBoolean(4),rs.getString(5));
            returnedList.add(p);
        }
        return returnedList;
    }

    public boolean addAngajat(Angajat p) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(CREATE_NEW_PERSON);
        preparedStatement.setInt(1, p.getIdAngajat());
        preparedStatement.setString(2, p.getNumeAngajat());
        preparedStatement.setString(3, p.getPrenumeAngajat());
        preparedStatement.setBoolean(4, p.getManager());
        preparedStatement.setString(5, p.getTipAngajat());
        return preparedStatement.executeUpdate() > 0;
    }

    public boolean deleteAngajat(int idAngajat) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(DELETE_PERSON);
        preparedStatement.setInt(1, idAngajat);
        return preparedStatement.executeUpdate() > 0;
    }
}


