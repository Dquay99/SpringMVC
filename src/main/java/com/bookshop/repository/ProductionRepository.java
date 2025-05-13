package com.bookshop.repository;

import com.bookshop.model.ProductionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ProductionModel> getAllProduction() {
        String sql = "select * from production";

        List<ProductionModel> response =  jdbcTemplate.query(sql, new Object[] {} , new RowMapper<ProductionModel>() {


        //maprow : đối chiếu cột = property trong java đại diện cho nó

            @Override
            public ProductionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                ProductionModel productionModel = new ProductionModel();
                productionModel.setId(rs.getInt("idproduction"));
                productionModel.setTitle(rs.getString("title"));
                productionModel.setDescription(rs.getString("description"));
                productionModel.setAuthor(rs.getString("author"));
                productionModel.setPrice(rs.getFloat("price"));

                return productionModel;
            }
        } );

        return response;
    }

}
