package formbuilder.model;

import java.util.List;

public class ItemSelection extends Item {

	public ItemSelection(Integer id, String name, String description, int orderid, Block block, boolean isRequired) {
		super(id, name, description, orderid, block, isRequired);
	}

	private String type;
	private List<Selection> selections;
	private Integer minRequirements; // (ex. Needs to pick at lease 1)

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Selection> getSelections() {
		return selections;
	}

	public void setSelections(List<Selection> selections) {
		this.selections = selections;
	}

	public Integer getMinRequirements() {
		return minRequirements;
	}

	public void setMinRequirements(Integer minRequirements) {
		this.minRequirements = minRequirements;
	}

}
