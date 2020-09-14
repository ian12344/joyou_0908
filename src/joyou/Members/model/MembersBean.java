package joyou.Members.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "memberTest1")
public class MembersBean {
	private int id;
	private String account;
	private String password;
	private String mail;
	private String nickname;

	private String truename;
	private String phone;

//	private int gametypeid;

	public MembersBean() {

	}

	public MembersBean(String account, String password, String mail, String nickname, String truename, String phone) {
		this.account = account;
		this.password = password;
		this.mail = mail;
		this.nickname = nickname;
		this.truename = truename;
		this.phone = phone;

//		this.gametypeid = gametypeid;
	}

//	public MembersBean(int id, String account, String password, String mail, int verified) {
//		this.id = id;
//		this.account = account;
//		this.password = password;
//		this.mail = mail;
//		this.verified = verified;
//	}

	@Id
	@Column(name = "memberID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "memberAcc")
	public String getAccount() {
		return account;
	}

	public void setAccount(String acount) {
		this.account = acount;
	}

	@Column(name = "memberPwd")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "memberMail")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "memberPhone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "memberNickName")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "memberTrueName")
	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

//	@Column(name = "gametypeid")
//	public int getGametypeid() {
//		return gametypeid;
//	}
//
//	public void setGametypeid(int gametypeid) {
//		this.gametypeid = gametypeid;
//	}

}
