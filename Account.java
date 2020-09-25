package practice;

/*
 * author:abhinav
 * date:23/09/2020
 * Model Account Class
 */
public class Account {
protected int accId;
private String accName;
public Account() {}
public Account(int accId, String accName) {
	super();
	this.accId = accId;
	this.accName = accName;
}
public int getAccId() {
	return accId;
}
public void setAccId(int accId) {
	this.accId = accId;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
@Override
public String toString() {
	return "Account [accId=" + accId + ", accName=" + accName + "]";
}

}
