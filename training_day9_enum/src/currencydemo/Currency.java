package currencydemo;

public enum Currency {
	PENNY(1){
		@Override
		public String color() {
			return "Copper";
		}
	},NICKLE(5) {
		@Override
		public String color() {
			return "Bronz";
		}
	},DIME(10){
		@Override
		public String color() {
			return "Silver";
		}
	},QUARTER(25){
		@Override
		public String color() {
			return "Copper";
		}
	};
	
	private int value;
	
	private Currency(int value) {
		this.value=value;
	}
	
	public String color() {
		return null;
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		String result = null;
		switch (this) {
		case QUARTER:
			result = "4th Biggest coin : QUARTER : "+getValue();
			break;
		case DIME:	
			result = "3rd Biggest coin : DIME : "+getValue();
			break;
		case NICKLE:	
			result = "2nd Biggest coin : NICKLE :"+getValue();
			break;
		case PENNY:	
			result = "smallest coin : PENNY :"+getValue();	
			break;	
		default:
			break;
		}
		return result;
	}

}
