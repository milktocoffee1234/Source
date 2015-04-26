
public enum HandSign {
	Goo{
		public String judge(HandSign sign){
			if(Goo == sign){
				return "‚ ‚¢‚±";
			}else if(sign == Pa){
				return "‚©‚¿";
			}else{
				return "‚Ü‚¯";
			}
		}
	},
	Choki{
		public String judge(HandSign sign){
			if(sign == Choki){
				return "‚ ‚¢‚±";
			}else if(sign == Pa){
				return "‚©‚¿";
			}else{
				return "‚Ü‚¯";
			}
		}
	},
	Pa{
		public String judge(HandSign sign){
			if(sign == Pa){
				return "‚ ‚¢‚±";
			}else if(sign == Goo){
				return "‚©‚¿";
			}else{
				return "‚Ü‚¯";
			}
		}
	};
	public static String pon(HandSign playerHand, HandSign computerHand){
		return playerHand.judge(computerHand);
	}
	abstract public String judge(HandSign sign);

}
