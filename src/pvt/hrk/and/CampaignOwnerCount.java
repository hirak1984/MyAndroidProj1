package pvt.hrk.and;

public class CampaignOwnerCount {

	private String ownerName;
	private String ownerType;
	private String count;
	
	public CampaignOwnerCount(String ownerName, String ownerType, String count) {
		super();
		this.ownerName = ownerName.trim();
		this.ownerType = ownerType.trim();
		this.count = count.trim();
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return ownerName + "|"+ ownerType + "|"+count;
	}
	
	
}
