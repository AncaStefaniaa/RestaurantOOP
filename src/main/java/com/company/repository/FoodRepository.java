package com.company.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.company.modules.Angajat;
import com.company.modules.Meniu;
import com.company.modules.Food;
import com.company.modules.Comanda;

public class FoodRepository {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/restaurant";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD= "root";

    private static final String GET_ALL_FOODS = "SELECT * FROM mancare";
    private static final String CREATE_NEW_FOOD = "INSERT INTO mancare(idPreparat,numePreparat,kcal,price,type,isVegan)" +
            " values (?,?,?,?,?,?)";
    private static final String DELETE_FOOD = "DELETE FROM mancare WHERE idPreparat = ?";


    public static Connection getDbConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
    }

    public List<Food> getFood() throws SQLException{
        List<Food> returnedList = new ArrayList<>();
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(GET_ALL_FOODS);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Food p = new Food(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getString(5), rs.getInt(6));
            returnedList.add(p);
        }
        return returnedList;
    }

    public boolean addFood(Food p) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(CREATE_NEW_FOOD);
        preparedStatement.setInt(1, p.getIdPreparat());
        preparedStatement.setString(2, p.getNumePreparat());
        preparedStatement.setInt(3, (Integer) p.getKcal());
        preparedStatement.setDouble(4, p.getPrice());
        preparedStatement.setString(5, p.getType());
        preparedStatement.setInt(6, p.getIsVegan());
        return preparedStatement.executeUpdate() > 0;
    }

    public boolean deleteFood(int idPreparat) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(DELETE_FOOD);
        preparedStatement.setInt(1, idPreparat);
        return preparedStatement.executeUpdate() > 0;
    }
}


