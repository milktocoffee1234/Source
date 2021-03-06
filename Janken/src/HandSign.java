
public enum HandSign {
	GU{
		public String judge(HandSign sign){
			if(sign == GU){
				return "あいこ";
			}else if(sign == CHOKI){
				return "かち";
			}else{
				return "まけ";
			}
		}
	},
	CHOKI{
		public String judge(HandSign sign){
			if(sign == CHOKI){
				return "あいこ";
			}else if(sign == PA){
				return "かち";
			}else{
				return "まけ";
			}
		}
	},
	PA{
		public String judge(HandSign sign){
			if(sign == PA){
				return "あいこ";
			}else if(sign == GU){
				return "かち";
			}else{
				return "まけ";
			}
		}
	};
	public static String pon(HandSign playerHand, HandSign computerHand){
		return playerHand.judge(computerHand);
	}
	abstract public String judge(HandSign sign);

}
