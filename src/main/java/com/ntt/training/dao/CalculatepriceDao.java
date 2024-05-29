package com.ntt.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ntt.dbcon.ConnectionHolder;
import com.ntt.dbcon.DBConnectionException;
import com.ntt.dbfw.DBFWException;
import com.ntt.dbfw.DBHelper;
import com.ntt.dbfw.ParamMapper;
import com.ntt.training.domain.calculateprice;

public class CalculatepriceDao {
    public int insertPrice(calculateprice cp) throws DAOAppException {
        ConnectionHolder ch = null;
        Connection con = null;
        int res = -1;

        ParamMapper mapper = new ParamMapper() {
            @Override
            public void mapParams(PreparedStatement pStmt) throws SQLException {
                pStmt.setInt(1, cp.getVid());
                pStmt.setInt(2, cp.getPrice());
                pStmt.setInt(3, cp.getDiscountprice());
                pStmt.setInt(4, cp.getDays());
            }
        };

        try {
            ch = ConnectionHolder.getInstance();
            con = ch.getConnection();
            res = DBHelper.executeUpdate(con, SqlMapper.ADD_PRICE, mapper);
        } catch (DBConnectionException e) {
            throw new DAOAppException(e);
        } catch (DBFWException e) {
            throw new DAOAppException(e);
        }

        return res;
    }

    public double calculateTotalPrice(calculateprice cp) {
        double total = cp.getPrice() - (cp.getPrice() * cp.getDiscountprice() / 100) * cp.getDays();
        return total;
    }
}
