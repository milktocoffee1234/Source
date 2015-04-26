package Test2;

public enum MemberCard {
	GOLD{
		@Override
		double reduction(double sum) {
			// TODO Auto-generated method stub
			return sum - (sum * 0.5);
		}
	},
	SILVER{
		@Override
		double reduction(double sum) {
			// TODO Auto-generated method stub
			return sum - (sum * 0.3);
		}
		
	},
	BLONZE{
		@Override
		double reduction(double sum) {
			// TODO Auto-generated method stub
			return sum - (sum * 0.1);
		}
	};
	abstract double reduction(double sum);
}
