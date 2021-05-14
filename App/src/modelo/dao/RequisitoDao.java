package modelo.dao;

import controlador.CtrlHiloConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dto.RequisitoDto;
import modelo.interfaces.keyword_query;

public class RequisitoDao implements keyword_query<RequisitoDto>{

    @Override
    public boolean mtdInsetar(RequisitoDto requisito_dto) {
        PreparedStatement ps = null;
        Connection conn = CtrlHiloConexion.getConexion();
        String sql = "INSERT INTO tblrequisitos (cmpNombre, cmpMonto) "
                + "VALUES (?, ?); ";        
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, requisito_dto.getCmpNombre());
            ps.setDouble(2, requisito_dto.getCmpCosto());
            int rs = ps.executeUpdate();
            
            if( rs > 0 )
            return true;
            
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean mtdEliminar(RequisitoDto requisito_dto) {
        
        PreparedStatement ps = null;
        Connection conn = CtrlHiloConexion.getConexion();
        String sql = "DELETE FROM tblrequisitos WHERE cmpID = ?; ";
        
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, requisito_dto.getCmpID());
            int rs = ps.executeUpdate();
            
            if( rs > 0)
            return true;
            
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }
        
        return false;
    }

    @Override
    public boolean mtdActualizar(RequisitoDto requisito_dto) {
        
        PreparedStatement ps = null;
        Connection conn = CtrlHiloConexion.getConexion();
        String sql = "UPDATE tblrequisitos "
                + "SET cmpNombre = ?, cmpMonto = ? "
                + "WHERE cmpID = ?; ";
        
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, requisito_dto.getCmpNombre());
            ps.setDouble(2, requisito_dto.getCmpCosto());
            ps.setInt(3, requisito_dto.getCmpID());
            int rs = ps.executeUpdate();
            
            if( rs > 0)
            return true;
            
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }
        
        return false;
    }

    @Override
    public boolean mtdConsultar(RequisitoDto requisito_dto) {
        return false;
    }

    @Override
    public List<RequisitoDto> mtdListar() {
        List<RequisitoDto> requisitos = new ArrayList<>();
        PreparedStatement ps = null;
        Connection conn = CtrlHiloConexion.getConexion();
        String sql = "SELECT * FROM tblrequisitos; ";
        
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() ){
                RequisitoDto requisito = new RequisitoDto();
                requisito.setCmpID( rs.getInt( "cmpID" ) );
                requisito.setCmpNombre(rs.getString( "cmpNombre" ) );
                requisito.setCmpCosto( rs.getDouble( "cmpMonto" ) );
                
                requisitos.add(requisito);
            }
            
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }
        
        return requisitos;
    }

    @Override
    public boolean mtdComprobar(RequisitoDto requisito_dto) {
        return false;
    }
    
}
