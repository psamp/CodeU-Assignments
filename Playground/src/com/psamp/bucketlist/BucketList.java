package com.psamp.bucketlist;

import java.util.ArrayList;
import java.util.Collection;

public class BucketList {
	
	private Collection<String> bucketList = new ArrayList<String>();

	public BucketList(String first, String...more) {
		
		bucketList.add(first);
		
		for (int i = 0; i < more.length; i++) {
			bucketList.add(more[i]);
		}
		
	}
	
	public String seeGoals() throws BucketListException {
		String mssg = "";
		if (this.getBucketList().size() >= 5) {
			
			mssg = "Bucket list too large! BucketList length is: " + this.getBucketList().size();
			throw new BucketListException(mssg);
			
		} else {
			
			mssg = this.getBucketList().toString();
			System.out.println(mssg);
		}
		
		return mssg;
	}

	private Collection<String> getBucketList() {
		return bucketList;
	}
	
	public void setBucketList(String one, String...more) {
		
		this.getBucketList().add(one);
		
		for (int i = 0; i < more.length; i++) {
			bucketList.add(more[i]);
		}
	}

}
