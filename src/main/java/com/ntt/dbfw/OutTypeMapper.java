package com.ntt.dbfw;

import java.sql.CallableStatement;
import java.sql.SQLException;

public interface OutTypeMapper {
void mapOutType(CallableStatement callStmt)throws SQLException;
}
