package Dao.impl;

import Dao.Attencedao;
import Dao.BaseDao;
import entity.ATTENCE;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019-01-19.
 */
public class Attencedaoimpl extends BaseDao implements Attencedao{
    @Override
    public List<ATTENCE> selectAll() {
        List<ATTENCE> list=new ArrayList<>();
        conn=connection();
        String sql="select EMPNAME,DEPT,CHKDATE,STATUS from ATTENCE";
        try {
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                ATTENCE attence=new ATTENCE();
                attence.setEMPNAME(rs.getString("EMPNAME"));
                attence.setDEPT(rs.getString("DEPT"));
                attence.setCHKDATE(rs.getDate("CHKDATE"));
                attence.setSTATUS(rs.getInt("STATUS"));
                list.add(attence);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


    @Override
    public int insert(ATTENCE attence) {
        conn=connection();
        String sql="insert into ATTENCE(EMPNAME,DEPT,CHKDATE,STATUS)values(?,?,?,?)";
        Object[] obj={attence.getEMPNAME(),attence.getDEPT(),attence.getCHKDATE(),attence.getSTATUS()};
        return exceuteUpdate(sql,obj);
    }
}
