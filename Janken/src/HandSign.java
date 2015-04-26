
public enum HandSign {
	GU{
		public String judge(HandSign sign){
			if(sign == GU){
				return "‚ ‚¢‚±";
			}else if(sign == CHOKI){
				return "‚©‚¿";
			}else{
				return "‚Ü‚¯";
			}
		}
	},
	CHOKI{
		public String judge(HandSign sign){
			if(sign == CHOKI){
				return "‚ ‚¢‚±";
			}else if(sign == PA){
				return "‚©‚¿";
			}else{
				return "‚Ü‚¯";
			}
		}
	},
	PA{
		public String judge(HandSign sign){
			if(sign == PA){
				return "‚ ‚¢‚±";
			}else if(sign == GU){
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
