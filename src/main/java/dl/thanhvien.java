package dl;

public class thanhvien {
private int id;
private String ma,ten,email,date,dc;
public thanhvien(int id, String ma, String ten, String email, String date, String dc) {
	super();
	this.id = id;
	this.ma = ma;
	this.ten = ten;
	this.email = email;
	this.date = date;
	this.dc = dc;
}
public thanhvien() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMa() {
	return ma;
}
public void setMa(String ma) {
	this.ma = ma;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDc() {
	return dc;
}
public void setDc(String dc) {
	this.dc = dc;
}
@Override
public String toString() {
	return "thanhvien [id=" + id + ", ma=" + ma + ", ten=" + ten + ", email=" + email + ", date=" + date + ", dc=" + dc
			+ "]";
}













}
