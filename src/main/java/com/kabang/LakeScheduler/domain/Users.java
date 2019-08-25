package com.kabang.LakeScheduler.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    private String empno;
    private Long cnt;
    private String dttm;

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public String getDttm() {
        return dttm;
    }

    public void setDttm(String dttm) {
        this.dttm = dttm;
    }

    @Override
    public String toString() {
        return "Users{" +
                "empno='" + empno + '\'' +
                ", cnt=" + cnt +
                ", dttm='" + dttm + '\'' +
                '}';
    }
}
