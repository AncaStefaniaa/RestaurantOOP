package com.company.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.company.modules.Angajat;
import com.company.modules.Meniu;
import com.company.modules.Food;
import com.company.modules.Comanda;

public class ComandaRepository {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/restaurant";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD= "root";

    private static final String GET_ALL_COMENZI = "SELECT * FROM comenzi";
    private static final String CREATE_NEW_COMANDA = "INSERT INTO comenzi(idComanda,preparatComandat)" +
            " values (?,?)";
    private static final String DELETE_COMANDA = "DELETE FROM comenzi WHERE idComanda = ?";


    public static Connection getDbConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
    }

    public List<Comanda> getComenzi() throws SQLException{
        List<Comanda> returnedList = new ArrayList<>();
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(GET_ALL_COMENZI);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Comanda p = new Comanda(rs.getInt(1),rs.getString(2));
            returnedList.add(p);
        }
        return returnedList;
    }

    public boolean addComanda(Comanda p) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(CREATE_NEW_COMANDA);
        preparedStatement.setInt(1, p.getIdComanda());
        preparedStatement.setString(2,p.getPreparatComandat());
        return preparedStatement.executeUpdate() > 0;
    }

    public boolean deleteMeniu(int idComanda) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(DELETE_COMANDA);
        preparedStatement.setInt(1, idComanda);
        return preparedStatement.executeUpdate() > 0;
    }
}


