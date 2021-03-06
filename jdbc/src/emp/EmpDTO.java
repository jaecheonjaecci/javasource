package emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//테이블 결과와 똑같은 모양으로 작성
//~DTO : Date Transfer object 약자
//~vo : Value object 약자

//넘버 -> 인트로, 바차 -> 스트링, 데이트 -> 유틸데이트

@Setter // setter 메소드를 자동으로 생성
@Getter // getter 메소드를 자동으로 생성
@NoArgsConstructor //default 생성자
@AllArgsConstructor // 인자를 모두 받는 생성자
@ToString

public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	
	/*
	 * public EmpDTO() { super(); // TODO Auto-generated constructor stub } public
	 * EmpDTO(int empno, String ename, String job, int mgr, Date hiredate, int sal,
	 * int comm, int deptno) { super(); this.empno = empno; this.ename = ename;
	 * this.job = job; this.mgr = mgr; this.hiredate = hiredate; this.sal = sal;
	 * this.comm = comm; this.deptno = deptno; } public int getEmpno() { return
	 * empno; } public void setEmpno(int empno) { this.empno = empno; } public
	 * String getEname() { return ename; } public void setEname(String ename) {
	 * this.ename = ename; } public String getJob() { return job; } public void
	 * setJob(String job) { this.job = job; } public int getMgr() { return mgr; }
	 * public void setMgr(int mgr) { this.mgr = mgr; } public Date getHiredate() {
	 * return hiredate; } public void setHiredate(Date hiredate) { this.hiredate =
	 * hiredate; } public int getSal() { return sal; } public void setSal(int sal) {
	 * this.sal = sal; } public int getComm() { return comm; } public void
	 * setComm(int comm) { this.comm = comm; } public int getDeptno() { return
	 * deptno; } public void setDeptno(int deptno) { this.deptno = deptno; }
	 */
	
}
