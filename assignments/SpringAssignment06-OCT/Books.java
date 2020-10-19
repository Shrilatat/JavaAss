package com.trg;

public class Books {

	int bID;
	String bAuthor, bPublic;

	public int getbID() {
		return bID;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public String getbPublic() {
		return bPublic;
	}

	public void setbPublic(String bPublic) {
		this.bPublic = bPublic;
	}

	@Override
	public String toString() {
		return "Books [bID=" + bID + ", bAuthor=" + bAuthor + ", bPublic=" + bPublic + "]";
	}

}
