package database.actions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.client.CustomersDBClient;
import database.setup.CustomerModel;

public class CustomerDBActions extends CustomersDBClient {
	
	/*
    public static CustomerModel getCustomer(String email) {
        CustomerModel customerModel = null;
        String SQL = String.format("SELECT [Id],[Email],[Name], [Gender]," +
                "FROM [dbo].[Customers] where Email = '%s';", email);
        try {
            Statement statement = customersConnection().createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                customerModel = CustomerModel.builder()
                        .Name(rs.getString("Name"))
                        .Email(rs.getString("Email"))
                        .Id(rs.getString("Id"))
                        .DateOfBirth(rs.getString("Gender"))
                        .build();
            }
        } catch (SQLException e) {
        }
        return customerModel;
    }
*/
}
