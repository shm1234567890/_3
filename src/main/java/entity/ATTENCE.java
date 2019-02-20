package entity;

import java.sql.Date;

/**
 * Created by Administrator on 2019-01-19.
 */
public class ATTENCE {
    private Integer ID;
    private String EMPNAME;
    private String DEPT;
    private Date CHKDATE;
    private Integer STATUS;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEMPNAME() {
        return EMPNAME;
    }

    public void setEMPNAME(String EMPNAME) {
        this.EMPNAME = EMPNAME;
    }

    public String getDEPT() {
        return DEPT;
    }

    public void setDEPT(String DEPT) {
        this.DEPT = DEPT;
    }

    public Date getCHKDATE() {
        return CHKDATE;
    }

    public void setCHKDATE(Date CHKDATE) {
        this.CHKDATE = CHKDATE;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS=STATUS;
    }

}
