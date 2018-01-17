package HallUtils;

public class Hall {

	private int hid;
	private String hname, hprovostname, htelephone;

	public Hall(int hid, String hname, String hprovostname, String htelephone) {
		this.hid = hid;
		this.hname = hname;
		this.hprovostname = hprovostname;
		this.htelephone = htelephone;
	}

	public Hall()
	{
		
	}
	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHprovostname() {
		return hprovostname;
	}

	public void setHprovostname(String hprovostname) {
		this.hprovostname = hprovostname;
	}

	public String getHtelephone() {
		return htelephone;
	}

	public void setHtelephone(String htelephone) {
		this.htelephone = htelephone;
	}
}
